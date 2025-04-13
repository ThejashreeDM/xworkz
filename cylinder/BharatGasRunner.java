package com.xworkz.inheritancemodule.cylinder;

public class BharatGasRunner {
    public static void main(String[] args) {
        Cylinder cylinder=new BharatGas();
        BharatGas gas=(BharatGas)cylinder;
        gas.providesFuel();
    }
}
