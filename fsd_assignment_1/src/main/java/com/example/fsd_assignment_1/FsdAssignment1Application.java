package com.example.fsd_assignment_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FsdAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(FsdAssignment1Application.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program takes a String input and converts it to other primitive data types");
		System.out.println("Enter a String: ");
		String str = scanner.nextLine();

		System.out.println("String entered was: " + str);

		try {
			int integerValue = toInt(str);
			System.out.println("int: " + integerValue);
		} catch(NumberFormatException nfe) {
			System.out.println("Error encountered when converting String to int");
		}

		try {
			long longValue = toLong(str);
			System.out.println("long: " + longValue);
		} catch(NumberFormatException nfe) {
			System.out.println("Error encountered when converting String to long");
		}

		try {
			boolean booleanValue = toBoolean(str);
			System.out.println("boolean: " + booleanValue);
		} catch(NumberFormatException nfe) {
			System.out.println("Error encountered when converting String to boolean");
		}

		try {
			float floatValue = toFloat(str);
			System.out.println("float: " + floatValue);
		} catch(NumberFormatException nfe) {
			System.out.println("Error encountered when converting String to floatValue");
		}

		try {
			double doubleValue = toDouble(str);
			System.out.println("double: " + doubleValue);
		} catch(NumberFormatException nfe) {
			System.out.println("Error encountered when converting String to doubleValue");
		}
	}

	public static int toInt(String string) {
		return Integer.parseInt(string);
	}

	public static long toLong(String string) {
		return Long.parseLong(string);
	}

	public static boolean toBoolean(String string) {
		return Boolean.parseBoolean(string);
	}

	public static float toFloat(String string) {
		return Float.parseFloat(string);
	}

	public static double toDouble(String string) {
		return Double.parseDouble(string);
	}
}