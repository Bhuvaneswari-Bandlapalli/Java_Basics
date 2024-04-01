
public class Opetaters {
	/*Relational  Operators:-these are using for compare primitive values
	 * (< ,<=, >, >=,==, !=)
	 * it produce boolean value.
	 * 
	 * Logical operators:- used to determine the logic b/n variables or values
	 * &&, ||,!
	 * 
	 * Arithmetic operators:(+,-,*,/,%)
	 * BODMAS-(),*,/,+,-
	 */
	public static void main(String[] args) {
		int year=2005;
		
		if((year%4==0) &&(year%400==0 || year%100!=0)) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}
