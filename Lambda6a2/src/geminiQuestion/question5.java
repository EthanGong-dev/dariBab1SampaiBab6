package geminiQuestion;

import java.util.Scanner;

@FunctionalInterface
interface ZakatCalculator {
    double hitung(double baki);
}

public class question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ZakatCalculator zc = (baki) -> (baki * 0.025);
		
		System.out.print("Berapa kau bayar zakat: RM");
		double baki = input.nextInt();
		input.close();
		
	    double lepasHitung = zc.hitung(baki);
	    
	    if (lepasHitung >= 100) {
	    	System.out.println("Duit anda selepas hitung zakat ialah RM" + lepasHitung);
	    }
	    else {
	    	System.out.println("Duit anda lepas hitung zakat bawah RM100");
	    }
		
	}

}
