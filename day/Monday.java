package com.xworkz.inheritancemodule.day;

public class Monday extends Day
{
    @Override
    public  void identifyDay()
    {
        System.out.println("There are 1 Monday in a week");
    }

    @Override
    public void startDay() {
        System.out.println("The Monday has started.");
    }

    @Override
    public void planSchedule() {
        System.out.println("Planning the Monday's schedule.");
    }

    @Override
    public void takeRest() {
        System.out.println("Taking a short break during the Monday.");
    }

    @Override
    public void completeTasks() {
        System.out.println("Completing Monday's tasks .");
    }

    @Override
    public void endDay() {
        System.out.println("The Monday is ending.");
    }
    public void attendMeeting() {
        System.out.println("Attending Monday morning meeting.");
    }

    public void startWorkWeek() {
        System.out.println("Starting a new work week on Monday.");
    }

    public void checkEmails() {
        System.out.println("Checking emails on Monday.");
    }

    public void updateTeam() {
        System.out.println("Updating the team on Monday's progress.");
    }

    public void drinkExtraCoffee() {
        System.out.println("Drinking extra coffee to beat the Monday blues.");
    }
}
