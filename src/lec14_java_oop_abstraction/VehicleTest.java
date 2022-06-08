package lec14_java_oop_abstraction;

public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		Toyota.totyotaInfo(); // if a method is static, no need to create object, the class or Interface can directly call it.
		toyota.toyotaPrice();
		toyota.expensive();
		toyota.canFloat();
		toyota.price();
		toyota.electricCarName();
		toyota.autoPilot();
		toyota.rent();
		toyota.carryingpassenger();
		toyota.carryingGoods();
		toyota.lightWeight();
		toyota.start(); // this start method is overridden method
		toyota.stop();
		toyota.brake();
		Toyota.battery(); // battery is a static method in Abstract class, Toyota extends that Abstract class, 
		// so, Toyota itself can initialize that method, but in terms of Interface, it (gear method) is not allowed for Toyota
		toyota.flyingFeature();
		toyota.honk();  // it can call the default type method of Interface
		toyota.honk1();
		// toyota.gear(); // gear () is a static method of an Interface, static method can't be call by object
		
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		// Cannot instantiate the type Car
		// an interface can't be instantiated, it needs the help of a concrete class, here Toyota is a concrete class, Because Toyota implements Car
		// Interview question: why can't instantiate? because implementation is not complete because of abstract methods present 
		Car car = new Toyota();
		car.start(); // this start method is abstract method, but implemented in Toyota Class by overridden method
		car.stop();
		car.brake();
		car.honk();
		car.honk1();
		// car.gear(); // doesn't work	
		Car.gear(); // no need of object, Interface/class can directly call static methods
		car.rent();
		car.carryingpassenger();
		car.carryingGoods();
		System.out.println("The Car invented in: " + Car.bornYear); // final type variable is initialized here.
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		// Cannot instantiate the type ElectricCar
		// an abstract class can't be instantiated, it needs the help of a concrete class, here Toyota is the concrete class
		// Interview question: why? because implementation is not complete because of abstract methods present
		ElectricCar electricCar = new Toyota();
		ElectricCar.battery();
		// TODO: Nasir, real implementation of price()? as it is in Interface and also in Abstract class
		electricCar.price();
		electricCar.electricCarName();
		electricCar.flyingFeature();
		electricCar.autoPilot();
		electricCar.expensive();
		electricCar.canFloat();
		System.out.println("Electric Car name: " + electricCar.nameElectricCar + ", and price: " + electricCar.costElectricCar);
		
		System.out.println("\n--------------------- Not Instantiating here: Drone, FlyingCar, Ferrari, HoverCar, Mercedes, Rocket, Taxi, Truck. But possible ------------------------\n");
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
