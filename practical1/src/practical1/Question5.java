package practical1;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter a character: ");
		ch=sc.next().charAt(0);
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			System.out.println(ch + " is an alphabet");
		}
		else
		{
			System.out.println(ch + " is not an alphabet");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
