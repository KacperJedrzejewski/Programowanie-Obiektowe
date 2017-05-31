/**
 * Created by kacper on 12.04.17.
 */
import javax.swing.*;

public class EdytujCzasopismo extends EdytujKsiazka {

    public JTextField TNumer;
    Czasopismo obiekt;


    void Open(){
        super.Open();
        TNumer.setText(Integer.toString(obiekt.numer));
    }
    void Save(){
        obiekt = new Czasopismo(TAutor.getText(), TIlosc_stron.getText(),
                TWydawnictwo.getText(),Integer.parseInt(TNumer.getText()));
    }

    public EdytujCzasopismo(String n,int x){
        super(n,x);
        obiekt = new Czasopismo("","","",0);

        JLabel N = new JLabel("Numer:");
        N.setBounds(0, 90, 200, 30);
        add(N);
        TNumer = new JTextField("");
        TNumer.setBounds(200, 90, 200, 30);
        add(TNumer);

        setVisible(true);
    }
}


