
public class EggStop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		egg();
		teaCup();
		space();
		stopSign();
		crackedEggTop();
	}

	public static void eggTop() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}

	public static void eggBottom() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}

	public static void line() {
		System.out.println("+--------+");
	}

	public static void stop() {
		System.out.println("|  STOP  |");
	}

	public static void space() {
		System.out.println("");
		speedSpace();
	}

	public static void egg() {
		eggTop();
		eggBottom();
		speedNormal();
	}

	public static void stopSign() {
		eggTop();
		stop();
		eggBottom();
		speedStop();
	}

	public static void crackedEggTop() {
		eggTop();
		line();
		speedNormal();
	}

	public static void teaCup() {
		eggBottom();
		line();
		speedNormal();
	}

	public static void speedNormal() {
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException ex) {
		}
	}

	public static void speedStop() {
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException ex) {
		}
	}

	public static void speedSpace() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ex) {
		}
	}
}
