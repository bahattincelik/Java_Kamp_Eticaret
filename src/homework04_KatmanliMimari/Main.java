package homework04_KatmanliMimari;

import homework04_KatmanliMimari.business.abstracts.UserService;
import homework04_KatmanliMimari.business.concretes.AuthManager;
import homework04_KatmanliMimari.business.concretes.EmailManager;
import homework04_KatmanliMimari.business.concretes.UserManager;
import homework04_KatmanliMimari.business.concretes.UserValidationManager;
import homework04_KatmanliMimari.core.abstracts.Service;
import homework04_KatmanliMimari.core.concretes.GoogleAdapter;
import homework04_KatmanliMimari.dataAccess.concretes.DatabaseUserDao;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new DatabaseUserDao());
		Service service = new AuthManager(userService, new EmailManager(), new UserValidationManager());
		
		service.register(1, "Bahattin", "Celik", "bahattinclk@gmail.com", "1234Ab.");

		service.login("bahattinclk@gmail.com", "1234Ab.");
		
		userService.getAll();
		
		Service google =  new GoogleAdapter();
		google.register(2, "Bahattinn", "celikk", "bahattincelik@gmail.com", "Test1234");
		google.login("bahattincelik@gmail.com", "Test1234");
	}

}
