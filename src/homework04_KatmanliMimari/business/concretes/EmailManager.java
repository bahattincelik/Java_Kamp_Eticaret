package homework04_KatmanliMimari.business.concretes;

import homework04_KatmanliMimari.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send(String message, String email) {
		System.out.println(message+ " " +email);
	}

}
