package CHATGPT;

abstract class Pengangkutan {
	public abstract void bunyi();
	public abstract void seater();
}

class Bas extends Pengangkutan {
	public void bunyi() {
		System.out.println("Bunyi bas adalah tut tut!");
	}
	public void seater() {
		System.out.println("Bas boldeh di duduk sebanyak 20+ orang.");
	}
}

class Teksi extends Pengangkutan {
	public void bunyi() {
		System.out.println("Bunyi bas adalah beep beep!");
	}
	public void seater() {
		System.out.println("Bas boldeh di duduk sebanyak 2 sehingga 4 orang.");
	}
}

public class soalan4 {
	
	public static void main(String[] args) {
		
		Pengangkutan[] Terminal = new Pengangkutan[2];
		Terminal[0] = new Bas();
		Terminal[1] = new Teksi();
		
		for (int i = 0; i < Terminal.length; i++) {
			Terminal[i].bunyi();
			Terminal[i].seater();
		}
		
	}
	
}
