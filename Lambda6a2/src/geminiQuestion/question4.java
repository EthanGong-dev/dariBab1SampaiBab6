package geminiQuestion;

interface Penyapa {
	public void salam (String nama);
}

public class question4 {

	public static void main(String[] args) {
		
		Penyapa p = (nama) -> System.out.println("Woi " + nama + " , apa kahbar?");
		
		p.salam("Arman");
		
	}

}
