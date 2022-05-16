package lec04_02_java_variables_declared;

public class MyInfoTest {
	public static void main(String[] args) {	
		MyInfo tofael = new MyInfo(); // Constructor is Initialized
		tofael.name = "Mohammad Sharkar"; // Variable Initialized
		tofael.age = 127;
		tofael.myApartmentRent = 32767;
		tofael.myYearlySalary = 2147483647;
		tofael.myBankBalance = 9223372036854775807l;
		tofael.myHeight = 1.67647f;
		tofael.myGrade = 3.64526537253;
		tofael.sex = 'M';
		tofael.usCitizen = true; // if you comment out this you can see the default value of boolean
		tofael.myInfo(); // method initialized
		
		MyInfo imran = new MyInfo(); // Constructor is Initialized
		imran.name = "Imran Ahmed";
		imran.age = 17;
		imran.myApartmentRent = 22763;
		imran.myYearlySalary = 1147486647;
		imran.myBankBalance = 9223372032314775807l;
		imran.myHeight = 1.47f;
		imran.myGrade = 3.7253;
		imran.sex = 'M';
		imran.usCitizen = false;
		imran.myInfo();
		
		MyInfo stephani = new MyInfo(); // Constructor is Initialized
		stephani.name = "Stephani B";
		stephani.age = 47;
		stephani.myApartmentRent = 12763;
		stephani.myYearlySalary = 1947486647;
		stephani.myBankBalance = 8823372032314775807l;
		stephani.myHeight = 2.47f;
		stephani.myGrade = 3.0253;
		stephani.sex = 'F';
		stephani.usCitizen = true;
		stephani.myInfo();
		
		
	}

}
