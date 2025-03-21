class Calculator1
{
public static int add(int number,int anotherNumber)
{
int total=number+anotherNumber;
System.out.print("The addition of two numbers "+number+" and "+anotherNumber+" is ");
return total;
}
public static int sub(int number,int anotherNumber)
{
int total=number-anotherNumber;
System.out.print("The subtraction of two numbers "+number+" and "+anotherNumber+" is ");
return total;
}
public static int mul(int number,int anotherNumber)
{
int total=number*anotherNumber;
System.out.print("The multiplication of two numbers "+number+" and "+anotherNumber+" is ");
return total;
}
public static double div(int number,int anotherNumber)
{
double total=number/anotherNumber;
System.out.print("The division of two numbers "+number+" and "+anotherNumber+" is ");
return total;
}
public static int mod(int number,int anotherNumber)
{
int total=number%anotherNumber;
System.out.print("The modulus of two numbers "+number+" and "+anotherNumber+" is ");
return total;
}
}