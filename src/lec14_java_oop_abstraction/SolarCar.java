package lec14_java_oop_abstraction;

public abstract class SolarCar {
	// Interview question: Can we create variables inside Abstract class?
	public String nameString;
	public int cost;
	
	// Interview question: Can a Constructor of Abstract class be initialized?
	public SolarCar() {
		System.out.println("Can it be initialized?");
	}
	public abstract void speed();
	public abstract int cost();
	
}
