package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HikingMap {
    char map [][] = new char[5][5];
    int mapTime[][] = new int[5][5];
    int totalTime;
    int startX; int startY; int endX; int endY;
    ArrayList<Node> nodes = new ArrayList<>();



    public HikingMap() throws FileNotFoundException {
        readMap(map);

    }

    public void readMap(char thisMap [][]) throws FileNotFoundException {
        // this just fills in the current map using the data from the file
        for(int i = 0; i < map.length; i ++){
            for(int j = 0; j < map.length; j ++){
                map[i][j] = thisMap[i][j];
            }
        }
    }

    public void findPath(){
        // this finds a 3x3 grid for each node, each node in the grid is a place the hiker can move
        for(int i = 0; i < nodes.size(); i ++){
            nodes.get(i).findLittleGrid();
        }
        System.out.println("Your time to beat is " + getTotalTime() + " minutes.");
    }

    public int checkTime(char option, int xPos, int yPos){
        Node temp = new Node();
        temp.setxPos(xPos);
        temp.setyPos(yPos);


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
        temp.setValue(optionTime);
        //temp.setMapTime(mapTime);
        //temp.findLittleGrid();
        nodes.add(temp);
        return optionTime;
    }

    public char[][] getMap() {
        return map;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int[][] getMapTime() {
        return mapTime;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void setMap(char[][] map) {
        this.map = map;
    }

    public void setMapTime(int[][] mapTime) {
        this.mapTime = mapTime;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }
}
