import java.util.*;
class test2
{
	static int last,m_sum,num,a;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number....");
		
		num=s.nextInt();
		last=num%10;//4
		 num/=10;//123
		 xylem(num);
		
	}


	public static int xylem( int a)
	{
		 if (a>9)//123,12,1
		   { 
			 m_sum=m_sum+(a%=10);//3,2
			 a/=10;//12,1
			 xylem(a);//12,1

		   }
		   if (m_sum==last+a)
	               System.out.println("the number is xylem");
				 else
					System.out.println("the number is not a xylem");


		   
			 return(m_sum);
				 }
				
				 
				 }


		







	
