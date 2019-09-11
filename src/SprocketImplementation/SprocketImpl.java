package SprocketImplementation;
public class SprocketImpl implements Sprocket {
	
	public static void main(String[] args) {
		WalkingSprocket walk = new WalkingSprocket();
		walk.walkingSprocket(9.99);
		walk.walkingSprocket(6.58);
		walk.walkingSprocket(2.99);
		FlyingSprocket fly = new FlyingSprocket();
		fly.flyingSprocket(19.99);
		fly.flyingSprocket(12.50);
		fly.flyingSprocket(4.80);
		SwimmingSprocket swim = new SwimmingSprocket();
		swim.swimmingSprocket("Green");
		swim.swimmingSprocket("Yellow");
		swim.swimmingSprocket("Purple");
	}

	@Override
	public void sprocket(String purpose) {
		//Code here
	}
}
