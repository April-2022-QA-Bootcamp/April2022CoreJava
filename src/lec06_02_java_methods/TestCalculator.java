package lec06_02_java_methods;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator01 cal01 = new Calculator01();
		cal01.addition(); // method initialize
		cal01.a = 100; // value of a changed, so see the next line outcome
		cal01.addition();
		cal01.subtraction();
		cal01.multipliaction();
		cal01.division();
		
		System.out.println("\n-----------------------------------------\n");
		Calculator02 cal02 = new Calculator02();
		cal02.addition();
		cal02.subtraction();
		cal02.usCitizen();
		
		System.out.println("\n-----------------------------------------\n");
		Calculator03 cal03 = new Calculator03();
		cal03.multiplication();
		cal03.division(8.234f, 4.34f); // if the method is parameterized, you can use different argument to get different value
		cal03.division(6.234f, 1.34f);  
		
		System.out.println("\n-----------------------------------------\n");
		Calculator04 cal04 = new Calculator04();
		cal04.division();
		cal04.multiplication();
		
		System.out.println("\n-----------------------------------------\n");
		Calculator05 cal05 = new Calculator05();
		cal05.addition(33, 11);
		cal05.addition(73, 15); // if the method is parameterized, you can use different argument to get different value
		cal05.subtraction(22, 10);
		cal05.multiplication(22, 4);
		cal05.division(44, 8);
		
		System.out.println("\n-----------------------------------------\n");
		Calculator06 cal06 = new Calculator06();
		cal06.addition(23, 15); // if the method is parameterized, you can use different argument to get different value
		cal06.subtraction(22, 13);
		cal06.multiplication(22, 4);
		cal06.division(14, 8);
		
		System.out.println("\n-----------------------------------------\n");
		Calculator07 cal07 = new Calculator07();
		cal07.addition(33, "26");
		// cal07.addition(13, "Jakaria");
		cal07.multiplication(3.65426, "2.73687");
		cal07.subtraction(54, 6.754837);
		cal07.division01(33, 9.2356f);
		cal07.division02(8, 3.2356f);
		
		

	}

}
