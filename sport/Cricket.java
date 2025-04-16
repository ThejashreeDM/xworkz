package com.xworkz.inheritancemodule.sport;

public class Cricket extends Sport
{
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
