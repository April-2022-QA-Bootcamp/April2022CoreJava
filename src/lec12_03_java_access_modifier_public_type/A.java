package lec12_03_java_access_modifier_public_type;

public class A {
	public String info1 = "This is coming from a variable which is public";

	public A() {
		System.out.println("This is coming from a constructor which is public");
	}

	public void msg1() {
		System.out.println("This is coming from a method which is public");
	}
	
	public static void main(String[] args) {
		System.out.println("\n---------- In the same package, public type modifier content of same class can be accessed ----------");
		A a = new A(); // constructor will be initialized here
		System.out.println(a.info1);
		a.msg1();
		
	}

}
