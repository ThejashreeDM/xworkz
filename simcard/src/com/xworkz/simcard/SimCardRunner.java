package com.xworkz.simcard;
import com.xworkz.simcard.simcardmodule.SimCard;
public class SimCardRunner
{
      public static void display(SimCard sim)
        {
            System.out.println("Sim ID          : " + sim.getSimId());
            System.out.println("Network Provider: " + sim.getNetworkProvider());
            System.out.println("Sim Type        : " + sim.getSimType());
            System.out.println("Number          : " + sim.getNumber());
            System.out.println("5G Enabled?     : " + sim.getIs5GEnabled());
            System.out.println("Owner Name      : " + sim.getOwnerName());
            System.out.println("Balance         : ₹" + sim.getBalance());
            System.out.println();
        }

        public static void main(String[] args)
        {
            SimCard s1 = new SimCard();
            s1.setSimId(1);
            s1.setNetworkProvider("Jio");
            s1.setSimType("Prepaid");
            s1.setNumber("9876543210");
            s1.setIs5GEnabled(true);
            s1.setOwnerName(" Mukesh Ambani ");
            s1.setBalance(199.0);
            display(s1);

            SimCard s2 = new SimCard();
            s2.setSimId(2);
            s2.setNetworkProvider("Airtel");
            s2.setSimType("Postpaid");
            s2.setNumber("9123456780");
            s2.setIs5GEnabled(true);
            s2.setOwnerName("Sunil Bharti Mittal");
            s2.setBalance(0.0);
            display(s2);

            SimCard s3 = new SimCard();
            s3.setSimId(3);
            s3.setNetworkProvider("Vi");
            s3.setSimType("Prepaid");
            s3.setNumber("9988776655");
            s3.setIs5GEnabled(false);
            s3.setOwnerName("Akshaya Moondra");
            s3.setBalance(79.0);
            display(s3);

            SimCard s4 = new SimCard();
            s4.setSimId(4);
            s4.setNetworkProvider("BSNL");
            s4.setSimType("Prepaid");
            s4.setNumber("9012345678");
            s4.setIs5GEnabled(false);
            s4.setOwnerName("Central Government");
            s4.setBalance(50.0);
            display(s4);

            SimCard s5 = new SimCard();
            s5.setSimId(5);
            s5.setNetworkProvider("Jio");
            s5.setSimType("Postpaid");
            s5.setNumber("9823456790");
            s5.setIs5GEnabled(true);
            s5.setOwnerName(" Mukesh Ambani");
            s5.setBalance(0.0);
            display(s5);
        }
    }


