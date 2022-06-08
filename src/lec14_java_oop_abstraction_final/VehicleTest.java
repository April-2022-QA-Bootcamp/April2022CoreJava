package lec14_java_oop_abstraction_final;

public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		Toyota.totyotaInfo();
		Toyota.battery();
		toyota.price();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.honk();
			
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		Car car = new Toyota();
		car.start();
		car.stop();
		car.brake();
		car.honk();
		Car.gear(); 
				
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new Toyota();
		ElectricCar.battery();
		electricCar.price();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
