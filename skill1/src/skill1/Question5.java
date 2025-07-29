package skill1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int digit;
		System.out.println("Enter the number(0-9): ");
		digit=sc.nextInt();
		switch(digit)
		{
		case 0:
			System.out.println("Zero\n");
			break;
		case 1:
			System.out.println("One\n");
			break;
		case 2:
			System.out.println("Two\n");
			break;
		case 3:
			System.out.println("Three\n");
			break;
		case 4:
			System.out.println("Four\n");
			break;
		case 5:
			System.out.println("Five\n");
			break;
		case 6:
			System.out.println("Six\n");
			break;
		case 7:
			System.out.println("Seven\n");
			break;
		case 8:
			System.out.println("Eight\n");
			break;
		case 9:
			System.out.println("Nine\n");
			break;
		default:
		System.out.println("Invalid input!\n Enter the number from 0 to 9");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
