package com.xworkz.shirtfactory.shirt;

public class Shirt
{
    private int shirtId;
    private String brandName;
    private String color;
    private String size;
    private boolean isFullArm;
    private boolean isPlain;
    private boolean isPocketAvailable;

    public Shirt()
    {

    }

    public void setShirtId(int shirtId) {
        this.shirtId = shirtId;
    }

    public int getShirtId() {
        return shirtId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setIsFullArm(boolean fullArm) {
        isFullArm = fullArm;
    }

    public boolean getIsFullArm() {
        return isFullArm;
    }

    public void setIsPlain(boolean plain) {
        isPlain = plain;
    }
    public boolean getIsPlain()
    {
        return isPlain;
    }

    public void setIsPocketAvailable(boolean pocketAvailable) {

        isPocketAvailable=pocketAvailable;
    }
     public boolean getIsPocketAvailable()
     {
         return isPocketAvailable;

     }
}
