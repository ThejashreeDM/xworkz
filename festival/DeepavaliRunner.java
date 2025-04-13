package com.xworkz.inheritancemodule.festival;

public class DeepavaliRunner
{
    public static void main(String[] args) {
        Festival fest=new Deepavali();
        Deepavali type=(Deepavali)fest;
        type.celebrate();
    }
}
