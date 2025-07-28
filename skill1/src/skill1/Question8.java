package skill1;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		int reversed=0;
		while(n!=0)
		{
			int digit=n%10;
			reversed=reversed*10+digit;
			n=n/10;
		}
		System.out.println("Reversed number: "+ reversed);
		sc.close();
		// TODO Auto-generated method stub

	}

}
