package rooms;

//1) width = 6 x length = 10;
//2) about area --> calculate area(w,l);
//----
//3) method showMap() -> "**********"  ( where "*" = 1m3)
//----
//4) bonus
// output in showMap() coordinates of tv, condition (x, y)

public class BedRoom extends Room {
	
	static int area = 60; // m3
	
	public static void info(){
		System.out.println("\tBEDROOM:");
		aboutArea(area);
		AirConditioning.about();
		BigTV.about();
		delimeter();
	}
	
	//SUbClasses --- inline class
	static class AirConditioning{
		static float power = 2.5f;
		static String brand = "Brown";
		
		static void about(){
			System.out.println("-- Conditioner: "+brand+ "("+power+" kw)");
		}
	}
	static class BigTV{
		static String brand = "Samsung";
		static int size = 40; 
		static void about(){
			System.out.println("-- TV: " + brand+ "("+size+"\")");
		}
	}
	
	public static class Chair{
		
		
		public static class Owner{
			
			public static void watchTv(){
				System.out.println("I am watching TV");
			}
		}
	}

}
