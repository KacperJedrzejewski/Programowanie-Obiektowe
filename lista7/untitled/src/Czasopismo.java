/**
 * Created by kacper on 11.04.17.
 */
public class Czasopismo extends Ksiazka {
    int numer;

    Czasopismo( String autor,String ilosc_stron,String wydawnictwo,int numer){
        super(autor,ilosc_stron,wydawnictwo);
        this.numer = numer;
    }

    public String toString() {
        return "Autor: " + super.autor + " Ilosc stron: " + super.ilosc_stron
                + " Wydawnictwo: " + super.wydawnictwo + " Numer czasopisma: " + this.numer;


    }
}
