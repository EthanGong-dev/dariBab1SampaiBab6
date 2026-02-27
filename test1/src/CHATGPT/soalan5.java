package CHATGPT;

class Order {
	String foodName;
	double price;
	
	public Order(String foodName, double price) {
		this.foodName = foodName;
		this.price = price;
	}
}

class DeliveryOrder extends Order {
	double deliveryFee;
	
	public DeliveryOrder(String foodName, double price, double deliveryFee) {
		super(foodName, price);
		this.deliveryFee = deliveryFee;
	}
	
	public void totalPrice() {
		price = price + deliveryFee;
	}
}


public class soalan5 {

	public static void main(String[] args) {
		
		DeliveryOrder d1 = new DeliveryOrder("Nasi Lemak", 5.0, 3.0);
		d1.totalPrice();
		System.out.println("Makanan: " + d1.foodName + "\nHarga: RM" + d1.price);

	}

}
