/**
 * Created by kacper on 29.03.17.
 */
import java.util.Map;
import java.util.HashMap;

public class main {

    public static void main(String[] args) {

        Num k = new Num(5);

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Y", 10);

        Var v = new Var("Y", map);

        Wyrazenie wyr;

        wyr = new Dodaj(k, v);

        System.out.println(wyr.toString());

        wyr = new Odejmij(k, v);

        System.out.println(wyr.oblicz());

        wyr = new Pomnoz(k, v);

        System.out.println(wyr.oblicz());

        /* Zagnieżdżanie */

        Num z = new Num(wyr.oblicz()); // 50
        wyr = new Dodaj(z, v); // 50 + 10
        Num z1 = new Num(wyr.oblicz()); // 60

        wyr = new Dodaj(z, z1); // 50+60
        System.out.println(wyr.oblicz()); // 110


     }
}