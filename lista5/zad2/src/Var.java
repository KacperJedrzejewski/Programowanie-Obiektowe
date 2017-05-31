/**
 * Created by kacper on 29.03.17.
 */
import java.util.Map;
public class Var extends Wyrazenie{
    private String nazwa;
    private Map<String, Integer> typ;
    Var(String nazwa, Map<String,Integer> typ){
        this.nazwa = nazwa;
        this.typ = typ;
    }

    @Override
    int oblicz() {
        return typ.get(nazwa);
    }

    @Override
    public String toString() {
        return "Stala o wartosci: "+ this.oblicz();
    }

}
