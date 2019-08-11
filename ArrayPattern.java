package exercise11aug19;

public class ArrayPattern {
	
	public void pattern1a()
	{ 
		System.out.println("Pattern 1");
		for(int i=3;i>=0;i--)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern1b()
	{
		System.out.println("Patter 1a");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern2a()
	{
		int ch=1;
		System.out.println("Patter 2a");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
	public void diamond()
	{
		System.out.println("Patter 2a");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==i)
				{
				System.out.print("&");
				}
			else
			{ 
				System.out.print(" ");
			}
			}		
			System.out.println();
		}
	}
	public void pattern2b()
	{
		int ch=1;
		System.out.println("Patter 2b");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ArrayPattern ap =new ArrayPattern();
		ap.pattern1a();
		ap.pattern1b();
		ap.pattern2a();
		ap.pattern2b();
		ap.diamond();
	}

}
