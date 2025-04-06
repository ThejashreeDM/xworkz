package com.xworkz.celebrity.celebritymodule;

public class Celebrity
{
     private String name;
        private int age;
        private String profession;
        private String nationality;
        private boolean isAlive;
        private int numberOfAwards;
        private String famousWork;

        public Celebrity() {

        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }
        public String getProfession() {
            return profession;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
        public String getNationality() {
            return nationality;
        }

        public void setIsAlive(boolean isAlive) {
            this.isAlive = isAlive;
        }
        public boolean getIsAlive() {
            return isAlive;
        }

        public void setNumberOfAwards(int numberOfAwards) {
            this.numberOfAwards = numberOfAwards;
        }
        public int getNumberOfAwards() {
            return numberOfAwards;
        }

        public void setFamousWork(String famousWork) {
            this.famousWork = famousWork;
        }
        public String getFamousWork() {
            return famousWork;
        }
    }


