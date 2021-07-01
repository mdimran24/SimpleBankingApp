import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a letter");
		int input = scanner.nextInt();
		System.out.print("Inputted Number Is: " + input);
	}
}
