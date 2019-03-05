package rooms;

public class KitchenRoom extends Room {

	static int area = 30; // m3
	
	public static void info(){
		System.out.println("\tKitchen:");
		aboutArea(area);
		delimeter();
	}
}
