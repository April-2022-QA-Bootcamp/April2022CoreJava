package lec13_02_java_oop_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword

// Tofael: In this lecture try to show variables, Constructor,  static and default type method in Regular class (get it from next lecture)
public class Toyota extends ElectricCar implements Drone, Car{
	// method is implemented inside class (not declared)
	// also called non-abstract method
	public void totyotaInfo() {
		System.out.println("This method is from Toyota class");
	}
	
	// return type methods also can be used 
	public int toyotaPrice() {
		int price = 45000;
		System.out.println(price);
		return price;
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String electricCarName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lightWeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingpassenger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingGoods() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void autoPilot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void expensive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFloat() {
		// TODO Auto-generated method stub
		
	}

	
	

}
