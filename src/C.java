class C
{
	public static void main(String[]args)
	{
	//B b=new B();          RUN
	//b.set();              RUN 
	//b.fun1();             RUN
	//b.display();          RUN
		//does not run;display is outside A
		//A a=new B();      
		//a.set();          RUN
		//a.get();          RUN
		//a.fun1();         error cannot reference the elements of b
		//a.display();
		
		//A a;
		//B b=new B();
		///a=(A)b;
		//a.set();
		//a.get();
		//a.data=1000 ERROR

		A a=new A();
		B b=new B();
		X x=new X();
		A ob;
		ob=a;
		ob.myfun();
		ob=b;
		ob.myfun();
		ob=x;
		ob.myfun();
	}
}