import java.util.Scanner;

public class MathdotDistanceFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb;
		kb = new Scanner(System.in);

		System.out.print("Enter x1: ");
		double x1 = kb.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = kb.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = kb.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = kb.nextDouble();

		double distance = Math.round((Math.sqrt((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))))) * 100d) / 100d;

		System.out.println(
				"The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance + ".");

	}

}
