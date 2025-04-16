package com.xworkz.inheritancemodule.pulses;

public class BeansRunner {
    public static void main(String[] args) {
        Pulses pulses = new Pulses();
        Pulses beanAsPulse = new Beans();
        Beans beans = new Beans();
        pulses.eat();
        pulses.harvest();
        pulses.clean();
        pulses.dry();
        pulses.packagePulses();
        pulses.store();
        beanAsPulse.eat();
        beanAsPulse.harvest();
        beanAsPulse.clean();
        beanAsPulse.dry();
        beanAsPulse.packagePulses();
        beanAsPulse.store();
        beans.plantBeans();
        beans.waterBeans();
        beans.sortBeans();
        beans.cookBeans();
        beans.packageBeans();
    }
}
