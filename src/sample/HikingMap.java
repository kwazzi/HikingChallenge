package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HikingMap {
    char map [][] = new char[5][5];
    int mapTime[][] = new int[5][5];
    int totalTime;



    public HikingMap(int startX, int startY, int endX, int endY) throws FileNotFoundException {
        readMap(map);
    }

    public void readMap(char thisMap [][]) throws FileNotFoundException {

        for(int i = 0; i < map.length; i ++){
            for(int j = 0; j < map.length; j ++){
                map[i][j] = thisMap[i][j];
                char temp = map[i][j];
                mapTime[i][j] = checkTime(temp);
                //System.out.println(map[i][j] + " " + mapTime[i][j]);
            }
        }
    }

    public int checkTime(char option){
        int optionTime = 0;
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

        return optionTime;
    }

}
