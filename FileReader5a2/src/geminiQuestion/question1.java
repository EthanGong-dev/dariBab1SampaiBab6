package geminiQuestion;

import java.io.*;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		File myFile = new File("senarai_barang.txt");

        try (Scanner reader = new Scanner(myFile)) {
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                
                if (data.toUpperCase().startsWith("M")) {
                	System.out.println("Data dari file: " + data);
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Alamak, file tak jumpa!");
        }

	}

}

