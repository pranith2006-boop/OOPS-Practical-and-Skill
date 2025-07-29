package skill1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
