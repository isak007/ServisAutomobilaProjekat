package modeli;
import java.util.ArrayList;

public class ServisnaKnjizica {
	private Automobil automobil;
	private ArrayList<Servis> listaServisa;
	private String sifreServisa;
	private String id;
	
	
	// konstruktori
	public ServisnaKnjizica() {};
	public ServisnaKnjizica(Automobil automobil, ArrayList<Servis> listaServisa, String id) {
		this.automobil = automobil;
		this.listaServisa = listaServisa;
		this.id = id;
	}
	public ServisnaKnjizica(ServisnaKnjizica servisnaKnjizica) {
		this.automobil = servisnaKnjizica.automobil;
		this.listaServisa = servisnaKnjizica.listaServisa;
		this.id = servisnaKnjizica.id;
	}
	
	
	
	//
	public String getSifreServisa() {
		sifreServisa = "";
		if(listaServisa.size() > 0) {
			for (int i = 0; i < listaServisa.size(); i++) {
				sifreServisa += listaServisa.get(i).getId() + ".";
			}
			sifreServisa = sifreServisa.substring(0, sifreServisa.length()-1);
		}
		return sifreServisa;
	}
	public void setSifreServisa(String sifreServisa) {
		this.sifreServisa = sifreServisa;
	}
	//
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//
	public Automobil getAutomobil() {
		return automobil;
	}
	public void setAutomobil(Automobil automobil) {
		this.automobil = automobil;
	}
	//
	public ArrayList<Servis> getListaServisa() {
		return listaServisa;
	}
	public void setListaServisa(ArrayList<Servis> listaServisa) {
		this.listaServisa = listaServisa;
	}
	
	@Override
	public String toString() {
		return this.automobil.getId()+","+this.getSifreServisa()+","+this.id;
	}
}