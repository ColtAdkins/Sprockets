package SprocketImplementation;

public class SwimmingSprocket extends SwimmingSprocketAbstract {

	@Override
	public void swimmingSprocket(String color) {
		double price = 9.99;
		String size = "Medium";
		if(color.equalsIgnoreCase("Green")) {
			System.out.println("Dog Paddle - " + price + " - " + size + " " + color);	
		} else if(color.equalsIgnoreCase("Yellow")) {
			System.out.println("Front Crawl - " + price + " - " + size + " " + color);	
		} else if(color.equalsIgnoreCase("Purple")) {
			System.out.println("Back Stroke - " + price + " - " + size + " " + color);	
		} 
	}

}
