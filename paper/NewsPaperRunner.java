package com.xworkz.inheritancemodule.paper;

public class NewsPaperRunner
{
    public static void main(String args[])
    {
        Paper newsPapaer=new NewsPaper();
        NewsPaper vijayaKarnataka=(NewsPaper)newsPapaer;
        vijayaKarnataka.read();
    }
}
