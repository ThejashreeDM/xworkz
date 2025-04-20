package com.xworkz.inheritancemodule.movie;

public class Milana extends Movie
{
    @Override
    public void entertainment()
    {
        System.out.println("Milana Movie provides entertainment");
    }
    @Override
    public void start() {
        System.out.println("Starting the milana movie");
    }
    @Override
    public void play() {
        System.out.println("Playing the milana movie");
    }
    @Override
    public void pause() {
        System.out.println("Pausing the milana movie");
    }
    @Override
    public void resume() {
        System.out.println("Resuming the milana movie");
    }
    @Override
    public void stop() {
        System.out.println("Stopping the milana movie.");
    }
    public void introduceCharacters() {
        System.out.println("Introducing the main characters in Milana.");
    }

    public void setLocation() {
        System.out.println("Setting the location for the story of Milana.");
    }

    public void playMusic() {
        System.out.println("Playing background music from the movie Milana.");
    }

    public void createSuspense() {
        System.out.println("Building suspense during a critical scene in Milana.");
    }

    public void concludeStory() {
        System.out.println("Concluding the emotional journey of the characters in Milana.");
    }
}
