package practical1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter the character: ");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("The character is a vowel");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("The character is consonant");
		}
		else
		{
			System.out.println("The character is not an alphabet");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
