class BankAccountRunner
{
public static void main(String args[])
{
BankAccount.getBalance();
BankAccount.credit(1000.00);
BankAccount.getBalance();
BankAccount.debit(-10.00);
BankAccount.getBalance();
}
}