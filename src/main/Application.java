package main;

import rooms.BedRoom;
import rooms.KitchenRoom;
import rooms.SportRoom;

public class Application {

	public static void main(String[] args) {
		BedRoom.info();
		KitchenRoom.info();
		SportRoom.info();
		BedRoom.Chair.Owner.watchTv();
	}

}
