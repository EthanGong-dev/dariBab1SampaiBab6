package geminiQuestion;

interface KiraDiskaun {
    double hitung(double baki); 
}

public class question2 {

	public static void main(String[] args) {
		
        KiraDiskaun vip = (baki) -> baki * 0.10;

        KiraDiskaun marhaen = (baki) -> 5.0;

        double bakiUser = 1000.0;
        
        System.out.println("Diskaun VIP: RM" + vip.hitung(bakiUser));
        System.out.println("Diskaun Marhaen: RM" + marhaen.hitung(bakiUser));
		
	}

}
