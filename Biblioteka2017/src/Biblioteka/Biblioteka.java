package Biblioteka;

import java.util.LinkedList;

import Biblioteka.Interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga k) {
		knjige.add(k);
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		knjige.remove(k);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn) {
		// TODO Auto-generated method stub
		LinkedList<Knjiga> rezultati=new LinkedList<Knjiga>();
		
		for(int i=0;i<knjige.size();i++){
			if(knjige.get(i).getNaslov().contains(naslov)){
				rezultati.add(knjige.get(i));
			}
		}
		
		return rezultati;
	}

}
