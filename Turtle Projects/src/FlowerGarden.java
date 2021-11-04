public class FlowerGarden {

	public static void main(String[] args) {

		FlowerMaker sergio;
		sergio = new FlowerMaker();
		FlowerMaker arthur;
		arthur = new FlowerMaker();
		FlowerMaker claudia;
		claudia = new FlowerMaker();
		FlowerMaker laila;
		laila = new FlowerMaker();

		arthur.daySky();

		sergio.GroundAndObjects();

		claudia.SunflowerGarden();

		sergio.sleep(10000);

		arthur.skyLocationReset();
		arthur.nightSky();

		laila.GroundAndObjects();
		
		//claudia.SunflowerGardenLocationReset();
		claudia.SunflowerGarden();

		/*
		 * sergio.sleep(10000); 
		 * arthur.skyLocationReset(); 
		 * arthur.daySkyReset();
		 * 
		 * sergio.drawHills(); 
		 * sergio.GroundAndObjects();
		 * 
		 * claudia.SunflowerGarden();
		 */
	}
}