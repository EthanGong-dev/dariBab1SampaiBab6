package coding;

import java.util.*;

public class BankSystem {
	public static void main(String[] args) {
		ArrayList<Account> account = new ArrayList<Account>();
		
		Scanner input = new Scanner(System.in);
		
		
		String namaBank = "Arman Bank";
		String tajukBesar = "Welcome to " + namaBank;
		int jarakKosong = 8; //kena even number
		
		for (int i = 1; i <= (tajukBesar.length() + jarakKosong); i++) {
			System.out.print("-");
		}
		
		System.out.println();
		
		for (int i = 1; i <= (tajukBesar.length() + jarakKosong); i++) {
			if (i == 1 || i == (jarakKosong + 1)) {
				System.out.print("|");
			}
			else if (i == ((jarakKosong/2) + 1)) {
				System.out.print(tajukBesar);
			}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
		for (int i = 1; i <= (tajukBesar.length() + jarakKosong); i++) {
			System.out.print("-");
		}
		
		boolean exit = false;
		int pilihan = 0;
		
		while (exit == false) {
			System.out.print("\n\n");
			
			System.out.println("(1) Buat Account Baharu\n(2) Deposit Duit\n(3) Withdraw Duit\n(4) Keluar");
			System.out.print("Pilihan Anda: ");
			pilihan = input.nextInt();
			input.nextLine();
			
			switch (pilihan) {
            case 1:
                System.out.print("Nama Pemegang: ");
                String nama = input.nextLine();
                System.out.print("Nombor Akaun: ");
                String noAcc = input.nextLine();
                System.out.print("Jenis (1: Saving, 2: Current): ");
                int jenis = input.nextInt();

                if (jenis == 1) {
                	account.add(new SavingAccount(noAcc, nama, 100.0));
                    System.out.println("Akaun Simpanan Berjaya Dibuka!");
                } else {
                	account.add(new CurrentAccount(noAcc, nama, 100.0, 500.0));
                    System.out.println("Akaun Semasa Berjaya Dibuka!");
                }
                break;

            case 2:
                System.out.print("Masukkan No Akaun: ");
                String cariNo = input.next();

                for (Account acc : account) {
                    if (acc.getAccountNumber().equals(cariNo)) {
                        System.out.print("Jumlah Deposit: RM");
                        acc.deposit(input.nextDouble());
                    }
                }
                break;
                
            case 3:
            	System.out.print("Masukkan No Akaun untuk Withdraw: ");
                String noAccCari = input.nextLine();
                
                boolean jumpa = false;
                
                for (Account acc : account) {
                	if (acc.getAccountNumber().equals(noAccCari)) {
                		System.out.print("Masukkan jumlah pengeluaran: RM");
                        double jumlah = input.nextDouble();
                        input.nextLine();
                        
                        acc.withdraw(jumlah);
                        jumpa = true;
                        break;
                	}
                }
                
                if (!jumpa) {
                    System.out.println("Akaun tidak dijumpai dalam sistem " + namaBank);
                }
                break;

            case 4:
                System.out.println("Terima kasih menggunakan " + namaBank + "!");
                exit = true;
                break;
            
            default:
                System.out.println("Pilihan tidak sah!");
        }
		}
	}
	
	
}
