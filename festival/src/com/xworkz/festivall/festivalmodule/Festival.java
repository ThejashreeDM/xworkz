package com.xworkz.festivall.festivalmodule;

public class Festival
{

        private String name;
        private String religion;
        private String countryOfOrigin;
        private String dateOrMonth;
        private boolean isPublicHoliday;
        private String mainActivities;
        private int durationInDays;

        public Festival() {
            // Default constructor
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setReligion(String religion) {
            this.religion = religion;
        }
        public String getReligion() {
            return religion;
        }

        public void setCountryOfOrigin(String country) {
            this.countryOfOrigin = country;
        }
        public String getCountryOfOrigin() {
            return countryOfOrigin;
        }

        public void setDateOrMonth(String dateOrMonth) {
            this.dateOrMonth = dateOrMonth;
        }
        public String getDateOrMonth() {
            return dateOrMonth;
        }

        public void setIsPublicHoliday(boolean isPublicHoliday) {
            this.isPublicHoliday = isPublicHoliday;
        }
        public boolean getIsPublicHoliday() {
            return isPublicHoliday;
        }

        public void setMainActivities(String activities) {
            this.mainActivities = activities;
        }
        public String getMainActivities() {
            return mainActivities;
        }

        public void setDurationInDays(int days) {
            this.durationInDays = days;
        }
        public int getDurationInDays() {
            return durationInDays;
        }
    }


