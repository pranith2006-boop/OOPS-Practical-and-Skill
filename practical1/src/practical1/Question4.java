package practical1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(n + " is a perfect number");
		}
		else
		{
			System.out.println(n + " is not a perfect number");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
