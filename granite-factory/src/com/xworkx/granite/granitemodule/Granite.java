package com.xworkx.granite.granitemodule;

public class Granite
{
    private int graniteId;
    private String brandName;
    private double price;
    private String size;
    private String ownerName;
    private String style;
    private String color;

    public Granite()
    {

    }

    public void setGraniteId(int id)
    {
        graniteId=id;
    }
    public int getGraniteId()
    {
        return graniteId;
    }

    public void setBrandName(String name)
    {
        brandName=name;
    }
    public String getBrandName()
    {
        return brandName;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }

    public void setSize(String size)
    {
        this.size=size;
    }
    public String getSize()
    {
        return size;
    }

    public void setOwnerName(String ownerName)
    {
          this.ownerName=ownerName;
    }
    public String getOwnerName()
    {
        return ownerName;
    }

    public void setStyle(String style)
    {
        this.style=style;
    }
    public String getStyle()
    {
        return style;
    }

    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
}
