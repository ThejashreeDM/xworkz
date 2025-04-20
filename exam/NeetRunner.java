package com.xworkz.inheritancemodule.exam;

public class NeetRunner
{
    public static void main(String[] args) {
        Exam exam = new Exam();
        Exam neetExam = new Neet();
        Neet neet = new Neet();
        exam.evaluate();
        exam.write();
        exam.prepare();
        exam.declareResults();
        exam.issueCertificate();
        neetExam.prepare();
        neetExam.write();
        neetExam.evaluate();
        neetExam.declareResults();
        neetExam.issueCertificate();
        neet.evaluate();
        neet.write();
        neet.prepare();
        neet.declareResults();
        neet.issueCertificate();
        neet.prepareSyllabus();
        neet.arrangeCenters();
        neet.conductCounseling();
        neet.releaseAnswerKey();
        neet.provideAdmitCard();
    }
}
