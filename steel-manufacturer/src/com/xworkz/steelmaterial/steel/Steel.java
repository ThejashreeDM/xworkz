package com.xworkz.steelmaterial.steel;

public class Steel {
    private int steelId;
    private String brandName;
    private String grade;
    private double price;
    private double thickness;
    private boolean isIsiMarked;
    private String ownerName;

    public Steel()
    {

    }
    public void setSteelId(int steelId)
    {
        this.steelId=steelId;
    }
    public int getSteelId()
    {
        return steelId;

    }
    public void setBrandName(String brandName)
    {
        this.brandName=brandName;
    }
    public String getBrandName()
    {
        return brandName;
    }
    public void setGrade(String grade)
    {
        this.grade=grade;
    }
    public String getGrade()
    {
        return grade;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public void  setThickness(double thickness)
    {
        this.thickness=thickness;
    }
 public double getThickness()
 {
     return thickness;
 }
 public void setIsIsiMarked(boolean isIsiMarked)
 {
     this.isIsiMarked=isIsiMarked;
 }
 public boolean getIsIsiMarked()
 {
     return isIsiMarked;
 }
 public void setOwnerName(String ownerName)
 {
     this.ownerName=ownerName;
 }
 public String getOwnerName()
 {
     return ownerName;
 }



}
