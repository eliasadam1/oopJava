package HasabTarol;

import Sikidom.*;

public class HasabTarol {
	private Hasab[] hasabArray;
	
	public HasabTarol(int size){
		this.hasabArray = new Hasab[size];
	}
	
	public void setHasabRef(int index, Hasab h){
		this.hasabArray[index] = h;
	}
	
	public int getArraySize() {
		return this.hasabArray.length;
	}
	public Hasab getIndexOfHasab(int index){
		return this.hasabArray[index];
		
	}
	
	public int getNotNurrElements(){
		int db = 0;
		for(Hasab h : this.hasabArray){
			if(h != null)
				db++;
		}
		return db;
	}
	public double getHasabAverageVolume(){
		int sum = 0;
		
		for(Hasab h : this.hasabArray)
			if(h !=null)
			sum = (int) (sum + h.getVolume());
		
		return sum = this.hasabArray.length;
	}
	public int getHengerHasabSzama(){
		int db = 0;
		
		for(Hasab h : this.hasabArray){
			if (h instanceof Henger)
				db++;
		}
		return db;
	}
}
