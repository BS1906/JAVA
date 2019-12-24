import java.io.*;
import java.util.*;
class Arraythird
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int c=0,i,j,k,p;
if(args.length!=9)
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
System.out.print(args[k++]+" ");
}
System.out.println();
}
int max=Integer.parseInt(args[0]);
for(i=0;i<args.length;i++)
{

if(max<Integer.parseInt(args[i]))
{
max=Integer.parseInt(args[i]);

}
}

System.out.println("Biggest number is: "+max);


}
}
}

