package com.xworkz.crop.cropmodule;

public class Crop
{

        private int cropId;
        private String cropName;
        private String season;
        private String soilType;
        private double pricePerKg;
        private int durationInDays;
        private String farmerName;

        public Crop()
        {

        }

        public void setCropId(int cropId)
        {
            this.cropId = cropId;
        }
        public int getCropId()
        {
            return cropId;
        }

        public void setCropName(String cropName)
        {
            this.cropName = cropName;
        }
        public String getCropName()
        {
            return cropName;
        }

        public void setSeason(String season)
        {
            this.season = season;
        }
        public String getSeason()
        {
            return season;
        }

        public void setSoilType(String soilType)
        {
            this.soilType = soilType;
        }
        public String getSoilType()
        {
            return soilType;
        }

        public void setPricePerKg(double price)
        {
            this.pricePerKg = price;
        }
        public double getPricePerKg()
        {
            return pricePerKg;
        }

        public void setDurationInDays(int duration)
        {
            this.durationInDays = duration;
        }
        public int getDurationInDays()
        {
            return durationInDays;
        }

        public void setFarmerName(String farmerName)
        {
            this.farmerName = farmerName;
        }
        public String getFarmerName()
        {
            return farmerName;
        }
    }


