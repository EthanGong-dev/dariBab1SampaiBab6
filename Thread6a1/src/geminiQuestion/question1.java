package geminiQuestion;

class CetakResit implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("🖨️ Sedang cetak resit #" + i);
            try { Thread.sleep(800); 
            } 
            catch (Exception e) 
            {
            	
            }
        }
    }
}

public class question1 {

	public static void main(String[] args) {
		
        Thread threadResit = new Thread(new CetakResit());

        threadResit.start(); 

        System.out.println("💳 Transaksi berjaya! Sila ambil kad anda.");
	}

}
