package masodfokuegyenlet;

import java.util.Scanner;

public class masodfoku {
	public static void main(String args[]){
		int tomb[] = new int[3];
		double diszkriminans = 0;
		double x1,x2 = 0;
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		int b=0;
		int c=0;
		
		
		System.out.println("Kerem adja meg az 1. együtthatot: ");
		tomb[0] = sc.nextInt();
		
		System.out.println("Kerem adja meg az 2. együtthatot: ");
		tomb[1] = sc.nextInt();
		
		System.out.println("Kerem adja meg az 3. együtthatot: ");
		tomb[2] = sc.nextInt();
		
		sc.close();
		
		a = tomb[0];
		b = tomb[1];
		c = tomb[2];
		
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
