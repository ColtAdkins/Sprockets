package SprocketImplementation;

public class FlyingSprocket extends FlyingSprocketAbstract {

	@Override
	public void flyingSprocket(double price) {
		String size = "Large";
		String color = "Blue";
		if (price == 19.99) {
			 System.out.println("Jet - " + price + " - " + size + " " + color);
		} else if (price == 12.50) {
			System.out.println("Glider - " + price + " - " + size + " " + color);
		} else if (price == 4.80) {
			System.out.println("Biplane - " + price + " - " + size + " " + color);
		}
	}

}
