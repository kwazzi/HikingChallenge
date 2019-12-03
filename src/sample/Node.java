package sample;

public class Node {
    int value; int xPos; int yPos;
    int [][] area = new int[3][3];
    int mapTime[][];

    public Node(){

    }

    public void findLittleGrid(){
        try {
            if (xPos >= 1 && yPos >= 1 && xPos <= 3 && yPos <= 3) {
                for (int i = 0; i < area.length; i++) {
                    for (int j = 0; j < area.length; j++) {
                        int a = xPos - 1 + 1;
                        int b = j + 1;
                        area[i][j] = mapTime[a][b];
                    }
                }
                setArea(this.area);
            } else {
                System.out.println("nope [" + xPos + "," + yPos + "]");
            }
        }
        catch (NullPointerException e){
            System.out.println("[" + xPos + "," + yPos + "]");
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
