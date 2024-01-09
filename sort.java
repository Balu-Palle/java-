import java.lang.*;
import java.util.Scanner;

class sort
{
public static void main(String args[])
  {
    int n;
    String temp;
    System.out.println("enter size of array");
    Scanner s =new Scanner(System.in);
    n=s.nextInt();
    String str[]=new String[n];
    Scanner s1 =new Scanner(System.in);
    for(int i=0;i<n;i++)
    {
        str[i]=s1.next();
    }
    for (int i=0; i<n;i++)
    {
        for (int j=i+1;j<n;j++)
        {
            if (str[i].compareTo (str[j])>0 )
            {
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;

            }
        }
    }
    System.out.println("after sorting");
    for (int i=0;i<n;i++)
    {
        System.out.println(str[i]);
    }
    
 }
}