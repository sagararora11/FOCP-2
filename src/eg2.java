import java.util.*;
class Eg2
{
	public static void main(String[]args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the first no.");
	int a=in.nextInt();
	System.out.println("enter the second no.");
	while(true)
		{try
	{
	int b=in.nextInt();
	System.out.println(a/b);
	break;
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
}
	System.out.println("Hello");
	}
}