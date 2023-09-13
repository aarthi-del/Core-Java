class  test1
{
	static int n1=0,n2=1,n3,series;
	public static void main(String[] args) 
	{
		System.out.print( n1+ " " + n2);
		fabnacci();
	}


public static void fabnacci()
{
	if (series<=10)
	{
	
	
    n3=n1+n2;
	System.out.print(" "+n3+" ");
	n1=n2;
	n2=n3;
	series++;
	fabnacci();
	}

	
}

}
