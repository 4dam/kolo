package grupaa;

import java.util.List;
import java.util.Scanner;

public class Towar {
	String nazwa;
	List<Dostawa> dost;

	void nowaDostawa() {
		String naz = null;
		double il = 0.0;
		double c = 0;
		Scanner sc = new Scnanner(System.in);
		sc.printf("nazwa towaru");
		naz = sc.next();
		sc.printf("ilosc");
		il = sc.nextDouble();
		sc.printf("cena");
		c = sc.nextDouble();
		dost.add(new Dostawa(naz, il, c));
		
	}

}
