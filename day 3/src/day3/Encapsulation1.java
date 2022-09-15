package day3;
public class Oops{
	private String name;
	private int age;
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

public class Encapsulation1 {

	public static void main(String[] args) {
		Oops obj1=new Oops();
		obj1.setName("irene");
		obj1.setAge(12);
		System.out.println("Name is "+obj1.getName());
		System.out.println("age is "+obj1.getAge());
		// TODO Auto-generated method stub

	}

}

