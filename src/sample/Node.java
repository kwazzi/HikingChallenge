package sample;

public class Node {
    int value; int xPos; int yPos;
    int [][] area = new int[3][3];
    int mapTime[][];

    public Node(int mapTime[][]){
        mapTime = mapTime;
    }

    public void findLittleGrid(){

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int[][] getMapTime() {
        return mapTime;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int[][] getArea() {
        return area;
    }

    public void setMapTime(int[][] mapTime) {
        this.mapTime = mapTime;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setArea(int[][] area) {
        this.area = area;
    }
}
