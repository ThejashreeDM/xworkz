package com.xworkz.watertankk.watertankmodule;

public class WaterTank
{
    private int tankId;
        private String brandName;
        private double capacity; // in liters
        private String color;
        private String material;
        private double price;
        private String shape;
        private String ownerName;

        public WaterTank()
        {
            // Default constructor
        }

        public void setTankId(int id)
        {
            tankId = id;
        }
        public int getTankId()
        {
            return tankId;
        }

        public void setBrandName(String name)
        {
            brandName = name;
        }
        public String getBrandName()
        {
            return brandName;
        }

        public void setCapacity(double capacity)
        {
            this.capacity = capacity;
        }
        public double getCapacity()
        {
            return capacity;
        }

        public void setColor(String color)
        {
            this.color = color;
        }
        public String getColor()
        {
            return color;
        }

        public void setMaterial(String material)
        {
            this.material = material;
        }
        public String getMaterial()
        {
            return material;
        }

        public void setPrice(double price)
        {
            this.price = price;
        }
        public double getPrice()
        {
            return price;
        }

        public void setShape(String shape)
        {
            this.shape = shape;
        }
        public String getShape()
        {
            return shape;
        }

        public void setOwnerName(String ownerName)
        {
            this.ownerName = ownerName;
        }
        public String getOwnerName()
        {
            return ownerName;
        }
    }


