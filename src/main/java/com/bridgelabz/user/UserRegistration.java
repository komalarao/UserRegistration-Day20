package com.bridgelabz.user;

public class UserRegistration {
public static void main(String[] args) {
			UserInputValidation userInputValidation = new UserInputValidation();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter first name: ");
	        String firstName = scanner.next();
	        System.out.println(userInputValidation.isValidFirstName(firstName) ? "Valid" : "In Valid");
	        scanner.close();
		}
}
