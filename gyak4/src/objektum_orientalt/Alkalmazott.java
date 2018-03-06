package objektum_orientalt;

public class Alkalmazott {
	private String name;
	private int payment;

	public void fizNov(int fizBe) {
		payment += fizBe;
	}

	public String szovegVissza(){
		
		return "Nev: " + name + "Fizetes: " + payment;
		}
	public String getName(){
		return name;
	}
	public void setName(String nameIn){
		name = nameIn;
	}
	public int getPayment(){
		return payment;
	}
	public void setPayment(int paymentIn){
		payment = paymentIn;
	}
	public boolean fizHatar(int low, int up){
		if(payment >= low && payment <= up)
			return true;
		return false;
	}
	public double getTax(){
		return payment * ((double)16/(double)100);
	}
	
	public boolean nagyobbE(Alkalmazott objektum_orientalt){
		if(payment > objektum_orientalt.payment)
			return true;
		
		return false;
	}
	
}
