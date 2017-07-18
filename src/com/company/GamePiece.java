package com.company;

/**
 * Created by braxtonhathaway on 7/18/17.
 */
public class GamePiece {
    public int X;
    public int Y;
    Boolean frozen;
    String color;


    public GamePiece() {
        X = 0;
        Y = 0;
        frozen = false;
        color = "pick a color";
    }

    public void move(int x, int y) {
        if(frozen) {
            System.out.println("failed to move cuz ur frozen");
            return;
        }
        X = x;
        Y = y;
        System.out.println("moved to " + X + " xcord");
        System.out.println("moved to " + Y + " ycord");
    }

    public void freeze() {
        frozen = true;
        System.out.println("is frozen");
    }

    public void unfreeze() {
        frozen = false;
        System.out.println("is not frozen");
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public boolean getFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }
}


