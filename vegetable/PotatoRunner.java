package com.xworkz.inheritancemodule.vegetable;

public class PotatoRunner
{
    public static void main(String args[])
    {
        Veagetable vegetable = new Veagetable();
        Veagetable potatoAsVeagetable = new Potato();
        Potato potato = new Potato();
        vegetable.providesEnergy();
        vegetable.grow();
        vegetable.harvest();
        vegetable.clean();
        vegetable.store();
        vegetable.cook();
        potatoAsVeagetable.providesEnergy();
        potatoAsVeagetable.grow();
        potatoAsVeagetable.harvest();
        potatoAsVeagetable.clean();
        potatoAsVeagetable.store();
        potatoAsVeagetable.cook();
        potato.providesEnergy();
        potato.grow();
        potato.harvest();
        potato.clean();
        potato.store();
        potato.cook();
        potato.peel();
        potato.mash();
        potato.fry();
        potato.bake();
        potato.storeInCoolPlace();
    }
}
