package topic4a3;

public class question2 {

	public static void main(String[] args) {
		
		int[] nombor = {1, 2, 3};
		
		try {
			System.out.println(nombor[10]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index tu tak wujud bro!");
		}
	}

}
