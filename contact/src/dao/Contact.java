package dao;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import util.localDateTimeUtil;
import vo.User;

public class Contact implements ContactInterface {

	ArrayList<User> contact = new ArrayList<>();

	public Contact() {
		super();
		User user = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		HashMap<String, String> anniversaryMap = new HashMap<>();
		ArrayList<String> PhoneNumbersList = new ArrayList<>();

		anniversaryMap.put("만난날", "20240205");
		PhoneNumbersList.add("01022353215");
		PhoneNumbersList.add("01022321335");
		PhoneNumbersList.add("01012223369");

		user.setAnniversary(anniversaryMap);
		user.setBirth("19980201");
		user.setBlock(false);
		user.setMemo("첫번째 메모");
		user.setName("정준하111");
		user.setPhoneNumbers(PhoneNumbersList);
		user.setRelationship("연예인");

		anniversaryMap.put("만난날", "20240205");
		PhoneNumbersList.add("01022353215");
		PhoneNumbersList.add("01022321335");
		PhoneNumbersList.add("01012223369");

		user2.setAnniversary(anniversaryMap);
		user2.setBirth("19980205");
		user2.setBlock(false);
		user2.setMemo("첫번째 메모");
		user2.setName("정준하2222222222222");
		user2.setPhoneNumbers(PhoneNumbersList);
		user2.setRelationship("연예인");

		anniversaryMap.put("만난날", "20240205");
		PhoneNumbersList.add("01022353215");
		PhoneNumbersList.add("01022321335");
		PhoneNumbersList.add("01012223369");

		user3.setAnniversary(anniversaryMap);
		user3.setBirth("19980228");
		user3.setBlock(false);
		user3.setMemo("첫번째 메모");
		user3.setName("정준하12");
		user3.setPhoneNumbers(PhoneNumbersList);
		user3.setRelationship("연예인");

		anniversaryMap.put("만난날", "20240205");
		PhoneNumbersList.add("01022353215");
		PhoneNumbersList.add("01022321335");
		PhoneNumbersList.add("01012223369");

		user4.setAnniversary(anniversaryMap);
		user4.setBirth("19980415");
		user4.setBlock(false);
		user4.setMemo("첫번째 메모");
		user4.setName("정준하113");
		user4.setPhoneNumbers(PhoneNumbersList);
		user4.setRelationship("연예인");

		this.contact.add(user);
		this.contact.add(user2);
		this.contact.add(user3);
		this.contact.add(user4);
	}

	@Override
	public void addUser(User user) {
		this.contact.add(user);
	}

	@Override
	public List<User> selectAllContact() {
		for (int i = 0; i < contact.size(); i++) {
			System.out.println("연락처 목록 " + i + "번째: " + contact.get(i).getName());
		}

		return this.contact;
	}

	@Override
	public User selectContact(int index) {
		for (int i = 0; i < contact.size(); i++) {
			if (index == i) {
				System.out.println(contact.get(i).toString());
			}
		}
		return this.contact.get(index);
	}

	@Override
	public void deleteUser(int index) {
		System.out.println(contact.size());
		if (index < this.contact.size()) {
			this.contact.remove(index);
		} else {
			System.out.println("올바른 인덱스를 입력해주세요.");
		}
	}

	@Override
	public void BlockUser(int index) {
		if (index < this.contact.size()) {
			if (this.contact.get(index).isBlock() == true) {
				this.contact.get(index).setBlock(false);
			} else {
				this.contact.get(index).setBlock(true);
			}
		} else {
			System.out.println("올바른 인덱스를 입력해주세요.");
		}
	}

	@Override
	public List<User> getBirthContactList(int day) {
		List<User> birthContactList = new ArrayList<>();
		if (day < 365) {
			day++;

			LocalDate now = LocalDate.now();
			LocalDate before = LocalDate.now().plusDays(day);
			LocalDate after = LocalDate.now().minusDays(day);

			LocalDate userBirth = null;
			int userBirthMonth = 0;
			int userBirthDay = 0;

			for (int i = 0; i < contact.size(); i++) {
				if (contact.get(i).getBirth() != null && contact.get(i).getBirth().length() == 8) {
					userBirthMonth = Integer.parseInt(contact.get(i).getBirth().substring(4, 6));
					userBirthDay = Integer.parseInt(contact.get(i).getBirth().substring(6, 8));
				}
				userBirth = LocalDate.of(now.getYear(), userBirthMonth, userBirthDay);

				if (before.isAfter(userBirth) && after.isBefore(userBirth)) {
					System.out.println("유저 이름: " + contact.get(i).getName() + " 유저 생일: " + contact.get(i).getBirth());
					birthContactList.add(contact.get(i));
				}

			}
		}
		return birthContactList;
	}

}
