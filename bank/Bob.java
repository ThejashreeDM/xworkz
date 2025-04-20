package com.xworkz.inheritancemodule.bank;

public class Bob extends Bank
{
    @Override
    public void toProvideFinancialService()
    {
        System.out.println("Bob is to provide financial serive for people");
    }
    @Override
    public void openAccount() {
        System.out.println("Opening a bank account in bob.");
    }
@Override
    public void closeAccount() {
        System.out.println("Closing the bank account in bob.");
    }
@Override
    public void depositMoney() {
        System.out.println("Depositing money into the bob bank account.");
    }
  @Override
    public void withdrawMoney() {
        System.out.println("Withdrawing money from the bob bank account.");
    }
  @Override
    public void checkBalance() {
        System.out.println("Checking bank account balance in bob bank.");
    }

    public void provideLoan() {
        System.out.println("Providing loan from Bank of Baroda.");
    }

    public void issueCreditCard() {
        System.out.println("Issuing credit card from Bank of Baroda.");
    }

    public void openFixedDeposit() {
        System.out.println("Opening a fixed deposit in Bank of Baroda.");
    }

    public void customerSupport() {
        System.out.println("Providing customer support at Bank of Baroda.");
    }

    public void netBanking() {
        System.out.println("Accessing Bank of Baroda net banking.");
    }
}
