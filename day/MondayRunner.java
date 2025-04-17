package com.xworkz.inheritancemodule.day;

public class MondayRunner
{
    public static void main(String[] args) {
        Day day=new Day();
        Day type=new Monday();
        Monday monday=new Monday();
        day.identifyDay();
        day.endDay();
        day.completeTasks();
        day.startDay();
        day.planSchedule();
        type.identifyDay();
        type.endDay();
        type.completeTasks();
        type.startDay();
        type.planSchedule();
        monday.attendMeeting();
        monday.checkEmails();
        monday.drinkExtraCoffee();
        monday.startWorkWeek();
        monday.updateTeam();
    }
}
