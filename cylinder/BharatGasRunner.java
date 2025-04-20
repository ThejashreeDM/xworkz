package com.xworkz.inheritancemodule.cylinder;

public class BharatGasRunner {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        Cylinder gas=new BharatGas();
        BharatGas bharatGas=new BharatGas();
        cylinder.fillGas();
        cylinder.providesFuel();
        cylinder.checkLeakage();
        cylinder.seal();
        cylinder.weigh();
        gas.fillGas();
        gas.providesFuel();
        gas.checkLeakage();
        gas.seal();
        gas.weigh();
        bharatGas.fillGas();
        bharatGas.providesFuel();
        bharatGas.checkLeakage();
        bharatGas.seal();
        bharatGas.weigh();
        bharatGas.connectToStove();
        bharatGas.deliverToHome();
        bharatGas.maintainRecords();
        bharatGas.offerSubsidy();
        bharatGas.registerRefill();

    }
}
