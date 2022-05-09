package onlineVideo;

//Encapsulation binding data with method
class Student {
	private int rollno;
	private String name;

	// Getter and setter method
	public void setrollno(int r) {

		this.rollno = r;
	}

	public int getrollno() {
		return rollno;
	}

	public void setname(String n) {
		this.name = n;
	}

	public String getname() {
		return name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setrollno(12);
		s1.setname("Shivansh");
		System.out.println(s1.getrollno());
		System.out.println(s1.getname());
	}

}
