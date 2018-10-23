
public class Student extends Person {
	
	int studentNr;
	int semester; 
	
	
	Student(String name, int birthday, int studentNr, int semester) {
		super(name, birthday); 
		this.studentNr = studentNr;
		this.semester = semester;
		
	}
	
	
	void print() {
		super.print();
		System.out.println("my studentnumber is " + studentNr);
		System.out.println("my semester is " + semester);		

	}
	
	
	
}

