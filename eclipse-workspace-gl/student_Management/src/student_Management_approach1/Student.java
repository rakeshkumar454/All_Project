package student_Management_approach1;

public class Student {
	private int id;
	private String name;
	private String fatherName;
	private long phoneNumber;
	private Address address;
	public Student() {
		super();
	}
	public Student(int id, String name, String fatherName, long phoneNumber, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}
	
}
