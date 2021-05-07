package homework04_KatmanliMimari.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework04_KatmanliMimari.dataAccess.abstracts.UserDao;
import homework04_KatmanliMimari.entities.concretes.User;

public class DatabaseUserDao implements UserDao {

	
	List<User> users = new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
		System.out.println("Kullanici eklendi... ");
		System.out.println(user.getFirstName()+" " +user.getLastName());
		users.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println("Bilgiler guncellendi... ");
		System.out.println(user.getFirstName()+" " +user.getLastName());		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanici silindi... ");
		System.out.println(user.getFirstName()+" " +user.getLastName());
		users.removeIf(usr-> usr.getId()==user.getId());
	}
	
	@Override
	public User getById(int id) {
		for (User each : users) {
			if (each.getId()==id) {
				return each;
			}
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {

		
		for (User each : users) {
			if (each.getEmail()==email) {
				return each;
			}
		}
		return null;
	}

	@Override
	public User getLoginInfos(String email, String password) {
		for (User each : users) {
			if (each.getEmail()==email && each.getPassword()==password) {
				return each;
			}
		}
		return null;
	}

	

	@Override
	public List<User> getAll() {
		for (User each : users) {
			System.out.println("Id : "+each.getId()+" "+
								"Name : "+each.getFirstName()+" "+
								"Last Name : "+each.getLastName()+" "+
								"Email : "+each.getEmail()+" "+
								"Password : "+each.getPassword()+" "+
								"Verified : "+each.isVerified());	
		}
		return null;
	}

	
}
