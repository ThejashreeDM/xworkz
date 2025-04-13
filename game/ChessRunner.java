package com.xworkz.inheritancemodule.game;

public class ChessRunner
{
    public static void main(String[] args) {
        Game game=new Chess();
        Chess chess=(Chess)game;
        chess.play();

    }
}
