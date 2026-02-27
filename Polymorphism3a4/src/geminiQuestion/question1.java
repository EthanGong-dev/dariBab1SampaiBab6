package geminiQuestion;

import java.util.*;

class Medicine {
	public void takeMedicine() {
	}
}

class Tablet extends Medicine {
	public void takeMedicine() {
		System.out.println("Telan dengan air.");
	}
}

class Syrup extends Medicine {
	public void takeMedicine() {
		System.out.println("Goncang sebelum minum.");
	}
}

public class question1 {

	public static void main(String[] args) {
		
		ArrayList<Medicine> pharmacy1 = new ArrayList<>();
		
		pharmacy1.add(new Tablet());
		pharmacy1.add(new Syrup());
		
		for (Medicine i : pharmacy1) {
			(i).takeMedicine();
		}
		
	}

}
