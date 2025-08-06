package skill4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter date-time format (e.g., dd/MM/yyyy HH:mm:ss): ");
        String formatPattern = sc.nextLine();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatPattern);
        String formattedDate = currentDateTime.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDate);
        sc.close();
		// TODO Auto-generated method stub

	}

}
