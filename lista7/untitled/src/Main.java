/**
 * Created by kacper on 11.04.17.
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                JFrame ex;
                if(args[1].equals("Ksiazka")) ex = new EdytujKsiazka(args[0],4);
                else if(args[1].equals("WydawnictwoCiagle"))
                    ex = new EdytujWydawnictwoCiagle(args[0],5);
                else
                    ex = new EdytujCzasopismo(args[0],5);
                ex.setVisible(true);
            }
        });
    }
}