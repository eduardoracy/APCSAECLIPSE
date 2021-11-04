import java.text.DecimalFormat;
import java.util.Scanner;

public class MathdotQuadraticFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb;
		kb = new Scanner(System.in);

		DecimalFormat sig;
		sig = new DecimalFormat("#.###");

		System.out.print("Enter a: ");
		double a = kb.nextDouble();
		System.out.print("Enter b: ");
		double b = kb.nextDouble();
		System.out.print("Enter c: ");
		double c = kb.nextDouble();

		System.out.print("\\033[H\\033[2J");
		System.out.flush();
		
		double quadraticPlus = (-1 * b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		double quadraticMinus = (-1 * b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);

		String bOperator;
		String cOperator;

		if (b >= 0) {
			bOperator = "+";
		} else {
			bOperator = "-";
			b *= -1;
		}
		if (c >= 0) {
			cOperator = "+";
		} else {
			cOperator = "-";
			c *= -1;
		}
		System.out.println("The solutions of the function (" + a + ")x^2 " + bOperator + " " + b
				+ "x " + cOperator + " " + c + " are x=" + sig.format(quadraticPlus) + " and x=" + sig.format(quadraticMinus)
				+ ".");

	}

}
