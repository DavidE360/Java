import java.util.Scanner;

public class Insurance {
	public static void main (String args[]) {
		
		Scanner insrncClacScnr = new Scanner(System.in);

		System.out.print("Please input the current year: ");
		int currentYearForInsurnce = insrncClacScnr.nextInt();
		System.out.print("Please input the birth year: ");
		int theBirthYrForInsurnce = insrncClacScnr.nextInt();

		System.out.println("The insurance amount is: $" + getPremiumAmntFn(currentYearForInsurnce, theBirthYrForInsurnce)); 
	}

	public static int getPremiumAmntFn(int currentYearForInsurnce, int theBirthYrForInsurnce) {

		int ageCalculatedOfInsuredUser = currentYearForInsurnce-theBirthYrForInsurnce;
		int totalDecadesValOfinsrdUser = ageCalculatedOfInsuredUser / 10;
		return (totalDecadesValOfinsrdUser + 15) * 20;
	}
}
