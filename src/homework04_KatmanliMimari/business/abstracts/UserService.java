package homework04_KatmanliMimari.business.abstracts;

import java.util.List;

import homework04_KatmanliMimari.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	void verifyUser(int id);
	
	
	User getById(int id);
	User getByEmail(String email);
	User getLoginInfos(String email, String password);
	List<User> getAll();

}
