package skill2;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str1;

        System.out.print("Enter a string: ");
        str1 = sc.nextLine();

        System.out.println("Character Array as String: " + new String(charArray));
        System.out.println("User Entered String: " + str1);

        String str2 = new String(charArray);
        System.out.println("Converted Character Array to String: " + str2);

        sc.close();
    }
}
