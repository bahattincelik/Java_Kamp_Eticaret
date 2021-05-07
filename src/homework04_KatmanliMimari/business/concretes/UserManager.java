package homework04_KatmanliMimari.business.concretes;

import java.util.List;

import homework04_KatmanliMimari.business.abstracts.UserService;
import homework04_KatmanliMimari.dataAccess.abstracts.UserDao;
import homework04_KatmanliMimari.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User getById(int id) {
		
		return userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.getByEmail(email);
	}

	@Override
	public User getLoginInfos(String email, String password) {
		// TODO Auto-generated method stub
		return userDao.getLoginInfos(email, password);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public void verifyUser(int id) {
		User tempUser = userDao.getById(id);
		System.out.println(tempUser.getEmail());
		tempUser.setVerified(true);
		
	}

}
