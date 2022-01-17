public class PracownikDzialuWypozyczen extends Pracownik {

	// TODO - Mateusz
	public List<Samochod> sprawdzenieDostêpnoœciSamochodow(Samochod wymagania) {

		List<Samochod> lista = new ArrayList<Samochod>();

		for (Samochod samochod:
			 Database.listaWypozyczen) {

			if (samochod.equals(wymagania)) {
				lista.add(samochod);
			}
		}
		return lista;
	}


	public void dodajWypozyczenie(Samochod samochod, Klient klient) {
		throw new UnsupportedOperationException();
	}


	public void usunWypozyczenie(String nrRejestracyjny) {
		throw new UnsupportedOperationException();
	}


	public void odbierzSamochod(String nrRejestracyjny) {
		throw new UnsupportedOperationException();
	}


	public float obliczOplate(float Stawka, int IloœæDni) {
		throw new UnsupportedOperationException();
	}


	// TODO - Marcin
	public List<Samochod> przeszukajListeSamochodow(Samochod filtr) {
		throw new UnsupportedOperationException();
	}


	public boolean czyIstniejeKlient(String ID) {
		throw new UnsupportedOperationException();
	}


	public void stworzKlienta(String[] dane) {

	}


	// TODO - Tomasz
	public Wypozyczenie szukajWypozyczenia(int ID) {
		for(Wypozyczenie szukane: Database.listaWypozyczen){
			if(szukane.ID == ID){
				return szukane;
			}
		}
	}


	// TODO - Tomasz
	public List<Wypozyczenie> przeszukajListeWypozyczen(List<String> numeryRejestracyjne) {
		List<Wypozyczenie> lista = new ArrayList<Wypozyczenie>();
		for(Wypozyczenie szukane: Database.listaWypozyczen){
			for(String szukaneRejestracje: numeryRejestracyjne){
				if(szukane.Samochod.nrRejestracyjny == szukaneRejestracje){
					lista.add(szukane);
				}
			}
		}
		return lista;
	}

}
