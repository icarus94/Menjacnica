package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.specinterface.InterfaceMenjacnica;

public class MenjacnicaFunkcije implements InterfaceMenjacnica {

	@Override
	public void dodajKurs(double prodajni, double kupovni,
			GregorianCalendar dan, String naziv, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brisanjeKursa(GregorianCalendar dan, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar dan, String skraceniNazivValute) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
