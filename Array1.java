package exercise10aug19;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		/*int[] a = new int[-5];
		System.out.println(a);*///print hash code because it is a object
		int[] b = new int[0];
		System.out.println(b);//It prints hash code and hashing is algorithm unique memory reference created
		System.out.println(b.length);//It prints store to a position and how many rows it will be printed length is zero
		
		int[][] s=new int[2][5];
		System.out.println(s.length);//It is not a size but it is a length to say in array topic so length of array is 5
		//because in array row size is only specified
		
		int[][] c=new int[5][];//But you empty in column and it is a jagged array 
		//In each rwo we have number of different number of columns
		System.out.println(c.length);
		c =new int[0][5];
		c=new int[1][10];
		System.out.println(c.length);
		Scanner ss=new Scanner(System.in);//in is a static member
		char cc=ss.next().charAt(-1);//It also a chain method and StringIndexOutOfBoundsException
		System.out.println("Rest "+cc);//out 
				/*int[][] d=new int[][5];//So number of rows is must be specified you not give empty of row
		System.out.println(c.length);
		*/
		//number of rows must specified but number of columns is differ
		/*int[] e=new int[3][];//Syntax error
		e[0][5]={10,20,30,40};
		e[1][2]={100,200};*/
		//args[0]="AAA";//	java.lang.ArrayIndexOutOfBoundsException: 0
		//args[1]="BBB";
		args=new String[2];//this length is 2
		args[2]="CCC";//run time exception
		System.out.println(args.length);
	}

}
