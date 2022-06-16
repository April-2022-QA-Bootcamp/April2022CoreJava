package lec16_06_java_access_modifier_private_type;


// private should be introduced before Encapsulation

public class G extends H {
	
	private String info3 = "This is coming from a variable which is private";
	
	private G() {
		System.out.println("This is coming from a constructor which is private");
	}
	
	private void msg3 () {
		System.out.println("This is coming from a method which is private");
	}
	
	public static void main(String[] args) {
		System.out.println("\n---------- private type modifier content can be accessed inside the same class ----------");
		G g = new G(); // the Constructor is initialized here
		System.out.println(g.info3); // Variable initialized here
		g.msg3();
		
		System.out.println("\n---------- Inside same package, private type modifier content of Parent class [H] can't be accessed by sub/child class (Here G) ----------");
		H h = new H();
		// System.out.println(h.name3);
		// h.h();
		
	}


}
