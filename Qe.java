import java.lang.*;
import java.util.Scanner;
class Qe 
{

public static void main(String args[])
{
double a,b,c,d,r1,r2;

Scanner s = new Scanner(System.in);
System.out.println("enter a value");
a=s.nextInt();
System.out.println("enter b value");
b=s.nextInt();
System.out.println("enter c value");
c=s.nextInt();

d=b*b-4*a*c;
System.out.println("discriminant value"+d);
if (d>0)
{
r1=(-b+ Math.sqrt(d))/2*a;
r2=(-b - Math.sqrt(d))/2*a;
System.out.println("root 1 :"+r1 + "root 2 :"+r2);
System.out.println("roots are real and un equal");
}
else if (d==0)
{
r1=r2=-b/2*a;
System.out.println("root 1 :"+r1 + "root 2 :"+r2);
System.out.println("roots are real and equal");

}
else
{

r1=-b/2*a;
r2= (Math.sqrt(-d)/2*a);
System.out.println("root 1\n=" +r1 +"+i"+r2);
System.out.println("root 2\n=" +r1 +"-i"+r2);
System.out.println("roots are imaginary");
}
}
}






