package com.xworkz.tileapp.tile;

public class Tile
{
     private int tileId;
        private String brandName;
        private double price;
        private String size;
        private String material;
        private String color;
        private String finish;
        private String ownerName;

        public Tile()
        {

        }

        public void setTileId(int id)
        {
            tileId = id;
        }
        public int getTileId()
        {
            return tileId;
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

        public void setColor(String color)
        {
            this.color = color;
        }
        public String getColor()
        {
            return color;
        }

        public void setFinish(String finish)
        {
            this.finish = finish;
        }
        public String getFinish()
        {
            return finish;
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

