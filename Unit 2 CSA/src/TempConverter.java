import java.util.Scanner;

public class TempConverter {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner kb; 
		kb = new Scanner(System.in);
		System.out.print("What would you like to convert? ");
		String inputUnit = kb.nextLine();
		String baseUnit = null;

		if (inputUnit.contains("c")) {
			baseUnit = "Celcius";
		} else if (inputUnit.contains("k")) {
			baseUnit = "Kelvin";
		} else if (inputUnit.contains("f")) {
			baseUnit = "Fahrenheit";
		}

		System.out.print("What would you like to convert " + baseUnit + " to? ");
		String outputUnit = kb.nextLine();
		String finalUnit = null;

		if (outputUnit.contains("c")) {
			finalUnit = "Celcius";
		} else if (outputUnit.contains("k")) {
			finalUnit = "Kelvin";
		} else if (outputUnit.contains("f")) {
			finalUnit = "Fahrenheit";
		}

		System.out.print("Enter a temperature in " + baseUnit + ": ");
		double temp = kb.nextDouble();
		double tempFinal = 0;

		if (inputUnit.contains("c") && outputUnit.contains("c")) {
			tempFinal = temp;
		} else if (inputUnit.contains("c") && outputUnit.contains("k")) {
			tempFinal = temp + 273.15;
		} else if (inputUnit.contains("c") && outputUnit.contains("f")) {
			tempFinal = (temp * 9 / 5) + 32;
		} else if (inputUnit.contains("k") && outputUnit.contains("c")) {
			tempFinal = temp - 273.15;
		} else if (inputUnit.contains("k") && outputUnit.contains("k")) {
			tempFinal = temp;
		} else if (inputUnit.contains("k") && outputUnit.contains("f")) {
			tempFinal = (temp - 273.15) * 9 / 5 + 32;
		} else if (inputUnit.contains("f") && outputUnit.contains("c")) {
			tempFinal = (temp - 32) * 5 / 9;
		} else if (inputUnit.contains("f") && outputUnit.contains("k")) {
			tempFinal = (temp - 32) * 5 / 9 + 273.15;
		} else if (inputUnit.contains("f") && outputUnit.contains("f")) {
			tempFinal = temp;
		}
		
		System.out.println(temp + " " + baseUnit + " in " + finalUnit + " is " + tempFinal);

	}

}
