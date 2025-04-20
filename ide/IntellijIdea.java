package com.xworkz.inheritancemodule.ide;

public class IntellijIdea extends Ide
{
    @Override
    public void developProject()
    {
        System.out.println("IntellijIdea are used to develop projects");
    }
    @Override
    public void openProject() {
        System.out.println("Opening the project in the IntellijIdea");
    }
    @Override
    public void writeCode() {
        System.out.println("Writing code in the IntellijIdea");
    }
    @Override
    public void debugCode() {
        System.out.println("Debugging the code in the InrellijIdea");
    }
    @Override
    public void buildProject() {
        System.out.println("Building the project in the IntelliIdeaa");
    }
    @Override
    public void runProject() {
        System.out.println("Running the project from the IntellijIdea");
    }

    public void provideCodeCompletion() {
        System.out.println("Providing code completion in IntelliJ IDEA.");
    }

    public void offerRefactoring() {
        System.out.println("Offering code refactoring tools in IntelliJ IDEA.");
    }

    public void integrateWithVCS() {
        System.out.println("Integrating with version control system in IntelliJ IDEA.");
    }

    public void runTests() {
        System.out.println("Running unit tests in IntelliJ IDEA.");
    }

    public void supportMultipleLanguages() {
        System.out.println("Supporting multiple programming languages in IntelliJ IDEA.");
    }
}
