package com.xworkz.teamscalendar.calender;
import com.xworkz.teamscalendar.constants.Days;
import com.xworkz.teamscalendar.meetings.Meeting;
public class Calender
{
    public Days day;
    public
    Meeting meetings[];
    public void getCalenderInfo()
    {
        System.out.println("Meeting Day : "+day);
        for(Meeting meeting:meetings)
            meeting.getMeetingInfo();
    }
}
