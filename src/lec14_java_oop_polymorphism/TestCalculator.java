package lec14_java_oop_polymorphism;

public class TestCalculator {
	public static void main(String[] args) {
		System.out.println("\n-------- Land Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(34, 66, 21); // return type parameterized method -01 initialized
		lc.landCalculator(32, 55); // return type parameterized method -02 initialized
		lc.landCalculator(66, 23, "5"); // return type parameterized method -03 initialized
		lc.landCalculator(34, "88", 20); // return type parameterized method -04 initialized
		lc.landCalculator(61, 10, 60, 62); // final method -05 initialized
		LandCalculator.landCalculator(31, 15, 16, 62, 22); // static method -06 initialized
		lc.landCalculator(2, 10, 20, 40, 90, 80); // void type parameterized method -07 initialized
		lc.landCalculator(); // void type method -08initialized
		
		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator(34, 66, 21); // return type parameterized method -01 initialized
		mc.landCalculator(32, 55); // return type parameterized method -02 initialized
		mc.landCalculator(66, 23, "5"); // return type parameterized method -03 initialized
		mc.landCalculator(34, "88", 20);	// return type parameterized method -04 initialized
		mc.landCalculator(2, 10, 20, 40, 90, 80); // void type parameterized method -07 initialized
		mc.landCalculator(); // void type method -08 initialized
	}

}
