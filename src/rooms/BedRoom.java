package rooms;

//1) width = 6 x length = 10;
//2) about area --> calculate area(w,l);
//----
//3) method showMap() -> "**********"  ( where "*" = 1m3)
//----
//4) bonus
// output in showMap() coordinates of tv, condition (x, y)

public class BedRoom extends Room {
	
//	static int area = 60; // m3
	static int width = 6;
	static int length = 10;
	
	public static void info(){
		System.out.println("\tBEDROOM:");
		aboutArea(width, length);
		showMap(width, length);
		AirConditioning.about();
		BigTV.about();
		delimeter();
	}
	
	//SUbClasses --- inline class
	static class AirConditioning{
		int x_coord = 4;
		int y_coord = 2;
		static float power = 2.5f;
		static String brand = "Brown";
		
		static void about(){
			System.out.println("-- Conditioner: "+brand+ "("+power+" kw)");
		}
	}
	static class BigTV{
		int x_coord = 2;
		int y_coord = 5;
		static String brand = "Samsung";
		static int size = 40; 
		static void about(){
			System.out.println("-- TV: " + brand+ "("+size+"\")");
		}
	}
	
	public static class Chair{
		int x_coord = 4;
		int y_coord = 5;
		
		public static class Owner{
			
			public static void watchTv(){
				System.out.println("I am watching TV");
			}
		}
	}

}
