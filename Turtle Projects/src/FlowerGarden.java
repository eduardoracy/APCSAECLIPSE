public class FlowerGarden {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		FlowerMaker sergio;
		sergio = new FlowerMaker();

		sergio.originDaySky();
		sergio.originLandscape();

		sergio.sleep(10000);

		sergio.originNightSky();
		sergio.originLandscape();

		sergio.sleep(10000);

		sergio.originDaySky();
		sergio.originLandscape();

	}
}