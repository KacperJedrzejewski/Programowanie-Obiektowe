/**
 * Created by kacper on 29.03.17.
 */

public class Podziel extends Wyrazenie{
    private int a , b ;
    Podziel(Wyrazenie a, Wyrazenie b){
        this.a = a.oblicz();
        this.b = b.oblicz();
    }
    int oblicz(){
        if (this.b == 0) try {
            throw new Exception("Dzielenie przez zero");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.a+this.b;
    }


    public String toString() {
        return "Ilorazem a i b jest"+ this.oblicz();
    }
}
