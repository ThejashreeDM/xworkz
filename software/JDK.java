package com.xworkz.inheritancemodule.software;

public class JDK extends Software
{

    @Override
    public void provideService()
    {
        System.out.println(" JDK provides different service");
    }
    @Override
    public void install() {
        System.out.println("Installing the JDK on the system.");
    }
    @Override
    public void configure() {
        System.out.println("Configuring the JDK software settings.");
    }

    @Override
    public void update() {
        System.out.println("Updating the JDK software to the latest version.");
    }
    @Override
    public void run() {
        System.out.println("Running the JDK software on the system.");
    }
    @Override
    public void uninstall() {
        System.out.println("Uninstalling the JDK software from the system.");
    }
    public void compileCode() {
        System.out.println("Compiling Java code into bytecode using the JDK.");
    }

    public void runJavaPrograms() {
        System.out.println("Running Java programs using the JDK.");
    }

    public void debugCode() {
        System.out.println("Debugging Java code with the tools provided by the JDK.");
    }

    public void documentAPI() {
        System.out.println("Documenting Java APIs with the JDK's tools.");
    }

    public void manageJVM() {
        System.out.println("Managing the Java Virtual Machine (JVM) with the JDK.");
    }
}
