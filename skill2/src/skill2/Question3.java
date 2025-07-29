package skill2;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuffer sb = new StringBuffer(input);

        System.out.println("Original String: " + sb);

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        sb.replace(0, 4, "Learn");
        System.out.println("After replace: " + sb);

        sb.delete(5, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Current capacity: " + sb.capacity());

        sc.close();
    }
}


