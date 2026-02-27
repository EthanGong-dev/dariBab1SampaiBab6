package geminiQuestion;

import java.io.*;

class Gamer implements Serializable {
	
	String username;
	int level;
	
	public Gamer (String username, int level) {
		this.username = username;
		this.level = level;
	}
	
	private static final long serialVersionUID = 1L;
	
}

public class question1 {

	public static void main(String[] args) {
		
		Gamer p1 = new Gamer ("Frost", 99);
		
		try {
			FileOutputStream fos = new FileOutputStream("player.data.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p1);
			oos.close();
			System.out.println("Data berjaya disimpan.");
		}
		catch (Exception e) {
			System.out.println("Data tidak berjaya disimpan.");
		}
		
	}
}
