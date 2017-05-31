/**
 * Created by kacper on 11.04.17.
 */

public class Ksiazka  {
    String autor;
    String ilosc_stron;
    String wydawnictwo;

    Ksiazka(String autor,String ilosc_stron,String wydawnictwo){
        this.autor = autor;
        this.ilosc_stron = ilosc_stron;
        this.wydawnictwo = wydawnictwo;
    }

    public String toString(){
        return "Autor: "+this.autor+" Ilosc stron: "+this.ilosc_stron+" Wydawnictwo: "+this.wydawnictwo;
    }
}
