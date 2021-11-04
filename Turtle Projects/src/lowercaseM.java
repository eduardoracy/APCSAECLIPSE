
public class lowercaseM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTurtle kay = new SmartTurtle();

		kay.paint(-90, 20);
		kay.move(0, -10);
		kay.move(90, 10);
		kay.makeHalfCircle();
		kay.move(0, 9);
		kay.move(90, 5);
		kay.switchTo(Turtle.BLACK);
		kay.paint(0, -10);
		kay.move(0, 10);
		kay.move(-90, 10);
		kay.makeHalfCircle();
		kay.move(0, 9);
		kay.move(90, 5);
		kay.switchTo(Turtle.BLACK);
		kay.paint(0, -10);

	}

}
