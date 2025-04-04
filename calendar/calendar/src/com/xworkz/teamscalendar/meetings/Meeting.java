package com.xworkz.teamscalendar.meetings;
import com.xworkz.teamscalendar.invitee.Invitee;
public class Meeting
{
    public String title;
    public String date;
    public String startTime;
    public String endTime;
    public Invitee invitees[];
    public void getMeetingInfo()
    {
        System.out.println("Meeting Title : "+title);
        System.out.println("Meeting date : "+date);
        System.out.println("Meeting Start Time : "+startTime);
        System.out.println("Meeting End Time : "+endTime);
        System.out.println("Meeting Invitees : ");
        for(Invitee invitee:invitees)
           // invitee.getInviteeInfo();
        {
            System.out.println("Invitee Id : "+invitee.getInviteeId());
            System.out.println("Invitee Name : "+invitee.getName());
            System.out.println("Invitee Email : "+invitee.getEmail());
            System.out.println("Invitee Phone Number : "+invitee.getPhoneNumber());
        }
    }
}
