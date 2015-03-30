package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String nazivValute,kracinazivValute;
	private double kupovnaValuta,srednjaValuta,prodajnaValuta;
	private GregorianCalendar datum;
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getKracinazivValute() {
		return kracinazivValute;
	}
	public void setKracinazivValute(String kracinazivValute) {
		this.kracinazivValute = kracinazivValute;
	}
	public double getKupovnaValuta() {
		return kupovnaValuta;
	}
	public void setKupovnaValuta(double kupovnaValuta) {
		this.kupovnaValuta = kupovnaValuta;
	}
	public double getSrednjaValuta() {
		return srednjaValuta;
	}
	public void setSrednjaValuta(double srednjaValuta) {
		this.srednjaValuta = srednjaValuta;
	}
	public double getProdajnaValuta() {
		return prodajnaValuta;
	}
	public void setProdajnaValuta(double prodajnaValuta) {
		this.prodajnaValuta = prodajnaValuta;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	
	
}
