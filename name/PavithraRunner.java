package com.xworkz.inheritancemodule.name;

public class PavithraRunner {
    public static void main(String[] args) {
        Name name = new Name();
        Name pavitraaName = new Pavithra();
        Pavithra pavitraa = new Pavithra();
        name.displayFullName();
        name.toIdentify();
        name.setFirstName();
        name.setLastName();
        name.updateName();
        pavitraaName.displayFullName();
        pavitraaName.toIdentify();
        pavitraaName.setLastName();
        pavitraaName.setFirstName();
        pavitraaName.updateName();
        pavitraa.displayFullName();
        pavitraa.toIdentify();
        pavitraa.setFirstName();
        pavitraa.setLastName();
        pavitraa.updateName();
        pavitraa.displayCulturalSignificance();
        pavitraa.personalizeName();
        pavitraa.recordNameHistory();
        pavitraa.setNameMeaning();
        pavitraa.shareNameInspiration();
    }
}
