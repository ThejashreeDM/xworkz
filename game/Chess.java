package com.xworkz.inheritancemodule.game;

public class Chess extends Game
{
    public void setBoard() {
        System.out.println("Setting up the chessboard.");
    }

    public void movePiece() {
        System.out.println("Moving a piece on the chessboard.");
    }

    public void check() {
        System.out.println("The opponent's king is in check.");
    }

    public void checkmate() {
        System.out.println("The game is over, checkmate.");
    }

    public void offerDraw() {
        System.out.println("Offering a draw in the chess game.");
    }
}
