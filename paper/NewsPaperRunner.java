package com.xworkz.inheritancemodule.paper;

public class NewsPaperRunner
{
    public static void main(String args[])
    {
        Paper paper = new Paper();
        Paper newsPaperPaper = new NewsPaper();
        NewsPaper newspaper = new NewsPaper();

        paper.read();
        paper.create();
        paper.print();
        paper.cut();
        paper.recycle();
        paper.store();
        newsPaperPaper.read();
        newsPaperPaper.create();
        newsPaperPaper.print();
        newsPaperPaper.cut();
        newsPaperPaper.recycle();
        newsPaperPaper.store();
        newspaper.read();
        newspaper.create();
        newspaper.print();
        newspaper.cut();
        newspaper.recycle();
        newspaper.store();
        newspaper.printHeadlines();
        newspaper.distribute();
        newspaper.updateContent();
        newspaper.featureArticles();
        newspaper.publishEdition();
    }
}
