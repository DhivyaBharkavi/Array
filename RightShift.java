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
		System.out.println("First element to last position also shifting once");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int temp=a[0];i=0;
		while(i<a.length-1)
		{
			//System.out.println("I is "+i+" a["+i+"]");
			a[i+1]=a[i];
			i++;
			
		}
		a[a.length-1]=temp;
		for(i=0;i<5;i++)
		{
		System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
		public void shiftingtwice()
	{
		System.out.println("First and second element to last and previous position also shifting twice");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int temp=a[0],i=0;
		int temp1=a[1];
		while(i<a.length-2)
		{
			//System.out.println("I is "+i+" a["+i+"]");
			a[i]=a[i+1];
			i++;
			
		} 
		a[a.length-1]=temp;
		a[a.length-2]=temp1;
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
		a.shiftingtwice();
	}

}
