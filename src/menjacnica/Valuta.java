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
	
	
	
	@Override
	public boolean equals(Object obj) { //kraciNaziv i datum su jedinstveni
		// TODO Auto-generated method stub
		if (!(obj instanceof Valuta))
			return false;
		Valuta val = (Valuta) obj;
		if(val.getDatum().equals(this.datum) && val.getKracinazivValute().equals(this.kracinazivValute))
			return true;
			
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Valuta/val \t"+nazivValute+"/"+kracinazivValute+"\t Datum"+datum+"kupovna/srednja/prodajna Valuta \t"+kupovnaValuta+"/"+srednjaValuta+"/"+
				prodajnaValuta+"\n";
	}
	
	
}
