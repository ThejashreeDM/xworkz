package com.xworkz.majigee.majigemodule;

public class Majige
{


        private int majigeId;
        private String brandName;
        private double price;
        private String flavor;
        private double quantity; // in ml
        private boolean isChilled;
        private String ownerName;

        public Majige()
        {
            // Default constructor
        }

        public void setMajigeId(int id)
        {
            majigeId = id;
        }
        public int getMajigeId()
        {
            return majigeId;
        }

        public void setBrandName(String brandName)
        {
            this.brandName = brandName;
        }
        public String getBrandName()
        {
            return brandName;
        }

        public void setPrice(double price)
        {
            this.price = price;
        }
        public double getPrice()
        {
            return price;
        }

        public void setFlavor(String flavor)
        {
            this.flavor = flavor;
        }
        public String getFlavor()
        {
            return flavor;
        }

        public void setQuantity(double quantity)
        {
            this.quantity = quantity;
        }
        public double getQuantity()
        {
            return quantity;
        }

        public void setIsChilled(boolean isChilled)
        {
            this.isChilled = isChilled;
        }
        public boolean getIsChilled()
        {
            return isChilled;
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


