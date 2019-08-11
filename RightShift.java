package exercise11aug19M;

import java.util.Scanner;

public class RightShift {
	private int i;
	Scanner scan=new Scanner(System.in);
	int[] a = new int[5];
	public void getInput()
	{
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
	public void shiftingonce()
	{
		System.out.println("Shifting once");
		int temp=a[0];
		while(i<a.length)
		{
			System.out.println("I is "+i+" a["+i+"]");
			a[i+1]=a[i];
			i++;
			
		}
		a[i-1]=temp;
		for(i=0;i<5;i++)
		{
		System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RightShift rs = new RightShift();
		rs.getInput();
		rs.shiftingonce();
	}

}
