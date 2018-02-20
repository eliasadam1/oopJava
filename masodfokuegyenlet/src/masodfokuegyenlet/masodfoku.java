package masodfokuegyenlet;

public class masodfoku {
	public static void main(String args[]){
		int a = 5;
		int b = 20;
		int c = 2;
		double diszkriminans = 0;
		double x1,x2 = 0;
		diszkriminans = Math.sqrt((b*b)-4*a*c); 
		
		if(Double.isNaN(diszkriminans)){
			System.out.println("Nincs valós megoldás.");
			
			
		}else {
			x1 = (b *(-1)+ diszkriminans) / 2 * a;
			x2 = (b *(-1)- diszkriminans) / 2 * a;
			System.out.println("A megoldás: x1:" + x1 + " x2:" + x2);
		}
		
		
		
		System.out.println(diszkriminans);
		
		
	}
}
