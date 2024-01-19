package sample;


class InvalidUserDetailsException extends RuntimeException {
	    public InvalidUserDetailsException(String message) {
	        super(message);
	    }


	    public static boolean isValidFirstName(String firstName) {
	        if (!firstName.matches("[A-Z][a-zA-Z]{2,}")) {
	            throw new InvalidUserDetailsException("Invalid First Name");
	        }
	        return true;
	    }
	    public static boolean isValidLastName(String lastName) {
	        if (!lastName.matches("[A-Z][a-zA-Z]{2,}")) {
	            throw new InvalidUserDetailsException("Invalid Last Name");
	        }
	        return true;
	    }
	    
	    public static boolean isValidEmail(String email) {
	        if (!email.matches("[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})?")) {
	            throw new InvalidUserDetailsException("Invalid Email");
	        }
	        return true;
	    }
	    

	    public static boolean isValidMobile(String mobile) {
	        if (!mobile.matches("MOBILE_REGEX_HERE")) {
	            throw new InvalidUserDetailsException("Invalid Mobile Format");
	        }
	        return true;
	    }
	    
	    public static boolean isValidPassword(String password) {
	        if (!password.matches("PASSWORD_REGEX_HERE")) {
	            throw new InvalidUserDetailsException("Invalid Password");
	        }
	        return true;
	    }
	   
	}

