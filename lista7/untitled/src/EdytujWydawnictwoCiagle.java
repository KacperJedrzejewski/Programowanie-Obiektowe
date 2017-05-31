/**
 * Created by kacper on 12.04.17.
 */
import javax.swing.*;

public class EdytujWydawnictwoCiagle extends EdytujKsiazka {
    public JTextField TSeria;
    WydawnictwoCiagle obiekt;

    void Open(){
        super.Open();
        TSeria.setText(obiekt.seria);
    }
    void Save(){
        obiekt = new WydawnictwoCiagle(TAutor.getText(), TIlosc_stron.getText(),
                TWydawnictwo.getText(),TSeria.getText());
    }


    public EdytujWydawnictwoCiagle(String n,int x){
        super(n,x);
        obiekt = new WydawnictwoCiagle("","","","");

        JLabel S = new JLabel("Seria:");
        S.setBounds(0, 90, 200, 30);
        getContentPane().add(S);
        TSeria = new JTextField("");
        TSeria.setBounds(200, 90, 200, 30);
        getContentPane().add(TSeria);


        setVisible(true);
    }
}


