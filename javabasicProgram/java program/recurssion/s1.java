class s1 
{
	static char ch;
	static{
		int a=10;
		System.out.println(a);
		System.out.println("hi frim SMLI-1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hi from main");
		System.out.println("bye from main");

	}

	static boolean b=true;
	static{
		int res=dinga();
		System.out.println("hi from SMLI-2"+res);
         } 



public static int dinga()
{

	System.out.println("hi from dinga");
	System.out.println("bye from dinga");
	return 4;
}
}