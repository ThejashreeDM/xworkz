package com.xworkz.inheritancemodule.bank;

public class BobRunner
{
    public static void main(String[] args) {
        Bank bank=new Bob();
        Bank bob=new Bob();
        Bob bankOfBaroda=new Bob();
        bank.checkBalance();
        bank.closeAccount();
        bank.toProvideFinancialService();
        bank.depositMoney();
        bank.openAccount();
        bob.depositMoney();
        bob.openAccount();
        bob.checkBalance();
        bob.closeAccount();
        bob.toProvideFinancialService();
        bankOfBaroda.checkBalance();
        bankOfBaroda.closeAccount();
        bankOfBaroda.toProvideFinancialService();
        bankOfBaroda.depositMoney();
        bankOfBaroda.openAccount();
        bankOfBaroda.netBanking();
        bankOfBaroda.customerSupport();
        bankOfBaroda.issueCreditCard();
        bankOfBaroda.openFixedDeposit();
        bankOfBaroda.provideLoan();
    }
}
