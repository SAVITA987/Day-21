package sample;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserValidatorTest {

	    @Test
	    void testValidFirstName() {
	        assertTrue(UserValidator.isValidFirstName("Savita"));
	    }
	    
	    @Test
	    void testInvalidFirstName() {
	        assertFalse(UserValidator.isValidFirstName("Tekale")); 
	    }
	    
	    @Test
	    void testClearEmailSamples1() {
	        assertTrue(UserValidator.clearEmailSamples(List.of("vidhu@gmail.com", "priti@gmailS.com")));
	    }
	    
	    @Test
	    void testValidEmail() {
	        assertTrue(UserValidator.isValidEmail("savita@gmail.com"));
	    }

	    @Test
	    void testInvalidEmail() {
	        assertFalse(UserValidator.isValidEmail("invalid-email")); // Should fail the entry
	    }

	    @Test
	    void testValidMobile() {
	        assertTrue(UserValidator.isValidMobile("91 9919819801"));
	    }

	    @Test
	    void testInvalidMobile() {
	        assertFalse(UserValidator.isValidMobile("7890654329")); 
	    }
	    @Test
	    void testValidPassword() {
	        assertTrue(UserValidator.isValidPassword("Savita@1234"));
	    }
	    @Test
	    void testInvalidPassword() {
	        assertFalse(UserValidator.isValidPassword("weakpassword")); 
	    }
	    
	    @Test
	    void testClearEmailSamples() {
	        assertTrue(UserValidator.clearEmailSamples(List.of("abc@example.com", "xyz@domain.com")));
	    }
	    
	    @ParameterizedTest
	    @ValueSource(strings = {"savita@gmail.com", "yogesh@gmail.com"})
	    void testValidEmail(String email) {
	        assertTrue(UserValidator.isValidEmail(email));
	    }
	}

