package com.company;

public class Main {

    public static void main(String[] args) {

        GamePiece playerOne = new GamePiece();

        playerOne.freeze();
        playerOne.unfreeze();
        playerOne.move(1, 1);
        playerOne.freeze();
        playerOne.move(1,1);
    }
}


