package com.xworkz.posterapp.poster;

public class Poster {
    private String advertizingCompany;
    private String printingCompany;
    private String size;
    private String color;
    private int noOfCopies;


    public Poster()
    {

    }
    public void setAdvertizingCompany(String name)
    {
        advertizingCompany=name;
    }
    public String getAdvertizingCompany()
    {
        return advertizingCompany;
    }
    public void setPrintingCompany(String name)
    {
        printingCompany=name;
    }
    public String getPrintingCompany()
    {
        return printingCompany;
    }
    public void setSize(String size)
    {
        this.size=size;
    }
    public String getSize()
    {
        return size;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public void setNoOfCopies(int copies)
    {
        noOfCopies=copies;
    }
    public int getNoOfCopies()
    {
        return noOfCopies;
    }
}
