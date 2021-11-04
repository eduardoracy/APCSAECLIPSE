import java.text.NumberFormat;
import java.util.Scanner;

public class redRobin {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		NumberFormat money;
		money = NumberFormat.getCurrencyInstance();
		NumberFormat percentage;
		percentage = NumberFormat.getPercentInstance();
		final double taxRate = 1.101;
		double entree = (Math.random() * 26 + 5);
		double subTotal = entree * taxRate;
		double qualityOfService = (Math.random());

		Scanner kb = new Scanner(System.in);

		System.out.println("Your Subtotal is " + money.format(entree)
				+ ". Your satisfaction with the quality of service is " + percentage.format(qualityOfService) + ".");
		System.out.print("What percentage would you like to tip? ");
		double tipPercentage = kb.nextDouble();
		double tip = tipPercentage + entree;
		double total = tip + subTotal;
		double outputTip = tipPercentage * 10;
		System.out.println("");
		System.out.println("Your check:");
		System.out.println("Entree: " + money.format(entree));
		System.out.println("SubTotal: " + money.format(subTotal));
		System.out.println("Gratuity: " + money.format(tip) + " (" + percentage.format(outputTip) + ")");
		System.out.println("Total: " + money.format(total));

	}
}