package com.xworkz.ladderr.ladermodule;

public class Ladder
{

        private int ladderId;
        private String brand;
        private double heightInFeet;
        private String material;
        private int steps;
        private boolean isFoldable;
        private String ownerName;

        public Ladder()
        {

        }

        public void setLadderId(int ladderId)
        {
            this.ladderId = ladderId;
        }
        public int getLadderId()
        {
            return ladderId;
        }

        public void setBrand(String brand)
        {
            this.brand = brand;
        }
        public String getBrand()
        {
            return brand;
        }

        public void setHeightInFeet(double heightInFeet)
        {
            this.heightInFeet = heightInFeet;
        }
        public double getHeightInFeet()
        {
            return heightInFeet;
        }

        public void setMaterial(String material)
        {
            this.material = material;
        }
        public String getMaterial()
        {
            return material;
        }

        public void setSteps(int steps)
        {
            this.steps = steps;
        }
        public int getSteps()
        {
            return steps;
        }

        public void setIsFoldable(boolean isFoldable)
        {
            this.isFoldable = isFoldable;
        }
        public boolean getIsFoldable()
        {
            return isFoldable;
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


