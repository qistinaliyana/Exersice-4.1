
public class Main {

	public static void main(String[] args) {
		Balls objBalls = new Balls();	
		System.out.println(objBalls);
		System.out.println("The total price : RM " + objBalls.gettotal());
		System.out.println();
		
		Golf objGolf = new Golf ();
		System.out.println(objGolf);
		System.out.println("The Brand : " + objGolf.getBrand());
		System.out.println("The total price : RM " + objGolf.gettotal());
		System.out.println("The discount : RM " + objGolf.discounttotal());
		System.out.println();
		
		Bowling objBowling = new Bowling ();
		System.out.println(objBowling);
		System.out.println("The Brand : " + objBowling.getBrand());
		System.out.println("The total price : RM " + objBowling.gettotal());
		System.out.println("The discount : RM " + objBowling.discounttotal());
		}
}
