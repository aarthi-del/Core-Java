class largest3
{
	public static void main(String[] args)
	{
		int a=12,b=100,c=78;
		int temp=(a>b)?a:b;
		int larger=(temp>c)?temp:c;
		System.out.println(larger);
	}
}

class demo
{
	public static void main(String[] args)
	{
		int a=14+32;
		int res=(a++ + a)+(a + ++a);
		System .out.println(res++ + res);
		int b=(res+ ++res)+(a+a++);
		boolean res1=(res>=a)||(a<=res);
		res1=!(res1);
		System.out.println(a++ + res);
		System.out.println(a+"-"+res);
		int res3=(b++ +b)+ a++;
		System.out.println((res++ +a)+res3++);
		System.out.println(!(res1));
		System.out.println(!(res1==res1));
		}
}

 public class demo1
{
	public static void main(String[] args)
	{
		char ch='d';
		char ch='c';
		char ch='c'+'a';
		System.out.println(ch2);

	}
}
