
public class OneTwoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three();
		dots();
		System.out.println();
		Two();
		dots();
		System.out.println();
		One();
		dots();

	} // close main

//=========================================
	public static void One() {
		System.out.print("Inside method one");
	}

//============================================
	public static void Two() {
		System.out.print("Inside method two");
	}

//==========================================
	public static void Three() {
		System.out.print("Inside method three");
	}
//========================================
	public static void dots() {
		System.out.print("...");
		try {

			Thread.sleep(300);
			}catch(InterruptedException ex) {

			}
	}
}