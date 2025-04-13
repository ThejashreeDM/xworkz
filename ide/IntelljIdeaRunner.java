package com.xworkz.inheritancemodule.ide;

public class IntelljIdeaRunner
{
    public static void main(String[] args)
    {

        Ide ide=new IntellijIdea();
        IntellijIdea intellijIdea=(IntellijIdea)ide;
        intellijIdea.developProject();

    }
}
