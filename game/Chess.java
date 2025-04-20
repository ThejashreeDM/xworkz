package com.xworkz.inheritancemodule.game;

public class Chess extends Game
{
    @Override
    public  void play()
    {
        System.out.println("Chess is to paly");
    }
    @Override
    public void start() {
        System.out.println("Starting the chess game.");
    }
    @Override
    public void pause() {
        System.out.println("Pausing the chess game.");
    }
    @Override
    public void resume() {
        System.out.println("Resuming the chess game.");
    }
    @Override
    public void end() {
        System.out.println("Ending the chess game.");
    }
    @Override
    public void score() {
        System.out.println("Displaying the chess game score.");
    }
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
