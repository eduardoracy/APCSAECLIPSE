
public class Demo1 {

	public static void main(String[] args) {
		Turtle demo;
		demo = new Turtle();
		
		demo.switchTo(Turtle.BLUE);
		
		demo.paint(90, 10);
		demo.paint(90, 10);
		demo.paint(90, 10);
		demo.paint(90, 10);

		demo.move(0, 10);

		demo.switchTo(Turtle.RED);
		
		demo.paint(0, 40);
		demo.paint(90, 40);
		demo.paint(90, 40);
		demo.paint(90, 40);

	}
}
