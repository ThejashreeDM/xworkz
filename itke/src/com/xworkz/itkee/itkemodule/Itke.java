package com.xworkz.itkee.itkemodule;

public class Itke
{

        private String name;
        private String type;
        private String manufacturer;
        private double weight;
        private String color;
        private double price;
        private boolean isAvailable;

        public Itke() {
            
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
        public String getManufacturer() {
            return manufacturer;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
        public double getWeight() {
            return weight;
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

        public void setIsAvailable(boolean available) {
            this.isAvailable = available;
        }
        public boolean getIsAvailable() {
            return isAvailable;
        }
    }


