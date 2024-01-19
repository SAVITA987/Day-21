package sample;

import java.util.List;

class UserValidator {
	    
	    // UC 1
	    public static boolean isValidFirstName(String firstName) {
	        return firstName.matches("[A-Z][a-zA-Z]{2,}");
	    }

	    // UC 2
	    public static boolean isValidLastName(String lastName) {
	        return lastName.matches("[A-Z][a-zA-Z]{2,}");
	    }

	    // UC 3
	    public static boolean isValidEmail(String email) {
	        return email.matches("[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})?");
	    }

	    // UC 4 to UC 7
	    public static boolean isValidPassword(String password) {
	        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$");
	    }

	    // UC 8
	    public static boolean clearEmailSamples(List<String> emailSamples) {
	        return emailSamples.stream().allMatch(UserValidator::isValidEmail);
	    }

	    public static boolean isValidMobile(String mobile) {
	        if (!mobile.matches("^\\d{2} \\d{10}$")) {
	            throw new InvalidUserDetailsException("Invalid Mobile Format");
	        }
	        return true;
	    }

	}

