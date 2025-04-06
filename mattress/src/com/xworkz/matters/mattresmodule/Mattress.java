package com.xworkz.matters.mattresmodule;

public class Mattress
{

        private int mattressId;
        private String brand;
        private String size;
        private String material;
        private double price;
        private int thicknessInInches;
        private boolean isOrthopedic;

        public Mattress()
        {

        }

        public void setMattressId(int mattressId)
        {
            this.mattressId = mattressId;
        }
        public int getMattressId()
        {
            return mattressId;
        }

        public void setBrand(String brand)
        {
            this.brand = brand;
        }
        public String getBrand()
        {
            return brand;
        }

        public void setSize(String size)
        {
            this.size = size;
        }
        public String getSize()
        {
            return size;
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

        public void setThicknessInInches(int thickness)
        {
            this.thicknessInInches = thickness;
        }
        public int getThicknessInInches()
        {
            return thicknessInInches;
        }

        public void setIsOrthopedic(boolean isOrthopedic)
        {
            this.isOrthopedic = isOrthopedic;
        }
        public boolean getIsOrthopedic()
        {
            return isOrthopedic;
        }
    }

