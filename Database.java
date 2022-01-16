// TODO interfejs bazy danych, metoda typu wykonaj kwerendę, losowość, czy udało sie czy nie, jakaś mapa

public class Database {

    public List<Samochod> listaWypozyczen = new ArrayList<Samochod>();

    protected void fillListaWypozyczen() {

        Samochod samochod = new Samochod("12345678", "BMW", "R8", SimpleDateFormat("01/01/2018").format(new Date()), true);
        samochod.DataPrzejecia = SimpleDateFormat("01/01/2022").format(new Date());
        samochod.OstatniPrzeglad = SimpleDateFormat("01/01/2022").format(new Date());
        samochod.OlejSilnikowy = 0.9;
        samochod.Uwagi = "git";
        samochod.Gotowosc = false;
        samochod.Wypozyczony = false;
        samochod.Ubezpieczenie = null;
    }


    public Database() {

        this.listaWypozyczen.add(fillListaWypozyczen());
    }

}