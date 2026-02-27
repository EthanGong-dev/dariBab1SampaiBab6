package geminiQuestion;

interface PenapisNama {
	boolean uji(String nama);
}

public class question3 {

	public static void main(String[] args) {
		
		 PenapisNama mulaDenganA = (n) -> n.startsWith("A");

	        System.out.println("Ali mula dengan A? " + mulaDenganA.uji("Ali"));  
	        System.out.println("Abu mula dengan A? " + mulaDenganA.uji("Abu"));    
	        System.out.println("Zaki mula dengan A? " + mulaDenganA.uji("Zaki"));
		
	}

}
