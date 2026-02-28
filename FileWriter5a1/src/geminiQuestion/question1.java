package geminiQuestion;

import java.io.*;
import java.util.*;

public class question1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try(FileWriter fw = new FileWriter("log.txt", true)) {
			PrintWriter pw = new PrintWriter(fw);
			
			System.out.print("Masukan mesej anda: ");
			pw.println(input.nextLine());
			
			input.close();
			
			System.out.println("Data berjaya untuk disimpan.");
		}
		catch (IOException e) {
			System.out.println("Anda gagal untuk transfer data anda ke file yg laen.");
		}
		
	}

}

