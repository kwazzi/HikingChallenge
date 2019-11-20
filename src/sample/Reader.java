package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    int startX; int startY; int endX; int endY;

    public Reader() throws FileNotFoundException {
        File file = new File("C:\\Users\\stu41471\\IdeaProjects\\MapPath\\src\\hiking_challenge.dat");
        readFile(file);
        System.out.println(startX + "," + startY);
        System.out.println(endX + "," + endY);

    }

    public void readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        for(int i = 0; i < 24; i ++){
            String tempLine = scanner.nextLine();
            String[] options = tempLine.split("[({ , })]");
            for(int j = 0; j < options.length; j ++){
                if(i == 0 || i == 6 || i == 12 || i == 18) {
                    startX = Integer.parseInt(options[2]);
                    startY = Integer.parseInt(options[3]);
                    endX = Integer.parseInt(options[6]);
                    endY = Integer.parseInt(options[7]);
                    HikingMap temp = new HikingMap(startX, startY, endX, endY);
                }
                else{
                    System.out.println(options[j]);
                    System.out.println("this is a path");
                }

            }
        }
    }
}
