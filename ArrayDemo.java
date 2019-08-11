package exercise11aug19M;
import java.util.Scanner;
public class ArrayDemo {
	Scanner scan=new Scanner(System.in);
	public void getInput()
	{
		int i;
		System.out.println("Enter a length");
		int len=scan.nextInt();
		int[] a = new int[len];
		for(i=0;i<len;i++)
		{
			System.out.println("Enter elements "+i);
			a[i]=scan.nextInt();
		}
		System.out.println("Given elements are \n");
		for(i=0;i<len;i++)
		{
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		System.out.println("Even elements are \n");
		for(i=0;i<len;i=i+2)
		{
		System.out.print("a["+a[i]+"] in even index is a["+i+"]\n");
		}
		System.out.println();
		
		System.out.println("Odd elements are \n");
		for(i=1;i<len;i=i+2)
		{
		System.out.print("a["+a[i]+"] in even index is a["+i+"]\n");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayDemo ae=new ArrayDemo();
		ae.getInput();
	}
}
