import java.util.Scanner;
public class Balls {
	Scanner s = new Scanner(System.in);
	private double price;
	private double quantity, total;
	private String Ball;
	
	Balls(){
		System.out.println("Enter the type of Ball : ");
		this.Ball = s.nextLine();
		System.out.println("Enter the price : RM ");
		this.price = s.nextDouble();
		System.out.println("Enter the quantity : ");
		this.quantity = s.nextDouble();
	}
	
	public String getBall() {
		return this.Ball;
	}   
	public double getprice() {
		return this.price;
	}
	public double getquantity() {
		return this.quantity;
	}
	public double gettotal() {
		return this.price * this.quantity ;
	}
	
	public String toString() {
		return "The price = RM " + this.price + "\n" + "The quantity = " + this.quantity ;
	}
}
