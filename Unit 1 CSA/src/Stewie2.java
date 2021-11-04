
public class Stewie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forward();
		victory();
		backward();
		victory();
		backward();
		victory();
		backward();
		victory();
		backward();
		victory();
		backward();
	}

	public static void forward() {
		System.out.println("//////////////////////");
		speed();
	}

	public static void victory() {
		System.out.println("|| Victory is mine! ||");
		speed();
	}

	public static void backward() {
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		speed();
	}

	public static void speed() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException ex) {
		}
	}
}
