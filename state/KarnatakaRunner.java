package com.xworkz.inheritancemodule.state;

public class KarnatakaRunner {
    public static void main(String[] args) {
        State state = new State();
        State karnataka = new Karnataka();
        Karnataka karnatakaState = new Karnataka();
        state.defineBorders();
        state.provideServices();
        state.manageEconomy();
        state.maintainLawAndOrder();
        karnataka.defineBorders();
        karnataka.provideServices();
        karnataka.manageEconomy();
        karnataka.manageEconomy();
        karnatakaState.showcaseCulture();
        karnatakaState.promoteTourism();
        karnatakaState.supportAgriculture();
        karnatakaState.celebrateFestivals();
        karnatakaState.developInfrastructure();
    }
}
