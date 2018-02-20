package tombmaximum;

public class tombmax {
	
public static void main(String[] args){
	
		
		int[] tomb= new int[10];
		int index=1;
		for(int i=0;i<tomb.length;i++) {
			tomb[i]=i+1;
			System.out.println("Az "+ i + " elem: " + tomb[i]);
		}
		for(int i=0;i<10;i++){
			if(tomb[i]>index){
				index=tomb[i];
				
			}
			
		}System.out.println("A tomb maximuma:" + index);
	}
}
