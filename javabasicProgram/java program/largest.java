import java.util.*;
class  LargestOfThree
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("enter 5 number : ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		int thirdLargest;
		if(a>b && a>c && a>d && a>e)
		{ 
			if (b>c && b>d && d>e){
				thirdLargest=b;
			}else if (c>d && c>e)
			{
				thirdLargest=c;
			} else if (d>e)
			{thirdLargest=d;
			} else { thirdLargest=e;
			}
		}
		else if(  b>a && b>c && b>d && b>e )
		{ 
			if (  a>c&&a>d && a>e){
				thirdLargest=a;
			}else if ( c>d && c>e)
			{
				thirdLargest=c;
			} else if (d>e)
			{thirdLargest=d;
			} else { thirdLargest=e;
			}
		} else if (  c>a && c>b && c>d && c>e )
		{ 
			if (  a>b && a>d && a>e)
				
			{
				thirdLargest=a;
			}else if ( b>d&&b>e)
			{
				thirdLargest=b;
			} else if (d>e)
			{ thirdLargest=d;
			} else { thirdLargest=e;
			}
		} else if  (  d>a && d>b && d>c && d>e )
		{ 
			if (  a>b&&a>c && a>e)
				
			{
				thirdLargest=a;
			}else if ( b>c&&b>e)
			{
				thirdLargest=c;
			} else if (c>e)
			{thirdLargest=c;
			} else { thirdLargest=e;
			} }
			else  {
			if  (  a>b && a>c && a>d  )
		{ 	
				thirdLargest=a;
			}else if ( b>c&&b>d)
			{
				thirdLargest=b;
			} else if (c>d)
			{
				thirdLargest=c;
			}
			else { thirdLargest=d;
			}
			}
			
            System.out.println("the largest id third number is"+thirdLargest);
		}
	}
