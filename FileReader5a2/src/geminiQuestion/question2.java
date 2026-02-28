package geminiQuestion;

import java.util.*;
import java.io.*;

public class question2 {

	public static void main(String[] args) {
		
		double totalHarga = 0;
		
		try (Scanner reader = new Scanner(new File("senarai_barang.txt"))) {
		    while (reader.hasNextLine()) {
		        String line = reader.nextLine();

		        String[] baki = line.split(","); 
		        
		        String nama  = baki[0];             
		        double harga = Double.parseDouble(baki[1]); 
		        int kuantiti = Integer.parseInt(baki[2]);  
		        double jumlahHarga = harga * kuantiti;
		        totalHarga += jumlahHarga;
		        
		        System.out.printf("Item: " + nama + " | Total: RM%1.2f", jumlahHarga);
		        System.out.println();
		    }
		} catch (IOException e) {
		    System.out.println("Error!");
		}
		
		System.out.printf("Jumlah bagi kesuluruhan barang: RM%1.2f", totalHarga);
	}

}