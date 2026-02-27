package geminiQuestion;

class MedicalRecord {
	private int patientID;
	private String diagnosis;
	private double billAmount;
	
	public void Setter (int patientID, String diagnosis, double billAmount) {
		this.patientID = patientID;
		this.diagnosis = diagnosis;
		
		if (billAmount < 0) {
	        this.billAmount = 0; 
	    } else {
	        this.billAmount = billAmount; 
	    }
	}
	
	public String getDiagnosis() {
		return diagnosis;
	}
	
	public int getPatientID() {
		return patientID;
	}
	
}

public class question1 {

	public static void main(String[] args) {
		
		MedicalRecord MR1 = new MedicalRecord();
		MR1.Setter(1234, "demam", 5.50);
		MR1.Setter(1234,  "demam", 0.0);
		
		System.out.println("Diagnosis for " + MR1.getPatientID() + ": " + MR1.getDiagnosis());
		
	}

}
