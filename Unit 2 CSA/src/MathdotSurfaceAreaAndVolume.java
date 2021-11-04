import java.util.Scanner;

public class MathdotSurfaceAreaAndVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb;
		kb = new Scanner(System.in);

		System.out.print("Enter the radius of your circle: ");

		double circleRadius = kb.nextDouble();

		double circleSurfaceArea = Math.round((Math.pow(circleRadius, 2) * Math.PI * 4) * 100d) / 100d;

		double circleVolume = Math.round(((Math.pow(circleRadius, 3) * Math.PI * 4) / 3) * 100d) / 100d;

		System.out.println("The surface area of a circle with a radius of " + (int) circleRadius + " is "
				+ circleSurfaceArea + ".");
		System.out.print("The volume of a circle with a radius of " + (int) circleRadius + " is " + circleVolume + ".");

	}

}
