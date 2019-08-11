package exercise11aug19M;

import java.util.Scanner;

public class ArraySearching {
	Scanner scan=new Scanner(System.in);
	//int len;
	int[] a = new int[5];
	public void getInput()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Enter elements "+i);
			a[i]=scan.nextInt();
		}
		System.out.println("Given elements are \n");
		for(i=0;i<5;i++)
		{
		System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	
	public void searching()
	{
		int count=0;
		System.out.println("Searching an element and find duplicate a elements");
		for(int i=0;i<5;i++)
		{
			if(a[i]==100)
			{
				count++;
				System.out.println(i+" Search "+100);
			}
			else
			{
				System.out.println(i+" is not search "+100);
			}
		}
		System.out.println("The number of times 100 is "+count);
		System.out.println();
	}
	public static void main(String[] args) {
	ArraySearching as = new ArraySearching();
	as.getInput();
	as.searching();
	}

}
