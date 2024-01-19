package sample;

public class UserValidatorMain {

	    public static void main(String[] args) {
	                try {
	                  
	                    UserValidator.isValidFirstName("Savita");

	                    UserValidator.isValidLastName("Tekale");

	                    UserValidator.isValidEmail("savita@gmail.com");

	                    UserValidator.isValidMobile("91 9919819801");

	                    UserValidator.isValidPassword("savita@1234");

	                } catch (InvalidUserDetailsException e) {
	                    System.out.println("Error: " + e.getMessage());
	                }
	            }
	        }

	    
	

