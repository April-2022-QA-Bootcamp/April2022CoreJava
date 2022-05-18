package lec05_02_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		 // default Constructor initialized
		Employee employee = new Employee();  // here default Constructor is initialized
		employee.employee("Imran", 007, 'M', true); // here method is initialized
		// Parameterized constructor initialized
		Employee  abuJakaria = new Employee("Abu Jakaria", 06, 'M', false); // here Constructor is initialized
		abuJakaria.employee("Shakil", 01, 'M', false); // here method is initialized
		Employee  gelbuSherpa = new Employee("Gelbu Sherpa", 31, 'M', true);
		Employee  pinkyShaha = new Employee("Pinky Shaha", 25, 'F', true);
		Employee  tenzinNyandak = new Employee("Tenzin Nyandak", 11, 'M', false);
		tenzinNyandak.employee("Nyandka T", 12, 'M', true); // here method is initialized
		
	}

}
