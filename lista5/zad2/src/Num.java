/**
 * Created by kacper on 29.03.17.
 */
public class Num extends Wyrazenie{
    private int x;
    Num(int x){
        this.x = x ;
    }

    @Override
    int oblicz() {
        return x;
    }

    @Override
    public String toString() {
        return "Stala o wartosci: "+ this.oblicz();
    }
}
