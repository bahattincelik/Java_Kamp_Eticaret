package homework04_KatmanliMimari.core.concretes;

import homework04_KatmanliMimari.core.abstracts.Service;
import homework04_KatmanliMimari.google.GoogleManager;

public class GoogleAdapter implements Service{

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		GoogleManager google = new GoogleManager();
		google.login(email, password);
	}

	@Override
	public void login(String email, String password) {
		GoogleManager google = new GoogleManager();
		google.register(email, password);
		
		
	}

}
