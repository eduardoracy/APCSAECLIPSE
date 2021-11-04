import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		// Part A

		// input
		System.out.print("Enter a temperature in Fahrenheit: ");
		int tempFah = kb.nextInt();

		// calculations
		double tempCelcius = (tempFah - 32.0) * (5.0 / 9.0);

		// output
		System.out.println("Your temperature in Celcius" + tempCelcius);

		// Part B

	}

}
