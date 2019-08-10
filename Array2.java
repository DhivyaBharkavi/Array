package exercise10aug19;

import java.util.Scanner;

public class Array2 {
public void getInput()
{
	int i;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a length");
	int len=scan.nextInt();
	int a[]=new int[len];	
	for( i=0;i<len;i++)//for( i=0;i<=len;i=i+2) user give len 5 but it take 3 elements and display only
	{	
		a[i]=scan.nextInt();//error show in arrayindexbound of exception
		if(i==0)
		{
		System.out.println("Enter elements "+i);
		
		}
		//System.out.println(a[i]);
	}
	for( i=0;i<len;i++)
	{
		System.out.print(a[i]+"\t");
	}
	System.out.println();
	
	System.out.println("Even index\n");
	for( i=0;i<len;i=i+2)
	{
		System.out.print(a[i]+"\t");
	}
	System.out.println();
	
	System.out.println("Odd index\n");
	for( i=1;i<len;i=i+2)
	{
		System.out.print(a[i]+"\t");
	}
	System.out.println();
	
	System.out.println("Searching an element and find duplicate a elements");
	for( i=0;i<len;i++)
	{
		int count=0;
		if(a[i]==100)
		{
			count++;
			System.out.println(i+" Search "+100);
		}
		else
		{
			System.out.println(i+" is not search "+100);
		}
		System.out.println("The number of times 100 is "+count);
	}
	System.out.println();
	
	System.out.println("Searching a 3 digits of numbers ");
	for( i=0;i<len;i++)
	{
		if(a[i]>99 && a[i]<1000)
		{
			System.out.println("Find a 3 digit numbers is "+a[i]);
		}
		else if(a[i]>9 && a[i]<10)
		{
			System.out.println("Find a one digit numbers is "+a[i]);
		}
		
	}
	System.out.println();
	
	System.out.println("Replacing or removing an element by value based ");
	for( i=0;i<len;i++)
	{
		if(a[i]==96)
		{
			a[i]=98;
		}
		System.out.println("Replace a element "+a[i]);
	}
	System.out.println();
	
	System.out.println("Replacing an element by index based ");
	for( i=0;i<len;i++)
	{
		if(a[i]==94 && i==3)
		{
			a[i]=98;
		}
		else
		{
			a[i]=100;
		}
		System.out.println("Replace a element "+a[i]);
	}
	System.out.println();
	

	//System.out.println(a[i]); //run time arrayindexbound of exception in same i<=len and i<len
	}
	public static void main(String[] args) {
		Array2 a = new Array2();
		a.getInput();
}
}