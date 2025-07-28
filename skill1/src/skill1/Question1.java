package skill1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the number a:");
		a=sc.nextInt();
		System.out.println("Enter the second number b:");
		b=sc.nextInt();
		System.out.println("Enter the third number c:");
		c=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is largest");
		}
		else if(b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
		sc.close();
		// TODO Auto-generated method stub
	}

}
