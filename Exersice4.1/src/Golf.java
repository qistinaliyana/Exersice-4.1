import java.util.Scanner;
public class Golf extends Balls {
	Scanner s = new Scanner(System.in);
	private String Brand;
	private double discount;
	
    public Golf() {
    	super();
    	System.out.println("Enter the Brands : ");
		this.Brand = s.nextLine();
		discount = discount;
	}
     public double getdiscount() {
    	 return this.discount;
    }
     public String getBrand() {
 		return this.Brand;
 	}   
    public double discounttotal() {
    	return super.getprice() * ((getprice() - discount)/100) ;
	}

}
