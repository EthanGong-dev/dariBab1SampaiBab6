package topic3a1;

class Patient {
	String name;
	int age;
	String sickness;
	
	public Patient (String name, int age, String sickness) {
		this.name = name;
		this.age = age;
		this.sickness = sickness;
	}
	
	public void checkIn() {
		System.out.println(name + " telah mendaftar untuk rawatan " + sickness + ".");
	}
	
}

public class question1 {

	public static void main(String[] args) {
		
		Patient p1 = new Patient("Arman", 20, "demam");
		Patient p2 = new Patient("Arissa", 17, "sakit perut");
		
		p1.checkIn();
		p2.checkIn();
		
	}

}
