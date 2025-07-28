package skill1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		int fact=1;
		if(n<0)
		{
			System.out.println("Factorial is not defined for negative numbers");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of " + n + " is: " + fact);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
