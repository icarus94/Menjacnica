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
		if (nazivValute.length() == 0 || nazivValute.equals(null))
			throw new RuntimeException("Nije unet naziv");
		this.nazivValute = nazivValute;
	}
	public String getKracinazivValute() {
		return kracinazivValute;
	}
	public void setKracinazivValute(String kracinazivValute) {
		if (kracinazivValute.length() != 3)
			throw new RuntimeException(
					"Kraci naziv mora da sadrzi 3 slova");
		this.kracinazivValute = kracinazivValute;
	}
	public double getKupovnaValuta() {
		return kupovnaValuta;
	}
	public void setKupovnaValuta(double kupovnaValuta) {
		if (kupovnaValuta <= 0)
			throw new RuntimeException("Pogresno unet");
		this.kupovnaValuta = kupovnaValuta;
	}
	public double getSrednjaValuta() {
		return srednjaValuta;
	}
	public void setSrednjaValuta(double srednjaValuta) {
		if (srednjaValuta <= 0)
			throw new RuntimeException("Pogresno unet");
		this.srednjaValuta = srednjaValuta;
	}
	public double getProdajnaValuta() {
		return prodajnaValuta;
	}
	public void setProdajnaValuta(double prodajnaValuta) {
		if (prodajnaValuta <= 0)
			throw new RuntimeException("Pogresno unet");
		this.prodajnaValuta = prodajnaValuta;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) throws Exception {
		GregorianCalendar danas = new GregorianCalendar();
		if(datum.after(danas))
			throw new Exception("Ne moze buduci kurs biti unet,samo trenutni ili prosli");
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
