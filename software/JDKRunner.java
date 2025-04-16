package com.xworkz.inheritancemodule.software;

public class JDKRunner
{
    public static void main(String[] args) {
        Software software = new Software();
        Software jdk = new JDK();
        JDK javaDevKit = new JDK();
        software.provideService();
        software.install();
        software.configure();
        software.update();
        software.run();
        software.uninstall();
        jdk.provideService();
        jdk.install();
        jdk.configure();
        jdk.update();
        jdk.run();
        jdk.uninstall();
        javaDevKit.compileCode();
        javaDevKit.runJavaPrograms();
        javaDevKit.debugCode();
        javaDevKit.documentAPI();
        javaDevKit.manageJVM();
    }
}
