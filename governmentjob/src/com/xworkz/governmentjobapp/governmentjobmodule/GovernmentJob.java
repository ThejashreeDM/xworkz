package com.xworkz.governmentjobapp.governmentjobmodule;

public class GovernmentJob
{

        private String jobTitle;
        private String department;
        private String eligibility;
        private String examName;
        private int salary;
        private String location;
        private boolean isPermanent;

        public GovernmentJob() {
            // Default constructor
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }
        public String getJobTitle() {
            return jobTitle;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
        public String getDepartment() {
            return department;
        }

        public void setEligibility(String eligibility) {
            this.eligibility = eligibility;
        }
        public String getEligibility() {
            return eligibility;
        }

        public void setExamName(String examName) {
            this.examName = examName;
        }
        public String getExamName() {
            return examName;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
        public int getSalary() {
            return salary;
        }

        public void setLocation(String location) {
            this.location = location;
        }
        public String getLocation() {
            return location;
        }

        public void setIsPermanent(boolean isPermanent) {
            this.isPermanent = isPermanent;
        }
        public boolean getIsPermanent() {
            return isPermanent;
        }
    }


