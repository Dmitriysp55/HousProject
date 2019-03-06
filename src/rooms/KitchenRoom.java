package rooms;

public class KitchenRoom extends Room {

	//static int area = 30; // m3
	static int width = 6;
	static int length = 5;
	
	public static void info(){
		System.out.println("\tKitchen:");
		aboutArea(width, length);
		showMap(width, length);
		delimeter();
	}
}
