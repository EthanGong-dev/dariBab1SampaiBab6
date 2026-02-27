package topic4a1;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan 2 harga barang anda: RM");
		String harga1 = input.nextLine();
		System.out.print(", RM");
		String harga2 = input.nextLine();
		
		input.close();
		
		Double harga1Int = Double.parseDouble(harga1);
		Double harga2Int = Double.parseDouble(harga2);
		
		Double total = harga1Int + harga2Int;
		
		System.out.printf("Total: RM%1.2f", total);
		System.out.println();
		System.out.print(Double.valueOf(total));
		
	}

}
