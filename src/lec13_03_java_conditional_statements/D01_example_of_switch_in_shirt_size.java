package lec13_03_java_conditional_statements;

public class D01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'N';
		
		switch (size) {
		
		case 'S':
			System.out.println("Yes, We have your Small Size Shirt");
			break;
		
		case 'M':
			System.out.println("Yes, We have your Mediun Size Shirt");
			break;
			
		case 'L':
			System.out.println("Yes, We have your Large Size Shirt");
			break;
			
		case 'X':
			System.out.println("Yes, We have your Extra Large Size Shirt");
			break;
			
		default:
			System.out.println("Sorry! We don't have your Shirt");
			break;
			
		}

	}

}
