package com.xworkz.inheritancemodule.exam;

public class Neet extends Exam
{
    @Override
    public void prepare() {
        System.out.println("Preparing for the Neet exam.");
    }
    @Override
    public void write() {
        System.out.println("Writing the Neet exam in the scheduled time.");
    }
    @Override
    public void evaluate() {
        System.out.println("Evaluating the Neet exam papers.");
    }
    @Override
    public void declareResults() {
        System.out.println("Declaring the results of the Neet exam.");
    }
    @Override
    public void issueCertificate() {
        System.out.println("Issuing certificate to successful Neet candidates.");
    }

    public void prepareSyllabus() {
        System.out.println("Preparing the syllabus for NEET exam.");
    }

    public void arrangeCenters() {
        System.out.println("Arranging exam centers for NEET.");
    }

    public void provideAdmitCard() {
        System.out.println("Providing NEET admit card to candidates.");
    }

    public void conductCounseling() {
        System.out.println("Conducting counseling for NEET exam results.");
    }

    public void releaseAnswerKey() {
        System.out.println("Releasing the NEET answer key.");
    }
}
