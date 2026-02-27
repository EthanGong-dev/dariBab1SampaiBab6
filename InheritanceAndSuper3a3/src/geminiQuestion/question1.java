package geminiQuestion;

class Staff {
	String name;
	int staffID;
	
	public Staff (String name, int staffID) {
		this.name = name;
		this.staffID = staffID;
	}
	
    public void work() {
		System.out.println("Staff sedang bertugas.");
	}
}

class Doctor extends Staff {
	String specialization;
	
	public Doctor (String name, int staffID, String specialization) {
		super(name, staffID);
		this.specialization = specialization;
	}
	
	public void work() {
		super.work();
		System.out.println("Doktor pakar " + specialization + " sedang merawat pesakit.");
	}
}

public class question1 {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("Arman", 1711, "Vet");
		d1.work();
		
	}

}
