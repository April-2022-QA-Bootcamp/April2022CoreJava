package lec06_01_java_constructor;

public class UseOfNarrowingCasting {

	public static void main(String[] args) {
		double myDouble = 9.364253745735;
		int myInt = (int) myDouble; // casting here
		byte myByte = (byte) myDouble; // casting here
		System.out.println(myDouble); 
		System.out.println(myInt); // called Narrowing casting
		System.out.println(myByte); // called Narrowing casting
		
	}

}
