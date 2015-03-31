package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.specinterface.InterfaceMenjacnica;

public class MenjacnicaFunkcije implements InterfaceMenjacnica {
	
	public LinkedList<Valuta> valutaLista = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(double prodajni, double kupovni,
			GregorianCalendar dan, String naziv, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		Valuta nova = new Valuta();
		nova.setDatum(dan);
		nova.setKracinazivValute(skraceniNazivValute);
		nova.setNazivValute(naziv);
		nova.setKupovnaValuta(kupovni);
		nova.setProdajnaValuta(prodajni);
		nova.setSrednjaValuta((kupovni+prodajni)/2);
		valutaLista.addLast(nova);
	}

	@Override
	public void brisanjeKursa(GregorianCalendar dan, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		for (int i = 0; i < valutaLista.size(); i++){
			if(valutaLista.get(i).getDatum().equals(dan) && valutaLista.get(i).getKracinazivValute().equals(skraceniNazivValute)){
				valutaLista.remove(i);
				return;
			}
		}
	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar dan, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		for (int i = 0; i < valutaLista.size(); i++){
			if(valutaLista.get(i).getDatum().equals(dan) && valutaLista.get(i).getKracinazivValute().equals(skraceniNazivValute))
				return valutaLista.get(i);
		}
		System.out.println("nije pronadjeno");
		return null;
	}
	
	

}
