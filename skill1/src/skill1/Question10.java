package skill1;
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value;
        int a;
        System.out.print("Enter the number: ");
        value = sc.nextDouble();
        a = (int) value; 
        System.out.println("Original Double value: " + value);
        System.out.println("The Converted int value: " + a);
        sc.close();
    }
}
