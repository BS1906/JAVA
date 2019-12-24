import java.io.*;
import java.util.*;
class Volume
{
int w=50,h=36;
double depth=79,v;
void display()
{
System.out.println(w*depth*h);
}
}


class Box
{
public static void main(String []args)
{
Volume v=new Volume();
v.display();
}
}

