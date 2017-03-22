package Biblioteka;

import java.util.LinkedList;

import Biblioteka.Interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga k) {
		if(k==null) 
			throw new RuntimeException("Knjiga je null");
		
		knjige.add(k);
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		if(k==null) 
			throw new RuntimeException("Knjiga je null");
		
		knjige.remove(k);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {

		if(autor==null || isbn==0 || naslov==null || izdavac==null)
				throw new RuntimeException("Morate uneti neki kriterijum");
		
		LinkedList<Knjiga> rezultati=new LinkedList<Knjiga>();
		
		for(int i=0;i<knjige.size();i++){
			if(knjige.get(i).getNaslov().contains(naslov)){
				rezultati.add(knjige.get(i));
			}
		}
		
		return rezultati;
	}

}
