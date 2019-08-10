package exercise10aug19;

import java.util.Scanner;

public class Array3 {
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
	
	System.out.println("Reverse a element");
	for( i=0;i<len;i++)
	{
		System.out.println(a[a.length-i-1]);
	}
	System.out.println();
	
	System.out.println("Swapping an element using index based or descending order or reverse an array element");
	int j=a.length-1;
	while(i<j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	for( i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	/*System.out.println("Swapping an element using index based");
	for(j=0;j<a.length;j++)
	{
		for(j=a.length-1;>0;k--)
		{
			int temp=a[j];
			a[j]=a[k];
			a[k]=temp;	
		}
	}
	for( i=0;i<a.length;i++)
	{
		System.out.println(a[j]);
	}
	*/
	
	System.out.println();
	
	}
	public static void main(String[] args) {
	Array3 a = new Array3();
	a.getInput();
	}

}
