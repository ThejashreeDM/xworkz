package com.xworkz.inheritancemodule.series;

public class SeriesRunner
{
    public static void main(String args[])
    {
        Series series = new Series();
        Series emotionalSeries = new QueenOfTears();
        QueenOfTears queen = new QueenOfTears();
        series.entertainment();
        series.start();
        series.buildPlot();
        series.introduceCharacters();
        series.createSuspense();
        series.conclude();
        emotionalSeries.entertainment();
        emotionalSeries.start();
        emotionalSeries.buildPlot();
        emotionalSeries.introduceCharacters();
        emotionalSeries.createSuspense();
        emotionalSeries.conclude();
        queen.portrayEmotions();
        queen.showCulturalContext();
        queen.focusOnDrama();
        queen.showcaseRomance();
        queen.deliverTearjerkerScenes();
    }
}
