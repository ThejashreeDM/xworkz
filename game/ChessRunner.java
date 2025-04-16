package com.xworkz.inheritancemodule.game;

public class ChessRunner
{
    public static void main(String[] args) {
        Game game = new Game();
        Game boardGame = new Chess();
        Chess chess = new Chess();
        game.start();
        game.pause();
        game.end();
        game.score();
        game.resume();
        boardGame.start();
        boardGame.pause();
        boardGame.end();
        boardGame.score();
        boardGame.resume();
        chess.movePiece();
        chess.check();
        chess.checkmate();
        chess.offerDraw();
        chess.setBoard();
    }
}
