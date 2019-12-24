import java.io.*;
import java.util.*;
class Sarray
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,p=0,q=0,sum=0,sum1=0;
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
for(i=0;i<n;i++)
{
if(a[i]==6)
{
p=i;
}
if(a[i]==7)
{
q=i;
}
}
for(i=p;i<=q;i++)
{
sum1=sum1+a[i];
}
System.out.println("igonered 6 between 7 and adding remaning sum is "+(sum-sum1));
}
}

