package rooms;

public class Room {

	public static void aboutArea(int width, int length){
		int area = width*length;
		System.out.println("Area: "+area+" m3");
	}

	public static void showMap(int width, int length){
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == length-1  ){
					System.out.print(" * ");
				}
				else{
					if (j== 0 || j == width-1 ){
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
