
public class Lanterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		top();
		space();
		top();
		vertical();
		line();
		top();
		space();
		top();
		small();
		vertical();
		vertical();
		small();
		small();
	}

	public static void top() {
		System.out.println("    *****");
		System.out.println("  *********");
		System.out.println("*************");
	}

	public static void vertical() {
		System.out.println("* | | | | | *");
	}

	public static void line() {
		System.out.println("*************");
	}

	public static void small() {
		System.out.println("    *****");
	}

	public static void space() {
		System.out.println("");
	}

	public static void speed() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException ex) {
		}
	}

}
