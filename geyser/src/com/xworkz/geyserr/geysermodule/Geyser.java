package com.xworkz.geyserr.geysermodule;

public class Geyser
{

        private String brand;
        private int capacityInLiters;
        private int powerInWatts;
        private String color;
        private double price;
        private boolean isAutomatic;
        private String mountingType;

        public Geyser() {

        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
        public String getBrand() {
            return brand;
        }

        public void setCapacityInLiters(int capacity) {
            this.capacityInLiters = capacity;
        }
        public int getCapacityInLiters() {
            return capacityInLiters;
        }

        public void setPowerInWatts(int power) {
            this.powerInWatts = power;
        }
        public int getPowerInWatts() {
            return powerInWatts;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public String getColor() {
            return color;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public double getPrice() {
            return price;
        }

        public void setIsAutomatic(boolean isAutomatic) {
            this.isAutomatic = isAutomatic;
        }
        public boolean getIsAutomatic() {
            return isAutomatic;
        }

        public void setMountingType(String mountingType) {
            this.mountingType = mountingType;
        }
        public String getMountingType() {
            return mountingType;
        }
    }


