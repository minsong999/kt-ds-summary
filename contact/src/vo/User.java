package vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

public class User {
	private int index;
	private String name;
	private ArrayList<String> phoneNumbers;
	private String birth;
	private String relationship;
	private boolean isBlock;
	private Map<String, String> Anniversary;
	private String memo;

	public User() {
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public boolean isBlock() {
		return isBlock;
	}

	public void setBlock(boolean isBlock) {
		this.isBlock = isBlock;
	}

	public Map<String, String> getAnniversary() {
		return Anniversary;
	}

	public void setAnniversary(Map<String, String> anniversary) {
		Anniversary = anniversary;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {

		return "User [index=" + index + ", name=" + name + ", phoneNumbers=" + phoneNumbers + ", birth=" + birth
				+ ", relationship=" + relationship + ", isBlock=" + isBlock + ", Anniversary=" + Anniversary + ", memo="
				+ memo + "]+\n";
	}
}
