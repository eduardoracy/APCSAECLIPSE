
public class Person {

	// Instance data - Attributes
	private String name;
	private int age;
	private boolean isAdult;

	// ==========================

	// Constructor
	public Person(String myName, int myAge, boolean myAdult) {
		name = myName;
		age = myAge;
		isAdult = myAdult;
	}

	// ==========================

	public String toString() {
		String result;
		result = "My name is " + name + "\n";
		result += "My age is " + age + "\n";
		result += "I am an adult is " + isAdult + "\n";
		return result;
	}

	// =========================

}
