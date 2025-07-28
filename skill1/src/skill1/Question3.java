package skill1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int V;
		System.out.println("Enter the age of the person:");
		V=sc.nextInt();
		if(V>=18)
		{
			System.out.println("The person is eligible to vote");
		}
		else
		{
			System.out.println("The person is not eligible for vote");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
