import java.io.*;
import java.util.*;
class Arraythird
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0,i,j,k,temp,p;
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
c++;
}
if(n<9)
{
System.out.println("please enter 9 integer numbers");
}
else
{
k=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(+a[k++]+" ");
}
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Biggest number is: "+a[n-1]);


}
}
}

