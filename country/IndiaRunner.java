package com.xworkz.inheritancemodule.country;

public class IndiaRunner
{
    public static void main(String[] args) {
        Country country=new Country();
        Country type=new India();
        India india=new India();
        country.declareIndependence();
        country.toLive();
        country.developInfrastructure();
        country.electGovernment();
        country.maintainLaw();
        type.declareIndependence();
        type.toLive();
        type.developInfrastructure();
        type.electGovernment();
        type.maintainLaw();
        india.celebrateIndependenceDay();
        india.celebrateRepublicDay();
        india.conductElections();
        india.supportISRO();
        india.promoteYoga();

    }
}
