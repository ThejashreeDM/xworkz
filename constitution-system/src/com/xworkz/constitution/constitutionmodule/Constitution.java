package com.xworkz.constitution.constitutionmodule;

public class Constitution
{

        private String country;
        private String constitutionName;
        private String adoptedDate;
        private String draftedBy;
        private int totalArticles;
        private boolean isWritten;
        private String language;

        public Constitution() {
            // Default constructor
        }

        public void setCountry(String country) {
            this.country = country;
        }
        public String getCountry() {
            return country;
        }

        public void setConstitutionName(String constitutionName) {
            this.constitutionName = constitutionName;
        }
        public String getConstitutionName() {
            return constitutionName;
        }

        public void setAdoptedDate(String adoptedDate) {
            this.adoptedDate = adoptedDate;
        }
        public String getAdoptedDate() {
            return adoptedDate;
        }

        public void setDraftedBy(String draftedBy) {
            this.draftedBy = draftedBy;
        }
        public String getDraftedBy() {
            return draftedBy;
        }

        public void setTotalArticles(int totalArticles) {
            this.totalArticles = totalArticles;
        }
        public int getTotalArticles() {
            return totalArticles;
        }

        public void setIsWritten(boolean isWritten) {
            this.isWritten = isWritten;
        }
        public boolean getIsWritten() {
            return isWritten;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
        public String getLanguage() {
            return language;
        }
    }



