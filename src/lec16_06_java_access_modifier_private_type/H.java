package lec16_06_java_access_modifier_private_type;

import lec12_06_java_access_modifier_class_from_outside_package.N;
import lec16_08_java_access_modifier_class_from_outside_package.M;

public class H extends M{

	public static void main(String[] args) {
		System.out.println("\n---------- In the same package, private type modifier content of different class (I) can not be accessed by subclass (Here H") ;
		H  h = new H();
		// h.iMethod(); // I comment out because I changed to parent class of different package, use Class I when need to check inside same package
		
		System.out.println("\n---------- In the same package, private type modifier content of different class(G) can not be accessed by non-subclass (Here I) ----------");
		// G g = new G();  // because private constructor don't allow to instantiate the object
		
		System.out.println("\n---------- From different package, private type modifier content of different class (M) can not be accessed by subclass (Here H)  ----------");		System.out.println("---------- The below code is coming from class M of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");	
		// h.m3();
		
		N n = new N();
		// n.n3();

	}

}
