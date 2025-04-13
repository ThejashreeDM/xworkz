package com.xworkz.inheritancemodule.series;

public class SeriesRunner
{
    public static void main(String args[])
    {
        Series series1=new QueenOfTears();
        QueenOfTears season1=(QueenOfTears)series1;
        season1.entertainment();
    }
}
