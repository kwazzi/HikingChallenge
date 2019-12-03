package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    ArrayList<HikingMap> hikingMaps;

    public Reader() throws FileNotFoundException {
        File file = new File("C:\\Users\\stu41471\\IdeaProjects\\MapPath\\src\\hiking_challenge.dat");
        readFile(file);
        findPaths();
        System.out.println("ahaha");
    }

    public void readFile(File file) throws FileNotFoundException {
        int map [][] = null;
        hikingMaps = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        HikingMap temp = null;
        int count = 0;
        // going through each line and splitting it using a regular expression
        for(int i = 0; i < 24; i ++){
            String tempLine = scanner.nextLine();
            String[] options = tempLine.split("[({ , })]");
            // setting the start and end points //
            for(int j = 0; j < options.length; j ++){
                // this is for each map when it starts
                if(i == 0 || i == 6 || i == 12 || i == 18) {
                    // this closes out all the map except for the first one
                    if(i != 0){
                        // sets the map data for each map
                        temp.setMapTime(map);
                        // for each node in the map, it sets the map to it
                        for(int l = 0; l < temp.getNodes().size(); l ++){
                            temp.getNodes().get(l).setMapTime(map);
                        }
                    }
                    count = 0;
                    map = new int[5][5];
                    temp = new HikingMap();
                    // getting the coordinates
                    temp.setStartX(Integer.parseInt(options[2]));
                    temp.setStartY(Integer.parseInt(options[3]));
                    temp.setEndX(Integer.parseInt(options[6]));
                    temp.setEndY(Integer.parseInt(options[7]));
                    hikingMaps.add(temp);
                    break;
                }
                // converting each line to their time value
                // its for each line that only has letters
                else{
                    char chars[] = options[j].toCharArray();
                    for(int k = 0; k < chars.length; k ++) {
                        map[count][k] = temp.checkTime(chars[k],count, k);
                    }
                    // this is for the last one to close it out
                    if(i == 23){
                        temp.setMapTime(map);
                    }
                    count ++;
                }
            }
        }
    }

    public void findPaths(){
        for(int i = 0; i < hikingMaps.size(); i ++){
            hikingMaps.get(i).findPath();
        }

    }
}
