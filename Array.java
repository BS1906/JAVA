import java.io.*;
import java.util.*;
class Array
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int c=0,i,j,k,temp,p;
if(args.length!=4)
{
System.out.println("please enter 4 integer numbers");
}
else
{
k=0;
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(args[k++]+" ");
}
System.out.println();
}
p=4;
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(args[--p]+" ");
}
System.out.println();
}
}
}
}

