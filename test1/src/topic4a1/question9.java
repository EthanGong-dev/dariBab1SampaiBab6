package topic4a1;

public class question9 {

	public static void main(String[] args) {
		
		String kod = "DISC-25-VALID";
		
		String[] diskaun = kod.split("-");
		
		Integer diskaunSB = Integer.parseInt(diskaun[1]);
		
		if (diskaunSB > 20) {
			System.out.println("Diskaun besar!");
		}
		else {
			System.out.println("Diskaun biasa!");
		}
		
		if (diskaun[2].equals("VALID")) {
			System.out.println("Kod ini valid untuk dipakai");
		}
		else {
			System.out.println("Kod ini tidak valid untuk dipakai");
		}
		
	}

}
