package com.xworkz.inheritancemodule.state;

public class KarnatakaRunner {
    public static void main(String[] args) {
        State no1=new Karnataka();
        Karnataka karnataka=(Karnataka)no1;
        no1.toGroupPeopleOfSimilarKind();
    }
}
