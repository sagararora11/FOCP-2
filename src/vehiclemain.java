import java.util.*;
class vehiclemain
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter the no. of tyres");
	int n=in.nextInt();
	vehicle ob=new vehicle();
	car ob1=new car();
	bike ob2=new bike();
	int a;
	switch(a)
	{
	case 2:
	ob2.dislay();
	break;
	case 4:
    ob1.display();
    break;
    default
    ob.display();
	}
}
}