package lec13_02_java_oop_abstraction;

// you can inherit only Interfaces without inheriting Class or vice versa
public class Ferrari implements Truck{
	public void ferrariInfo() {
		System.out.println("Invented in Italy");
	}

	@Override
	public void carryingGoods() {
		// TODO Auto-generated method stub
		
	}
}
