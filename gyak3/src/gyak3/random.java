package gyak3;
import java.util.Random;
public class random {
	public static void main(String[] args){
		
		int tomb[] = new int [10];
		Random rnd = new Random();
		
		for(int i=0; i<tomb.length; i++){
			tomb[i] = rnd.nextInt(50)+1;
			//System.out.println(tomb[i]);
			//tomb[i] = (int)(Math.random()* 50 )+1;
			
		}
		System.out.println("\n");
		for(int i=0; i<tomb.length;i++){
			//System.out.println(tomb[9-i]+ " ");
		}
		
		int max = tomb[0];
		for(int i=0; i<=tomb.length; i++){
			if(tomb[i] > max)
				max = i;
		}
		System.out.println("A legnagyobb elem: " + tomb[max]);
		
		int max2 = tomb[0];
		for(int i=0; i<tomb.length; i++){
			if(tomb[i] > max && tomb[i]%2 == 0)
				max2 = i;
		}
	}
}
