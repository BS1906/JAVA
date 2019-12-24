import java.io.*;
import java.util.*;
class Caal
{
double powerInt(int num1,int num2)
{
return Math.pow(num1,num2);
}
double powerDouble(double num1,int num2)
{
return Math.pow(num1,num2);
}
}



class Calculator
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
Caal c=new Caal();
double a=c.powerInt(2,3);
double b=c.powerDouble(34,67);
System.out.println(a);
System.out.println(b);
}
}