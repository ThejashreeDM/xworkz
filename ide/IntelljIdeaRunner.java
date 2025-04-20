package com.xworkz.inheritancemodule.ide;

public class IntelljIdeaRunner
{
    public static void main(String[] args)
    {

        Ide ide = new Ide();
        Ide intelliJIDE = new IntellijIdea();
        IntellijIdea idea = new IntellijIdea();
        ide.openProject();
        ide.writeCode();
        ide.debugCode();
        ide.buildProject();
        ide.runProject();
        intelliJIDE.openProject();
        intelliJIDE.writeCode();
        intelliJIDE.debugCode();
        intelliJIDE.buildProject();
        intelliJIDE.runProject();
        idea.openProject();
        idea.writeCode();
        idea.debugCode();
        idea.buildProject();
        idea.runProject();
        idea.integrateWithVCS();
        idea.offerRefactoring();
        idea.provideCodeCompletion();
        idea.supportMultipleLanguages();
        idea.runTests();
    }
}
