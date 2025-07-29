package skill1;
import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("Enter the value: ");
		n=sc.nextInt();
		double a;
		System.out.println("Enter the value: ");
		a=sc.nextDouble();
		Integer b=n;
		Double c=a;
		int unboxedInt=b;
		double unboxedDouble =c;
		System.out.println("int: "+ n);
		System.out.println("Integer: "+ b);
		System.out.println("Unboxed int: "+ unboxedInt);
		System.out.println("double: "+ a);
		System.out.println("Double: "+ c);
		System.out.println("Unboxed double: "+ unboxedDouble);
		sc.close();
		// TODO Auto-generated method stub

	}

}
