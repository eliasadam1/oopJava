package objektum_orientalt;

public class AlkFut {
	public static void main(String[] args) {
		Alkalmazott[] alkok = new Alkalmazott[5];
		alkok[0] = new Alkalmazott();
		alkok[0].setName("Feri");
		alkok[0].setPayment(10);

		alkok[1] = new Alkalmazott();
		alkok[1].setName("Feri1");
		alkok[1].setPayment(20);

		alkok[2] = new Alkalmazott();
		alkok[2].setName("Feri2");
		alkok[2].setPayment(30);

		alkok[3] = new Alkalmazott();
		alkok[3].setName("Feri3");
		alkok[3].setPayment(40);

		alkok[4] = new Alkalmazott();
		alkok[4].setName("Feri4");
		alkok[4].setPayment(50);

		for (Alkalmazott objektum_orientalt : alkok) 

			System.out.println(objektum_orientalt.szovegVissza());
		
		int max = alkok[0].getPayment();
		for (int i = 0; i < alkok.length; i++) {
			if (alkok[i].getPayment() > max)
				max = alkok[i].getPayment();
		}
		
		
		
		System.out.println("A legnagyobb: " + max);

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
		if (alk1.nagyobbE(alk2)) {
			System.out.println("Alk1 fiz nagy");
		} else {
			System.out.println("Alk2 fiz nagy");
		}

	}
}
