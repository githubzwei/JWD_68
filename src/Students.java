import java.sql.Timestamp;

public class Students {

	private String name;
	private int age;

	private double mark;
	private int petname;

	private String password;
	private Timestamp createdAt;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
