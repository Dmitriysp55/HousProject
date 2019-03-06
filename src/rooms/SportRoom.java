package rooms;

public class SportRoom extends Room{

	//static int area = 100;
	static int width = 10;
	static int length = 10;

	public static void info(){
		System.out.println("\tSPORTROOM:");
		aboutArea(width, length);
		showMap(width, length);
		delimeter();
	}

}
