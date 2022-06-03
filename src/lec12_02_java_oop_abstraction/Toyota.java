package lec12_02_java_oop_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

public class Toyota extends Mercedez {
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

	
	

}
