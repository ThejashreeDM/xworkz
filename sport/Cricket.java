package com.xworkz.inheritancemodule.sport;

public class Cricket extends Sport
{
    @Override
    public void exercise()
    {
        System.out.println("Cricket is a form of exercise");
    }
    @Override
    public void startGame() {
        System.out.println("Starting the Cricket game");
    }
    @Override
    public void play() {
        System.out.println("Playing the Cricket with rules and strategies");
    }
    @Override
    public void score() {
        System.out.println("Scoring points or runs in the Cricket");
    }
    @Override
    public void pauseGame() {
        System.out.println("Pausing the Cricket game for a break or interval");
    }
    @Override
    public void endGame() {
        System.out.println("Ending the Cricket game after the final whistle or point");
    }
    public void toss() {
        System.out.println("Tossing the coin to decide batting or fielding.");
    }

    public void bowl() {
        System.out.println("Bowling the ball towards the batsman.");
    }

    public void bat() {
        System.out.println("Batting to score runs in the match.");
    }

    public void field() {
        System.out.println("Fielding to stop runs and get players out.");
    }

    public void celebrateWicket() {
        System.out.println("Celebrating the dismissal of a batsman.");
    }
}
