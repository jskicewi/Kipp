
public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	private int ssn;
	private int salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
			this.salary = 1000 * salary;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setFirstName("Jennifer");
		e2.setFirstName("Fred");
		System.out.println("e1 first name is: "+e1.getFirstName());
		System.out.println("e2 first name is: "+e2.getFirstName());
		e1.setSalary(1);
		System.out.println(e1.getSalary());
		
	}

}
