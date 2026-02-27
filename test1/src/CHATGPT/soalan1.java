package CHATGPT;

abstract class Bangun {
	abstract double kiraLuas(double a);
}

class Segiempat extends Bangun {
	public double kiraLuas(double a) {	
		return a*a;
	}
}

public class soalan1 {
	
	public static void main(String[] args) {
		
		Segiempat s1 = new Segiempat();
		System.out.println("Luas segi empat ialah " + s1.kiraLuas(3.5));
	
	}
}
