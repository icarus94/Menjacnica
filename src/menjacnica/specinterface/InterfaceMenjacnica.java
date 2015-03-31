package menjacnica.specinterface;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface InterfaceMenjacnica  {
	
	public void dodajKurs(double prodajni,double kupovni,GregorianCalendar dan,String naziv,String skraceniNazivValute); 
	//ako se srednji kurs racuna preko neke metode koja nije zadata u zadatku
	public void brisanjeKursa(GregorianCalendar dan,String skraceniNazivValute);
	public Valuta pronadjiKurs(GregorianCalendar dan,String skraceniNazivValute);

}
