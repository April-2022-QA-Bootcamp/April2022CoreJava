package lec16_04_java_access_modifier_public_type;

// Tofael: It (public) should be done after inheritance, private before Encapsulation. The other two in a suitable time

public class A extends B{
	public String info1 = "This variable is coming from A which is public";

	public A() {
		System.out.println("This Constructor is coming from A which is public");
	}

	public void msg1() {
		System.out.println("This method is coming from A which is public");
	}
	
	public static void main(String[] args) {
		System.out.println("\n---------- public type modifier content can be accessed inside the same class ----------");
		A a = new A(); // constructor will be initialized here
		System.out.println(a.info1);
		a.msg1();
		
		System.out.println("\n---------- Inside same package, public type modifier content of Parent class [B] can be accessed by sub/child class (Here A) ----------");
		B b = new B();
		System.out.println(b.name1);
		b.b();
		
	}

}
