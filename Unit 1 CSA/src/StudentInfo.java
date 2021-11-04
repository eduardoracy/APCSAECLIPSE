
public class StudentInfo {

	public static void main(String[] args) {
		// Practice variable use
		String name = "Eduardo Racy";

		final int NUMCLASSES = 3;

		double avgGrade;

		double grade1 = 79.8;
		double grade2 = 81.3;
		double grade3 = 95.7;

		boolean isEnrolled = true;

		avgGrade = (grade1 + grade2 + grade3) / NUMCLASSES;

		// Display info
		System.out.println(name + " has " + NUMCLASSES + " classes,");
		System.out.println("and an average grade of " + avgGrade + ".");
		System.out.println("Receiving a " + grade1 + " in class 1.");
		System.out.println("Receiving a " + grade2 + " in class 2.");
		System.out.println("Receiving a " + grade3 + " in class 3.");

		System.out.println(name + " is currently enrolled in school " + isEnrolled + ".");

	}

}
