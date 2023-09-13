import java.util.Scanner;
class test3 
{
	static int fact=1,num,res;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		num=s.nextInt();
		 res=factorial(num);
		 System.out.println("the factorial of the "+num+" is"+res);
		}


public static int factorial(int a)
	{
		if(a>=2)
		{
			fact=fact*a--;
			factorial(a);
		}
		return(fact);

	}











}









