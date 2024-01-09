class InvalidAgeException extends Exception 
{
InvalidAgeException(String s)
{
super(s);
}
}
public class TestCustomException1
{
void validate(int age) throws InvalidAgeException
{
if (age<18)
{
throw new InvalidAgeException("not valid");
}
else
{
System.out.println("welcome for vote");
}
}
public static void main(String args[])
{
TestCustomException1 ts = new TestCustomException1();
try
{
ts.validate(22);
}
catch(Exception e)
{
System.out.println("Exception occured");
}
finally
{
System.out.println("Custom exception demo completed");
}
}
}
