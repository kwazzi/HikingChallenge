package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HikingMap {
    char map [][] = new char[5][5];
    int mapTime[][] = new int[5][5];
    int totalTime;


    public HikingMap() throws FileNotFoundException {
        File file = new File("C:\\Users\\stu41471\\IdeaProjects\\MapPath\\src\\hiking_challenge.dat");
        readFile(file);
        readMap(map);
    }

    public void readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        for(int i = 0; i < 24; i ++){
            String tempLine = scanner.nextLine();
            String[] options = tempLine.split("[({ , })]");
            for(int j = 0; j < options.length; j ++){
                System.out.println(options[j]);
            }
        }
    }

    public void readMap(char thisMap [][]) throws FileNotFoundException {

        for(int i = 0; i < map.length; i ++){
            for(int j = 0; j < map.length; j ++){
                map[i][j] = thisMap[i][j];
                char temp = map[i][j];
                mapTime[i][j] = checkTime(temp);
                System.out.println(map[i][j] + " " + mapTime[i][j]);
            }
        }
    }

    public int checkTime(char option){
        int optionTime;
        if(option == 'T'){
            optionTime = 3;
        }
        else if(option == 'W'){
            optionTime = 8;
        }

        else if(option == 'O'){
            optionTime = 12;
        }

        else if(option == 'S'){
            optionTime = 20;
        }

        else{
            System.out.println("Invalid Input: please submit something else");
            return 0;
        }
        return optionTime;
    }

}
