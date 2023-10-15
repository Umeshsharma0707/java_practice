package oops;

import java.util.*;

class Vehicle{
	short maxspeed = 180;
}
class Car extends Vehicle{
	byte maxspeed = 120;
	
		public void displaySpeed() {
			System.out.println("Maximum speed : " + super.maxspeed);
		}
}
class Truck extends Car{
	byte maxspeed = 90;
	
		public void displayTruckSpeed() {
			System.out.println("Maximum Speed : " + super.maxspeed);
		}
}
public class Super_Variable_Keyword {
	public static void main(String[] args) {
		Truck alto = new Truck();
		alto.displaySpeed();;
		alto.displayTruckSpeed();
	}
}
