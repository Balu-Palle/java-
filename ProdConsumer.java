class Q {
int n;
boolean valueSet = false;
synchronized int get() {
while(!valueSet)
try {
Thread.sleep(2000);
wait();
} 
catch(InterruptedException e) {
System.out.println("InterruptedException caught");
}
System.out.println("Take" + n);
valueSet = false;
notify();
return n;
}
synchronized void make(int n) {
while(valueSet)
try {
Thread.sleep(2000);
wait();
} catch(InterruptedException e) {
System.out.println("InterruptedException caught");
}
this.n=n;
valueSet=true;
System.out.println("Make" + n);
notify();
}
}
class Producer implements Runnable
{
Q q;
Producer(Q q){
this.q=q;
new Thread(this,"Producer").start();
}
public void run()
{
int i=0;
while(true)
{
q.make(i++);
}
}
}
class Consumer implements Runnable{
Q q;
Consumer(Q q)
{
this.q=q;
new Thread(this,"Consumer").start();
}
public void run()
{
while(true)
{
q.get();
}
}
}
class ProdConsumer{
public static void main(String args[])
{
System.out.println("Producer Consumer");
Q q=new Q();
new Producer(q);
new Consumer(q);
}
}
             
