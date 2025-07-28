package practical1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Square roots from 1 to " + n + ":");
        for (int i = 1; i <= n; i++)
        {
            double sqrt = Math.sqrt(i);
            System.out.printf("The answer is = %.3f\n",sqrt);
        }
		sc.close();
		// TODO Auto-generated method stub

	}

}
