package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.specinterface.InterfaceMenjacnica;

public class MenjacnicaFunkcije implements InterfaceMenjacnica {

	LinkedList<Valuta> valuta = new LinkedList<>();
	
	@Override
	public void dodajKurs(double prodajni, double kupovni,
			GregorianCalendar dan, String naziv, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		Valuta v = new Valuta();
		v.setSrednjaValuta((kupovni/2)+(prodajni/2));
		v.setDatum(dan);
		v.setProdajnaValuta(prodajni);
		v.setKracinazivValute(skraceniNazivValute);
		v.setKupovnaValuta(kupovni);
		v.setNazivValute(naziv);
		valuta.addFirst(v);
	}

	@Override
	public void brisanjeKursa(GregorianCalendar dan, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		Valuta v = new Valuta();
		v.setDatum(dan);
		v.setKracinazivValute(skraceniNazivValute);
		for(int i=0;i<valuta.size();i++){
			if(valuta.get(i).equals(v))
				valuta.remove(i);
		}
	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar dan, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		Valuta v = new Valuta();
		v.setDatum(dan);
		v.setKracinazivValute(skraceniNazivValute);
		for(int i=0;i<valuta.size();i++){
			if(valuta.get(i).equals(v))
				return valuta.get(i);
		}
		return null;
	}
	
	

}
