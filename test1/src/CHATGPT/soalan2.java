package CHATGPT;

interface BolehTerbang {
	public void terbang();
}

class burung implements BolehTerbang {
	public void terbang() {
		System.out.println("Burung terbang guna sayap mereka sendiri.");
	}
}

class KapalTerbang implements BolehTerbang {
	public void terbang() {
		System.out.println("Kapal terbang terbang guna sayap ciptaan manusia.");
	}
}

public class soalan2 {
	
	public static void main(String[] args) {
		
		burung t1 = new burung();
		KapalTerbang t2 = new KapalTerbang();
		
		t1.terbang();
		t2.terbang();
		
	}
}
