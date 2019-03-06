package rooms;

public class Room {

	public static void aboutArea(int width, int length){
		int area = width*length;
		System.out.println("Area: "+area+" m3");
	}

	public static void showMap(int width, int length){
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == length  ){
					System.out.print(" * ");
				}
				else{
					if (j== 1 || j == width ){
						System.out.print(" * ");
					}else{
						System.out.print("   ");
					}
				}
			}

			System.out.print("\n");

		}
	}

	public static void delimeter(){
		System.out.println("-------------------");
	}
}
