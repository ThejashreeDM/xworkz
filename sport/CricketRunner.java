package com.xworkz.inheritancemodule.sport;

public class CricketRunner {
    public static void main(String args[])
    {
        Sport sport = new Sport();
        Sport cricket = new Cricket();
        Cricket cricketGame = new Cricket();
        sport.exercise();
        sport.startGame();
        sport.play();
        sport.score();
        sport.pauseGame();
        sport.endGame();
        cricket.exercise();
        cricket.startGame();
        cricket.play();
        cricket.score();
        cricket.pauseGame();
        cricket.endGame();
        cricketGame.exercise();
        cricketGame.startGame();
        cricketGame.play();
        cricketGame.score();
        cricketGame.pauseGame();
        cricketGame.endGame();
        cricketGame.toss();
        cricketGame.bowl();
        cricketGame.bat();
        cricketGame.field();
        cricketGame.celebrateWicket();
    }
}
