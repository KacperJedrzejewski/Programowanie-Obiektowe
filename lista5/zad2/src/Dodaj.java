/**
 * Created by kacper on 29.03.17.
 */
public class Dodaj extends Wyrazenie {
    private int a , b ;
    Dodaj(Wyrazenie a, Wyrazenie b){
        this.a = a.oblicz();
        this.b = b.oblicz();
    }
    int oblicz(){
        return this.a+this.b;
    }


    public String toString() {
        return "Suma a i b jest"+ this.oblicz();
    }
}
