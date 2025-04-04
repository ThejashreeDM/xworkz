package com.xworkz.teamscalendar;
import com.xworkz.teamscalendar.calender.Calender;
import com.xworkz.teamscalendar.constants.Days;
import com.xworkz.teamscalendar.meetings.Meeting;
import com.xworkz.teamscalendar.invitee.Invitee;
public class CalenderRunner
{
    public static void main(String args[])
    {
        Calender calender=new Calender();
        calender.day=Days.Monday;

        Meeting meetings[]=new Meeting[2];

        Meeting meeting1=new Meeting();
        meeting1.title="Login Feature Development";
        meeting1.date="03-04-2025";
        meeting1.startTime="9:00 am";
        meeting1.endTime="10:00 am";


        Invitee invitees[]=new Invitee[2];

        Invitee invitee1=new Invitee();
        invitee1.setInviteeId(1);
        invitee1.setName("Ram");
        invitee1.setEmail("Ram@123");
        invitee1.setPhoneNumber(1234567890L);

        Invitee invitee2 =new Invitee();
        invitee2.setInviteeId(2);
        invitee2.setName("Bheem");
        invitee2.setEmail("Bheem@123");
        invitee2.setPhoneNumber(1452367890L);

        invitees[0]= invitee1 ;
        invitees[1]= invitee2 ;

        meeting1.invitees=invitees;

        meetings[0]=meeting1;

        Meeting meeting2=new Meeting();
        meeting2.title="Payment Feature Development";
        meeting2.date="04-04-2025";
        meeting2.startTime="11:00 am";
        meeting2.endTime="12:00 pm";


        Invitee inviteees[]=new Invitee[2];


        invitee1=new Invitee();
        invitee1.setInviteeId(1);
        invitee1.setName("Ram");
        invitee1.setEmail("Ram@123");
        invitee1.setPhoneNumber(1234567890L);


        invitee2=new Invitee();
        invitee2.setInviteeId(3);
        invitee2.setName("Raghav");
        invitee2.setEmail("Raghav@123");
        invitee2.setPhoneNumber(4567890123L);

        inviteees[0]=invitee1;
        inviteees[1]=invitee2;

        meeting2.invitees=inviteees;

        meetings[1]=meeting2;

        calender.meetings=meetings;


        calender.getCalenderInfo();




    }
}
