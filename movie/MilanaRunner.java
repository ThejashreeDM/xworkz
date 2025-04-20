package com.xworkz.inheritancemodule.movie;

public class MilanaRunner
{
    public static void main(String args[])
    {
        Movie movie = new Movie();
        Movie milanaMovie = new Milana();
        Milana milana = new Milana();
        movie.play();
        movie.pause();
        movie.stop();
        movie.start();
        movie.resume();
        milanaMovie.play();
        milanaMovie.pause();
        milanaMovie.stop();
        milanaMovie.start();
        milanaMovie.resume();
        milana.play();
        milana.pause();
        milana.stop();
        milana.start();
        milana.resume();
        milana.concludeStory();
        milana.createSuspense();
        milana.introduceCharacters();
        milana.playMusic();
        milana.setLocation();
    }
}
