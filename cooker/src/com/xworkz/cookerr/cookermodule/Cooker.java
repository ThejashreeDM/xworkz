package com.xworkz.cookerr.cookermodule;
public class Cooker
{

        private String brand;
        private double capacityInLiters;
        private String material;
        private String color;
        private boolean isElectric;
        private double price;
        private int warrantyInYears;

        public Cooker() {
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
        public String getBrand() {
            return brand;
        }

        public void setCapacityInLiters(double capacity) {
            this.capacityInLiters = capacity;
        }
        public double getCapacityInLiters() {
            return capacityInLiters;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
        public String getMaterial() {
            return material;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public String getColor() {
            return color;
        }

        public void setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
        }
        public boolean getIsElectric() {
            return isElectric;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public double getPrice() {
            return price;
        }

        public void setWarrantyInYears(int years) {
            this.warrantyInYears = years;
        }
        public int getWarrantyInYears() {
            return warrantyInYears;
        }
    }


