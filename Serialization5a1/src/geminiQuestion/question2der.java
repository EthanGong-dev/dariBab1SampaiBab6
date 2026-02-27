package geminiQuestion;

import java.io.*;
import java.util.*;

public class question2der {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("inventory.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<Item> stokBaru = (ArrayList<Item>) ois.readObject();
			double totalHarga = 0;
			
            System.out.println("=== SENARAI STOK KEDAI ===");
            for (Item i : stokBaru) {
                System.out.printf("Barang: " + i.nama + " | Kuantiti: " + i.kuantiti + " | Harga: RM%1.2f", i.harga);
                System.out.println();
                totalHarga += (i.harga * i.kuantiti);
            }
            
            System.out.printf("Kesuluruhan harga bagi semua barang yg anda beli tadi berharga RM%1.2f", totalHarga);
			
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
