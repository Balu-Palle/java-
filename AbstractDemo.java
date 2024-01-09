abstract class Shape
{
int width=10,height=10,radius=2;
abstract public void PrintArea();
}
class Rectangle extends Shape
{
public void PrintArea()
{
int area=width*height;
System.out.println("area:"+area);
}
}
class Triangle extends Shape
{
public void PrintArea()
{
float area = (width*height)/2;
System.out.println("area:"+area);
}
}
class Circle extends Shape
{
public void PrintArea()
{
int area =  3 * radius * radius;
System.out.println("area:"+area);
}
}

class AbstractDemo
{
public static void main(String args[])
{
Shape r=new Rectangle();
r.PrintArea();
Shape t=new Triangle();
t.PrintArea();
Shape c=new Circle();
c.PrintArea();
}
}





