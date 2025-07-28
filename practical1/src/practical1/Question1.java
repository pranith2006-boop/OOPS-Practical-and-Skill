package practical1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter base amount: ");
        double baseAmount = sc.nextDouble();
        double gst = 0.18 * baseAmount;
        double maintenance = 0.05 * baseAmount;
        double total = baseAmount + gst + maintenance;
        double discountRate = total > 1000 ? 0.10 : 0.05;
        double discount = discountRate * total;
        double finalBill = total - discount;
        System.out.println("Base Amount: " + baseAmount);
        System.out.println("GST (18%): " + gst);
        System.out.println("Maintenance Charges (5%): " + maintenance);
        System.out.println("Total before discount: " + total);
        System.out.println("Discount (" + (discountRate * 100) + "%): " + discount);
        System.out.println("Final Bill: " + finalBill);
        sc.close();
		// TODO Auto-generated method stub

	}

}
