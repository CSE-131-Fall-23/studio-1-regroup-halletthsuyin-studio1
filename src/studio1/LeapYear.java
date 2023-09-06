package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Year");
		int yearEntered = in.nextInt();
		boolean isLeapYear = (yearEntered%4 == 0) && ((yearEntered%100 != 0) || (yearEntered%400 == 0));
		System.out.println(yearEntered + " is a leap year: " + isLeapYear);
	}

}
