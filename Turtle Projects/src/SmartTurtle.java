public class SmartTurtle extends Turtle {
	public void makeSmallSquare() {
		paint(90, 10);
		paint(90, 10);
		paint(90, 10);
		paint(90, 10);
	}

	public void makeBigSquare() {
		paint(90, 40);
		paint(90, 40);
		paint(90, 40);
		paint(90, 40);
	}

	public void makeHexagon() { 
		paint(60, 40);
		paint(60, 40);
		paint(60, 40);
		paint(60, 40);
		paint(60, 40);
		paint(60, 40);
	}

	public void makeBigTriangle() {
		paint(120, 50);
		paint(120, 50);
		paint(120, 50);
	}

	public void makeKite() {
		paint(-50, 11);
		paint(65, 24);
		paint(140, 24);
		paint(65, 11);
	}

	public void makeHalfCircle() {
		swingAround(10);
		move(0, -10);
		move(-90, 5);
		move(90, 11);
		switchTo(Turtle.WHITE);
		fillBox(21, 11);
	}
	public void makeParallelogram() {
		paint(0,100);
		paint(120,50);
		paint(60,100);
		paint(120,50);
		
	}
}