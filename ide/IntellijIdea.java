package com.xworkz.inheritancemodule.ide;

public class IntellijIdea extends Ide
{
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
