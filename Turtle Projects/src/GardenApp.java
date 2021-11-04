public class GardenApp {
// Draw 6 flowers all in a row, with a word title.
	public static void main(String[] args) {
		FlowerMaker florist;
		florist = new FlowerMaker();
		florist.drawTwoFlowers(); // the central two
		florist.sleep(300);
		florist.move(0, 120);
		florist.drawTwoFlowers(); // the two right of center
		florist.sleep(300);
		florist.move(0, -240);
		florist.drawTwoFlowers(); // the two left of center
		florist.sleep(300);
		florist.move(40, 130);
		florist.switchTo(Turtle.BLUE);
		florist.say("My flower garden"); // above the flowers
	} // ======================
}