package com.xworkz.inheritancemodule.paper;

public class NewsPaper extends Paper
{
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
