class rectangle
{
int length;
int width;
rectangle()
{
length=20;
width=30;
}
int area()
{
	return length*width;
}
}
class box extends rectangle
{
	int height;
	int vol()
	{
	return length*width*height;
	}
	void displaydim()
	{
	System.out.println("length:"+length+"width:"+width+"height:"+height);

	}
}
class boxmain
{
public static void main(String[]args)
{
	box B=new box();
	B.displaydim();
	System.out.println(B.vol());
	System.out.println(B.area());
}
}