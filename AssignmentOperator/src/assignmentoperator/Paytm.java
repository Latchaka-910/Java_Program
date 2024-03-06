package assignmentoperator;

public class Paytm {
	public static void main(String[] args) {
		
		double walet=5000;
		System.out.println("walet balance :"+walet);
		int cb= 100;
		int recharge = 719;
		int icecream = 29;
		int cb1 = 49;
		int send = 2000;
		walet += cb;
		walet -= recharge;
		walet -= icecream;
		walet += cb1;
		walet -= send;
		System.out.println("updated walet balance :" +walet);
		
	}

}
