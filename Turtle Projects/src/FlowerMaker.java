public class FlowerMaker extends SmartTurtle {

	public void originLandscape() {
		originGroundAndObjects();
		originSunflowerGarden();
	}

//=================================================
	public void originSunflowerGarden() {
		sunflowerGarden();
		sunflowerGardenLocationReset();
	}

	public void sunflowerGardenLocationReset() {
		move(0, -35);
		move(90, 20);
		move(-90, 0);
	}

	public void sunflowerGarden() {
		move(0, -350);
		move(-90, 50);
		move(90, 0);
		drawRowOfFlowers();
		move(0, -366);
		move(90, 30);
		move(-90, 31);
		drawRowOfFlowers();
	}

	public void drawRowOfFlowers() {
		drawFlower();
		move(90, 61);
		drawFlower();
		move(90, 61);
		drawFlower();
		move(90, 61);
		drawFlower();
		move(90, 61);
		drawFlower();
		move(90, 61);
		drawFlower();
		move(90, 61);
	}

	public void drawFlower() {
		switchTo(PLASCONFLOWERSTEMGREEN);
		paint(90, 50);
		paint(90, 2);
		paint(90, 50);
		paint(90, 1);
		paint(90, 10);
		paint(-45, 8);
		drawLeaf();
		paint(45, 10);
		paint(45, 8);
		drawLeaf();
		paint(-45, 30);
		switchTo(SUNFLOWERYELLOW);
		fillCircle(15);
		switchTo(BLACK);
		fillCircle(5);
		move(180, 50);
	}

	public void drawLeaf() {
		switchTo(GREEN);
		fillCircle(3);
		move(0, 3);
		fillCircle(2);
		move(0, 2);
		fillCircle(1);
		move(0, -13);
		switchTo(PLASCONFLOWERSTEMGREEN);
	}

//==============================================

	public void originGroundAndObjects() {
		groundAndObjects();
		groundLocationReset();
	}

	public void groundLocationReset() {
		move(180, -54);
		move(90, 33);
		move(-90, 0);
	}

	public void groundAndObjects() {
		drawHills();

		move(0, 150);
		move(90, 75);
		move(-90, 0);

		drawHouse();

		move(180, 0);
		move(0, -150);
		move(-90, 30);

		move(90, 0);

		constructionCone();

		move(75, 40);
		move(-90, 5);
		move(90, 0);

		constructionSign();
	}

	public void drawHills() {
		move(0, -150);
		switchTo(GRASSGREEN);
		makeCircumscribedHalfCircle();
		move(0, -100);
		move(-90, -50);
		move(90, 0);
		makeCircumscribedHalfCircle();
		move(-90, 25);
		move(90, -75);
		makeCircumscribedHalfCircle();
		move(0, 325);
		move(-90, 150);
		move(90, 0);
		fillBox(800, 350);
	}

	public void makeCircumscribedHalfCircle() {
		fillCircle(75);
		switchTo(BLACK);
		swingAround(75);
		switchTo(GRASSGREEN);
		move(-90, 38);
		move(90, 0);
		fillBox(150, 75);
		move(-90, -38);
		move(90, 0);
	}

	public void drawHouse() {
		switchTo(BLACK);
		paint(0, 50);
		paint(90, 75);
		paint(90, 50);
		paint(90, 75);
		move(180, 75);
		move(-90, 50);
		makeBigTriangle();
		makeParallelogram();
		paint(-30, 75);
		paint(90, 100);
		paint(90, 75);
		paint(90, 100);
		move(180, 51);
		move(-90, 38);
		move(90, 0);
		switchTo(ff2bb4);
		fillBox(99, 74);
		move(90, 38);
		move(90, 75);
		move(90, 38);
		fillBox(49, 74);
		move(0, 12);
		switchTo(WHITE);
		fillBox(25, 50);
		move(-90, 6);
		switchTo(BLACK);
		fillCircle(3);
	}

	public void constructionCone() {
		// Jiawei's idea - not credible <- inside joke
		switchTo(CONSTRUCTIONCONEORANGE);
		paint(0, 30);
		paint(90, 5);
		paint(90, 30);
		paint(90, 5);
		move(90, 6);
		move(90, 5);
		paint(-15, 35);
		paint(-150, 35);
	}

	public void constructionSign() {
		switchTo(BLACK);
		paint(0, 10);
		paint(90, 20);
		paint(90, 10);
		paint(90, 20);
		move(180, 20);
		move(90, 33);
		paint(-90, 25);
		paint(-90, 75);
		paint(-90, 25);
		paint(-90, 75);

		switchTo(OAKBROWN);
		move(-90, 12);
		move(-90, 38);
		fillBox(74, 24);
		move(0, -38);
		move(90, -12);
		move(90, -33);
		move(0, -5);
		move(90, 10);
		move(90, 0);

		fillBox(9, 20);
		move(90, 10);
		move(90, 5);
		move(0, 33);

		move(-90, 12);
		move(-90, 5);
		switchTo(WHITE);
		say("Roof Under");
		move(-90, 10);
		move(-90, 2);
		say("Construction");
	}

//=================================================================
	public void flock() {
		bird();
		move(-90, 15);
		move(90, 0);
		bird();
		move(90, 15);
		move(-90, 0);
		bird();
	}

	public void bird() {
		switchTo(BLACK);
		swingAround(5);
		move(0, -2);
		switchTo(SKYBLUE);
		fillBox(6, 12);
		move(0, 2);
		move(0, 3);
		move(-90, 3);
		move(90, 0);
		fillBox(6, 6);

		move(90, 3);
		move(-90, -3);
		move(0, 10);
		move(180, 0);

		switchTo(BLACK);
		swingAround(5);
		move(0, -3);
		switchTo(SKYBLUE);
		fillBox(6, 12);
		move(0, 2);
		move(0, 3);
		move(90, 3);
		move(-90, 0);
		fillBox(6, 6);

		move(-90, 3);
		move(-90, 3);
	}
//================================================================

	public void clouds() {
		cloud();
		move(0, 75);
		move(-90, 15);
		move(90, 0);
		cloud();
		move(0, 75);
		move(-90, -15);
		move(90, 0);
		cloud();
	}

	public void cloud() {
		switchTo(CHRYSLERCLOUDGREY);
		cloudSection();
		cloudSection();
		cloudSection();
		cloudSection();
	}

	public void nightClouds() {
		nightCloud();
		move(0, 75);
		move(-90, 15);
		move(90, 0);
		nightCloud();
		move(0, 75);
		move(-90, -15);
		move(90, 0);
		nightCloud();
	}

	public void nightCloud() {
		switchTo(NEROLACDARKCLOUDGREY);
		cloudSection();
		cloudSection();
		cloudSection();
		cloudSection();

	}

	public void cloudSection() {
		fillCircle(20);
		move(0, 12);
		move(90, 20);
		fillCircle(20);
		move(180, 20);
		move(90, 12);
		fillCircle(20);
	}

//=============================================================
	public void sun() {
		switchTo(SUNFLOWERYELLOW);
		fillCircle(30);
	}

	public void moon() {
		switchTo(MOONWHITE);
		fillCircle(30);
		move(0, 15);
		switchTo(NIGHTSKYCETACEANBLUE);
		fillCircle(30);
	}

//=============================================================
	public void originDaySky() {
		daySky();
		daySkyLocationReset();
	}

	public void daySky() {
		switchTo(SKYBLUE);
		fillBox(800, 600);
		move(0, 340);
		move(90, 265);
		move(-90, 0);
		sun();
		move(0, -600);
		move(-90, 15);
		move(90, 0);
		clouds();
		move(0, 50);
		move(-90, 40);
		move(90, 0);
		flock();
	}

	public void originNightSky() {
		nightSky();
		nightSkyLocationReset();
	}

	public void nightSky() {
		switchTo(NIGHTSKYCETACEANBLUE);
		fillBox(800, 600);
		move(0, 340);
		move(90, 265);
		move(-90, 0);
		fillBox(30, 30);
		moon();
		move(0, -600);
		move(-90, 15);
		move(90, 0);
		nightClouds();
		move(0, 50);
		move(-90, 40);
		move(90, 0);
		move(0, 15);
		move(-90, 15);
		move(90, 0);
		switchTo(NIGHTSKYCETACEANBLUE);
		fillBox(15, 15);
	}

	public void nightSkyLocationReset() {
		daySkyLocationReset();
		move(90, 15);
		move(-90, 3);
	}

	public void daySkyLocationReset() {
		move(0, -10);
		move(90, -15);
		move(-90, 0);
		move(0, -10);
		move(-90, -15);
		move(90, 0);
		move(0, -10);
		// first part of flock
		move(-90, -40);
		move(90, -50);
		// from clouds to flock
		skyLocationResetCloudSection();
		move(-90, 15);
		move(90, -75);
		skyLocationResetCloudSection();
		move(-90, 15);
		move(90, -75);
		skyLocationResetCloudSection();
		// within clouds
		move(90, 15);
		move(-90, 600);
		// from sun to clouds
		move(-90, 235);
		move(-90, 631);
		move(180, 0);
		// from sun to starting location
	}

	public void skyLocationResetCloudSection() {
		move(0, 12);
		move(-90, -20);
		move(180, 0);
		move(0, -20);
		move(-90, -12);
		move(0, 12);
		move(-90, -20);
		move(180, 0);
		move(0, -20);
		move(-90, -12);
		move(0, 12);
		move(-90, -20);
		move(180, 0);
		move(0, -20);
		move(-90, -12);
		move(0, 12);
		move(-90, -20);
		move(180, 0);
		move(0, -20);
		move(-90, -12);
	}
	
//============================================================
	public void locate() {
		// use switchTo before locate
		fillCircle(3);
		switchTo(BLACK);
		paint(0, 100);
	}
	// 0975497 - 072012mm
}