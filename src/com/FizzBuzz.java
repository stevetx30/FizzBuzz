package com;

// small program to loop thru
public class FizzBuzz {
	private static String FB = "FizzBuzz";
	private static String FIZ = "Fizz";
	private static String BUZ = "Buzz";
	private static int NUM = 100;

	public static void main(String[] args) {
		System.out.print(printFizzBuzz());
	}

	public static String printFizzBuzz() {
		String myOutput = "";

		try {
			for (int i = 1; i <= NUM; i++) {

				if (i % 15 == 0) {
					myOutput += FB;
				} else if (i % 5 == 0) {
					myOutput += BUZ;
				} else if (i % 3 == 0) {
					myOutput += FIZ;
				} else {
					myOutput += Integer.toString(i); // could do i+"" as well
				}
				if (i < NUM) {
					myOutput += '\n';
				}
			}
			return myOutput;
		} catch (Exception e) {
			return "error" + e.toString();
		}
	}

}
