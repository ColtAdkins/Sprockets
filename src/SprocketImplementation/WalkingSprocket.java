package SprocketImplementation;

public class WalkingSprocket extends WalkingSprocketAbstract {
	public void walkingSprocket(double price) {
		if (price == 9.99) {
			 System.out.println("Soldier - " + price + " - can run and fight" + " Large " + "Camo");
		} else if (price == 6.58) {
			System.out.println("Cook - " + price + " - can walk and serve food" + " Large " + "White");
		} else if (price == 2.99) {
			System.out.println("Grandma - " + price + " - Hobbles and shares knowledge" + " Small " + "Lilac");
		}
	}
}
