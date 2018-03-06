package objektum_orientalt;

public class AlkFut {
	public static void main(String[] args) {
		Alkalmazott alk1 = new Alkalmazott();
		Alkalmazott alk2 = new Alkalmazott();
		alk1.setName("Adam ");
		alk1.setPayment(1);
		
		
		System.out.println(alk1.szovegVissza());

		alk1.fizNov(15);
		System.out.println(alk1.szovegVissza());

		boolean isTrue = alk1.fizHatar(10, 20);
		if (isTrue)
			System.out.println("A megadott határok közé esik a fizetése");
		else
			System.out.println("Nem esik megadott határok közé a fizetése");
		System.out.println("Az ado értéke: " + alk1.getTax());
		
		alk2.setName("Tomi");
		alk2.setPayment(80);
		if(alk1.nagyobbE(alk2)){
			System.out.println("Alk1 fiz nagy");
		}else{
			System.out.println("Alk2 fiz nagy");
		}
		
	}
}
