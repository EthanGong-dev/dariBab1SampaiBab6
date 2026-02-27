package topic5a1;

import java.io.*;
import java.util.*;

public class question2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> barang = new ArrayList<>();
		ArrayList<String> harga = new ArrayList<>();
		ArrayList<String> kuantiti = new ArrayList<>();
		
		int bilBarang;
		
		System.out.print("Ada berapa barang: ");
		bilBarang = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < bilBarang; i++) {
			System.out.print("Barang " + (i + 1) + ": ");
			barang.add(input.nextLine());
			System.out.print("Harga 1 unit bagi " + barang.get(i) + ": RM");
			harga.add(input.nextLine());
			System.out.print("Kuantiti: ");
			kuantiti.add(input.nextLine());
		}
		
		input.close();
		
		try (PrintWriter pw = new PrintWriter(new FileWriter("senarai_barang.txt"))) {
			for (int i = 0; i < bilBarang; i++) {
				pw.println(barang.get(i) + "," + harga.get(i) + "," + kuantiti.get(i));
			}
			
			System.out.println("Data berjaya disimpan.");
		}
		catch (IOException e) {
			System.out.println("Data tidak berjaya untuk disimpan.");
		}
	}

}
