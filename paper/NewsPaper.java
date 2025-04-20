package com.xworkz.inheritancemodule.paper;

public class NewsPaper extends Paper
{
    @Override
    public void read()
    {
        System.out.println("NewsPaper purpose is to read");
    }
    @Override
    public void create() {
        System.out.println("Creating the Newspaper from pulp.");
    }
    @Override
    public void print() {
        System.out.println("Printing text or images on the Newspaper.");
    }
    @Override
    public void cut() {
        System.out.println("Cutting the Newspaper into desired shapes or sizes.");
    }
    @Override
    public void recycle() {
        System.out.println("Recycling the Newspaper for reuse.");
    }
    @Override
    public void store() {
        System.out.println("Storing the Newspaper in a safe place.");
    }
    public void printHeadlines() {
        System.out.println("Printing the headlines on the front page.");
    }

    public void distribute() {
        System.out.println("Distributing the newspaper to subscribers.");
    }

    public void updateContent() {
        System.out.println("Updating the content with the latest news.");
    }

    public void featureArticles() {
        System.out.println("Including feature articles in the newspaper.");
    }

    public void publishEdition() {
        System.out.println("Publishing the daily edition of the newspaper.");
    }
}
