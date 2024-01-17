import java.lang.*;
import java.util.*;

class Prime
{
public static void main (String args[])
{
int n;
Scanner s =new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<n;i++)
{
int count=0;
for (int j=1;j<=i;j++){
if(i%j==0){
count++;
}
}
if (count==2){
System.out.println(i);
}
}
}
}
