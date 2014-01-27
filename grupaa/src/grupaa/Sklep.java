package grupaa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sklep {
	Set<Towar> tow;
	
	Towar max(){
		Iterator<Towar> it = tow.iterator();
		Towar towar = it.next();
		while(it.hasNext()) {
			Towar t = it.next();
			if(t.dost.size()>towar.dost.size()) {
				towar = t;
			}
		return towar;
		}
	}
	
	String maxD() {
		String mNaz = null;
		int dMax = 0;
		for(Towar t : tow) {
			Set<String> dostawcy = new HashSet<String>();
			for(Dostawa d : t.dost) {
				dostawcy.add(d.nazwaDostawcy);
				
				if(dostawcy.size()>dMax) {
					dMax = dostawcy.size;
					mNaz = t.nazwa;
				}
			}
			return mNaz;
		}
	}
	
	double wartoscTowarow() {
		double suma = 0;
		for(Towar t:tow) {
			for(Dostawa d : t.dost) {
				suma += d.cena * d.ilosc;
			}
		}
		return suma;
	}
	
	Towar getTowar(String nazwa) {
		Iterator<Towar> it = tow.iterator();
		Towar t = null;
		while(it.hasNext() && (t==null || !t.nazwa.equals(nazwa))) {
			t = it.next();
		}
		return t;
		
	}
	boolean dostarcza(String nazwaTow, String nazwaDost) {
	Towar t = getTowar(nazwaTow);
	for (Dostawa d : dost) {
		if(d.nazwaDostawcy.equals(nazwaDost)) {
			return true;
		}
	}
		return false;
	}

	Set<String> wszyscyDostawcy() {
		Set<String>dostawcy = new HashSet<String>();
		for(Towar t : tow) {
			for(Dostawa d : dost) {
				dostawcy.add(d.nazwaDostawcy);
			}
		}
		return dostawcy;
	}
	

	
}

