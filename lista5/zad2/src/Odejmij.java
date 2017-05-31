/**
 * Created by kacper on 29.03.17.
 */
public class Odejmij extends Wyrazenie{
    private int a , b ;
    Odejmij(Wyrazenie a, Wyrazenie b){
        this.a = a.oblicz();
        this.b = b.oblicz();
    }
    int oblicz(){
        return this.a-this.b;
    }


    public String toString() {
        return "Roznica a i b jest"+ this.oblicz();
    }
}
