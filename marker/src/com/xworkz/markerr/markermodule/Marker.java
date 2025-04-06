package com.xworkz.markerr.markermodule;

public class Marker
{


        private int markerId;
        private String brandName;
        private double price;
        private String inkColor;
        private String type;
        private boolean isRefillable;
        private String ownerName;

        public Marker()
        {
            // Default constructor
        }

        public void setMarkerId(int id)
        {
            markerId = id;
        }
        public int getMarkerId()
        {
            return markerId;
        }

        public void setBrandName(String name)
        {
            brandName = name;
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

        public void setInkColor(String inkColor)
        {
            this.inkColor = inkColor;
        }
        public String getInkColor()
        {
            return inkColor;
        }

        public void setType(String type)
        {
            this.type = type;
        }
        public String getType()
        {
            return type;
        }

        public void setIsRefillable(boolean isRefillable)
        {
            this.isRefillable = isRefillable;
        }
        public boolean getIsRefillable()
        {
            return isRefillable;
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
