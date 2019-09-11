
public abstract class SwimmingSprocket implements Sprocket {
	
	public String getPurpose() {
		return "Swim";
	}
	
	public double getPrice() {
		return 9.99;
	}
	
	public String getSize() {
		return "Medium";
	}
	
	public abstract String getPackaging();
}
