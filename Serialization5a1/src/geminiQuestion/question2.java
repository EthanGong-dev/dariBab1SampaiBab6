package geminiQuestion;

import java.io.*;
import java.util.*;

class Item implements Serializable {
	
	String nama;
	int kuantiti;
	double harga;
	
	public Item (String name, int kuantiti, double harga) {
		this.nama = name;
		this.kuantiti = kuantiti;
		this.harga = harga;
	}
	
	private static final long serialVersionUID = 1L;
}

public class question2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Item> stok = new ArrayList<>();
		
		System.out.print("Berapa barang kau beli tadi: ");
		int bilBarang = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < bilBarang; i++) {
			System.out.println();
			System.out.print("Barang " + (i + 1) + ": ");
			String namaBarang = input.nextLine();
			System.out.print("Kuantiti: ");
			int kuantiti = input.nextInt();
			input.nextLine();
			System.out.print("Harge: ");
			double harga = input.nextDouble();
			input.nextLine();
			stok.add(new Item(namaBarang, kuantiti, harga));
		}
		
		input.close();
		
		try {
			FileOutputStream fos = new FileOutputStream("inventory.ser");;
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(stok);
			oos.close();
			
			System.out.println("Data berjaya disimpan.");
		}
		catch (Exception e) {
			System.out.println("Data tidak berjaya untuk disimpan.");
		}
		
	}

}
