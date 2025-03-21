class BankAccount
{
static double balance;
public static void credit(double amount)
{
System.out.println("credit started");
if(amount>0.0)
balance+=amount;
else
System.out.println("Invalid amount");
System.out.println("credit ended");
}
public static void debit(double amount)
{
System.out.println("debit started");
if(amount<0.0)
System.out.println("Invalid amount");
else if(balance>=amount)
balance-=amount;
else
System.out.println("Insufficient balance");
System.out.println("debit ended");
}
public static void getBalance()
{
System.out.println("Available Balance:"+balance);
}
}