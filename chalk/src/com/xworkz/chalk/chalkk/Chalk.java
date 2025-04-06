package com.xworkz.chalk.chalkk;

public class Chalk
{

        private int chalkId;
        private String brand;
        private String color;
        private String shape;
        private double lengthInCm;
        private boolean isDustFree;
        private String material;

        public Chalk()
        {

        }

        public void setChalkId(int chalkId)
        {
            this.chalkId = chalkId;
        }
        public int getChalkId()
        {
            return chalkId;
        }

        public void setBrand(String brand)
        {
            this.brand = brand;
        }
        public String getBrand()
        {
            return brand;
        }

        public void setColor(String color)
        {
            this.color = color;
        }
        public String getColor()
        {
            return color;
        }

        public void setShape(String shape)
        {
            this.shape = shape;
        }
        public String getShape()
        {
            return shape;
        }

        public void setLengthInCm(double lengthInCm)
        {
            this.lengthInCm = lengthInCm;
        }
        public double getLengthInCm()
        {
            return lengthInCm;
        }

        public void setIsDustFree(boolean isDustFree)
        {
            this.isDustFree = isDustFree;
        }
        public boolean getIsDustFree()
        {
            return isDustFree;
        }

        public void setMaterial(String material)
        {
            this.material = material;
        }
        public String getMaterial()
        {
            return material;
        }
    }

