/**
 * Created by kacper on 11.04.17.
 */
public class WydawnictwoCiagle extends Ksiazka {
    String seria;

    WydawnictwoCiagle(String autor,String ilosc_stron,String wydawnictwo,String seria){
        super(autor,ilosc_stron,wydawnictwo);
        this.seria = seria;
    }

    public String toString(){
        return "Autor: "+super.autor+" Ilosc stron: "+super.ilosc_stron
                +" Wydawnictwo: "+super.wydawnictwo+" Ksiazka z serii: "+this.seria;

    }
}
