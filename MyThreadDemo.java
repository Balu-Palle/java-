
import java.lang.*;
class myThread implements RunnableInterface
{
public void run()
{
System.out.println("hello world");
}
}
class MyThreadDemo
{
public static void main(String args[])
{
myThread m = new myThread();
Thread t= new Thread();
t.start();
System.out.println("hi");
}
} 