package com.xworkz.teamscalendar.invitee;

public class Invitee
{
    private int inviteeId;
    private String name;
    private String email;
    private long phoneNumber;

    public int getInviteeId()
    {
        return inviteeId;
    }
    public void setInviteeId(int id)
    {
        inviteeId=id;
    }


    public String getName()
    {
        return name;

    }
    public void setName(String name)
    {
        this.name=name;
    }


    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }


    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

  /*  public void getInviteeInfo()
    {
        System.out.println("Invitee Id : "+getInviteeId());
        System.out.println("Invitee Name : "+getName());
        System.out.println("Invitee Email : "+getEmail());
        System.out.println("Invitee Phone Number : "+getPhoneNumber());


    }*/
}
