package com.xworkz.simcard.simcardmodule;

public class SimCard
{
    private int simId;
        private String networkProvider;
        private String simType; // e.g., Prepaid or Postpaid
        private String number;
        private boolean is5GEnabled;
        private String ownerName;
        private double balance;

        public SimCard()
        {

        }

        public void setSimId(int simId)
        {
            this.simId = simId;
        }
        public int getSimId()
        {
            return simId;
        }

        public void setNetworkProvider(String networkProvider)
        {
            this.networkProvider = networkProvider;
        }
        public String getNetworkProvider()
        {
            return networkProvider;
        }

        public void setSimType(String simType)
        {
            this.simType = simType;
        }
        public String getSimType()
        {
            return simType;
        }

        public void setNumber(String number)
        {
            this.number = number;
        }
        public String getNumber()
        {
            return number;
        }

        public void setIs5GEnabled(boolean is5GEnabled)
        {
            this.is5GEnabled = is5GEnabled;
        }
        public boolean getIs5GEnabled()
        {
            return is5GEnabled;
        }

        public void setOwnerName(String ownerName)
        {
            this.ownerName = ownerName;
        }
        public String getOwnerName()
        {
            return ownerName;
        }

        public void setBalance(double balance)
        {
            this.balance = balance;
        }
        public double getBalance()
        {
            return balance;
        }
    }


