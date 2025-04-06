package com.xworkz.governmentjobapp;
import com.xworkz.governmentjobapp.governmentjobmodule.GovernmentJob;
public class GovernmentJobRunner
{

        public static void display(GovernmentJob job) {
            System.out.println("Job Title      : " + job.getJobTitle());
            System.out.println("Department     : " + job.getDepartment());
            System.out.println("Eligibility    : " + job.getEligibility());
            System.out.println("Exam Name      : " + job.getExamName());
            System.out.println("Salary         : ₹" + job.getSalary());
            System.out.println("Location       : " + job.getLocation());
            System.out.println("Is Permanent?  : " + job.getIsPermanent());
            System.out.println();
        }

        public static void main(String[] args)
        {
            GovernmentJob job1 = new GovernmentJob();
            job1.setJobTitle("IAS Officer");
            job1.setDepartment("Administrative Services");
            job1.setEligibility("Graduate");
            job1.setExamName("UPSC Civil Services");
            job1.setSalary(56000);
            job1.setLocation("New Delhi");
            job1.setIsPermanent(true);
            display(job1);

            GovernmentJob job2 = new GovernmentJob();
            job2.setJobTitle("IPS Officer");
            job2.setDepartment("Police Services");
            job2.setEligibility("Graduate");
            job2.setExamName("UPSC Civil Services");
            job2.setSalary(54000);
            job2.setLocation("Mumbai");
            job2.setIsPermanent(true);
            display(job2);

            GovernmentJob job3 = new GovernmentJob();
            job3.setJobTitle("Bank PO");
            job3.setDepartment("Banking");
            job3.setEligibility("Graduate");
            job3.setExamName("IBPS PO");
            job3.setSalary(42000);
            job3.setLocation("Bangalore");
            job3.setIsPermanent(true);
            display(job3);

            GovernmentJob job4 = new GovernmentJob();
            job4.setJobTitle("SSC CGL Auditor");
            job4.setDepartment("CAG");
            job4.setEligibility("Graduate");
            job4.setExamName("SSC CGL");
            job4.setSalary(35000);
            job4.setLocation("Chennai");
            job4.setIsPermanent(true);
            display(job4);

            GovernmentJob job5 = new GovernmentJob();
            job5.setJobTitle("Indian Forest Service Officer");
            job5.setDepartment("Environment & Forests");
            job5.setEligibility("Science Graduate");
            job5.setExamName("IFoS");
            job5.setSalary(55000);
            job5.setLocation("Dehradun");
            job5.setIsPermanent(true);
            display(job5);
        }
    }


