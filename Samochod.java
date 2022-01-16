public class Samochod {

	private String NumerRejestracyjny;
	private String Producent;
	private String Model;
	private Date RokProdukcji;
	private Date DataPrzejecia;
	private boolean SkrzyniaManualna;
	private Date OstatniPrzeglad;
	private float OlejSilnikowy;
	private String Uwagi;
	private boolean Gotowosc;
	private boolean Wypozyczony;
	private Ubzpieczenie Ubezpieczeie;

	// TODO
	public Samochod(String NumerRejestracyjny, String Producent, String Model, Date RokProdukcji, boolean SkrzyniaManualna) {

		this.NumerRejestracyjny = NumerRejestracyjny;
		this.Producent = Producent;
		this.Model = Model;
		this.RokProdukcji = RokProdukcji;
		this.SkrzyniaManualna = SkrzyniaManualna;
		this.Gotowosc = false;
		this.Wypozyczony = false;
	}


	public void sprzedajSamochod(String nrRejestracyjny) {
		throw new UnsupportedOperationException();
	}


	// TODO - Mateusz
	public void dodajUbezpieczenie(Ubezpieczenie ubezpieczenie) {

		if (ubezpieczenie != null) {
			this.Ubezpieczeie = ubezpieczenie;
		}
		else {
			System.out.println("ubezpieczenie is null");
		}
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Samochod) {
			Samochod other = (Samochod) obj;

			return (this.NumerRejestracyjny.equals(other.NumerRejestracyjny) || other.NumerRejestracyjny == null) &&
					(this.Producent.equals(other.Producent) || other.Producent == null) &&
					(this.Model.equals(other.Model) || other.Model == null) &&
					(this.RokProdukcji.equals(other.RokProdukcji) || other.RokProdukcji == null) &&
					(this.SkrzyniaManualna.equals(other.SkrzyniaManualna) || other.SkrzyniaManualna == null) &&
					(this.OlejSilnikowy.equals(other.OlejSilnikowy) || other.OlejSilnikowy == null)

		}
		return false;
	}

}