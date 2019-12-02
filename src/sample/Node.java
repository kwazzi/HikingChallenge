package sample;

public class Node {
    int value; int xPos; int yPos;
    int [][] area = new int[3][3];
    int mapTime[][];

    public Node(int mapTime[][]){
        mapTime = mapTime;
        findLittleGrid();
    }

    public void findLittleGrid(){
        if(xPos >= 1 && yPos >= 1) {
            area[0][0] = mapTime[xPos - 1][yPos - 1];
            area[0][1] = mapTime[xPos - 1][yPos];
            area[0][2] = mapTime[xPos - 1][yPos + 1];
            area[1][0] = mapTime[xPos][yPos - 1];
            area[1][1] = mapTime[xPos][yPos];
            area[1][2] = mapTime[xPos][yPos + 1];
            area[2][0] = mapTime[xPos + 1][yPos - 1];
            area[2][1] = mapTime[xPos + 1][yPos];
            area[2][2] = mapTime[xPos + 1][yPos + 1];
        }
        else{
            System.out.println("ahhh");
        }
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
