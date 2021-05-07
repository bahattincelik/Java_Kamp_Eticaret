package homework04_KatmanliMimari.business.concretes;

import java.util.regex.Pattern;

import homework04_KatmanliMimari.business.abstracts.UserValidationService;
import homework04_KatmanliMimari.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	public static final Pattern isValidEmailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean validataUser(User user) {

		if (isValidEmail(user.getEmail()) && 
			isValidPassword(user.getPassword()) &&
			isValidFirstName(user.getFirstName()) &&
			isValidLastName(user.getLastName()) &&
			isFilled(user.getFirstName(),user.getLastName(),
					user.getEmail(), user.getPassword())) {
			
			return true;
			
		}
		
		
		return false;
	}

	private boolean isFilled(String firstName, String lastName, String email, String password) {
		if (firstName.length() > 0 && lastName.length() > 0 && email.length() > 0 && password.length() > 0) {
			return true;
		}
		
		return false;
	}

	private boolean isValidLastName(String lastName) {
		return lastName.length()>=2;
	}

	private boolean isValidFirstName(String firstName) {
		return firstName.length()>=2;
	}

	private boolean isValidPassword(String password) {
		return password.length()>=6;
	}

	private boolean isValidEmail(String email) {
		return  isValidEmailPattern.matcher(email).find();
	}

}
