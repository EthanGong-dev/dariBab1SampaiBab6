package geminiQuestion;

import java.io.*;

public class question1der {

	public static void main(String[] args) {
	
		try {
			FileInputStream fis = new FileInputStream("player.data.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Gamer pData = (Gamer) ois.readObject();
			
			System.out.println("Welcome back, " + pData.username);
            System.out.println("Current Level: " + pData.level);
            
            ois.close();
		}
		catch (FileNotFoundException e){
			System.out.println("File ini tidak dapat dijumpai.");
		}
		catch (Exception e) {
			System.out.println("Ada masalah yg tidak dapat diketahui.");
		}
		
	}

}
