package practical1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tomBag = 3;
        int jerryBag = 5;
        System.out.println("Before Swapping:");
        System.out.println("Tom's Bag: " + tomBag + " apples");
        System.out.println("Jerry's Bag: " + jerryBag + " apples");
        int temp = tomBag;
        tomBag = jerryBag;
        jerryBag = temp;
        System.out.println("\nAfter Swapping:");
        System.out.println("Tom's Bag: " + tomBag + " apples");
        System.out.println("Jerry's Bag: " + jerryBag + " apples");
        sc.close();
		// TODO Auto-generated method stub

	}

}
