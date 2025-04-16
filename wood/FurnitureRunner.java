package com.xworkz.inheritancemodule.wood;

public class FurnitureRunner
{
    public static void main(String args[])
    {
        Wood wood = new Wood();
        Wood furnitureAsWood = new Furniture();
        Furniture furniture = new Furniture();
        wood.makeFurniture();
        wood.cutWood();
        wood.treatWood();
        wood.shapeWood();
        wood.finishWood();
        wood.storeWood();
        furnitureAsWood.makeFurniture();
        furnitureAsWood.cutWood();
        furnitureAsWood.treatWood();
        furnitureAsWood.shapeWood();
        furnitureAsWood.finishWood();
        furnitureAsWood.storeWood();
        furniture.assemble();
        furniture.polish();
        furniture.move();
        furniture.clean();
        furniture.maintain();
    }
}
