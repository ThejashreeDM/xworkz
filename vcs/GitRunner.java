package com.xworkz.inheritancemodule.vcs;

public class GitRunner
{
    public static void main(String[] args) {
        VCS name=new Git();
        Git git=(Git)name;
        name.maintainProjects();
    }
}
