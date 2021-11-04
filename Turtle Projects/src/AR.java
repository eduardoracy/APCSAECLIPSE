
public class AR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTurtle buice = new SmartTurtle();
		
		buice.paint(75, 30);
		buice.paint(-150, 30);
		buice.move(180, 15);
		buice.paint(75, 12);
		buice.paint(180,15);
		
		buice.move(0, 10);
		buice.move(-90, 14);
		
		buice.paint(180, 29);
		buice.move(180,8);
		buice.move(90, 8);
		buice.swingAround(8);
		
		buice.move(0, -3);
		buice.switchTo(Turtle.WHITE);
		buice.fillBox(8,16);
		
		buice.move(180,5);
		buice.move(-90,8);
		buice.switchTo(Turtle.BLACK);
		buice.paint(-90,8);
		
		buice.move(-90,16);
		buice.paint(-90,8);
		
		buice.paint(135,19);

	}

}
