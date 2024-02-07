package dao;

import java.util.List;

import vo.User;

public interface ContactInterface {
	public void addUser(User user);

	public List<User> selectAllContact();

	public User selectContact(int index);

	public void deleteUser(int index);

	public void BlockUser(int index);

	public List<User> getBirthContactList(int day);
}
