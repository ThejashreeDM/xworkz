package com.xworkz.inheritancemodule.season;

class Summar extends Season
{
    @Override
    public void variations()
    {
        System.out.println("Summar Season causes variation in environment");
    }
    @Override
    public void start() {
        System.out.println("The Summar season is starting.");
    }
    @Override
    public void end() {
        System.out.println("The Summar season is coming to an end.");
    }
    @Override
    public void changeWeather() {
        System.out.println("The weather is changing according to the Summar season.");
    }
    @Override
    public void bringFestivities() {
        System.out.println("The Summar season brings various festivities and events.");
    }
    @Override
    public void affectAgriculture() {
        System.out.println("The Summar season affects the agricultural cycle.");
    }

    public void increaseTemperature() {
        System.out.println("The temperature is increasing during summer.");
    }

    public void provideSunshine() {
        System.out.println("Summer provides long hours of sunshine.");
    }

    public void promoteOutdoorActivities() {
        System.out.println("Summer promotes outdoor activities like swimming and hiking.");
    }

    public void causeDrought() {
        System.out.println("Summer can cause droughts due to prolonged heat.");
    }

    public void offerCoolingSolutions() {
        System.out.println("In summer, people use air conditioning and fans to stay cool.");
    }
}