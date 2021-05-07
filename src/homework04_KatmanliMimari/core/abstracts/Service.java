package homework04_KatmanliMimari.core.abstracts;

public interface Service {
	void register(int id, String firstName, String lastName,String email, String password);
	void login(String email,String password);
}
