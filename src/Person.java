
public class Person {
	
	String name;
	int birthday;
	
	
	Person(String name, int birthday) {
		this.name = name;
		this.birthday = birthday; 
	}
	
	
	void print() {
		System.out.println("My name is: " + name);
		System.out.println("My bday is: " + birthday);
	}
	
	
	boolean isBirthday(int date) {
		
		return birthday % 1000 == date % 1000;
		
	}
		


	public static void main (String[] args) {
	
	Student s1 = new Student("Axel", 19890413, 5, 123456); 
	s1.print();

	}


}











