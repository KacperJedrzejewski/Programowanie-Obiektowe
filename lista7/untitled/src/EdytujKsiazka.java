/**
 * Created by kacper on 12.04.17.
 */
import java.io.*;
import javax.swing.*;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EdytujKsiazka extends JFrame implements Serializable, ActionListener {
        
        public JButton ButtonZapisz, ButtonOtworz;
        public JTextField TAutor, TIlosc_stron,TWydawnictwo;

        Ksiazka obiekt;
        String Nazwa_pliku;

        void Open(){
            TAutor.setText(obiekt.autor);
            TIlosc_stron.setText(obiekt.ilosc_stron);
            TWydawnictwo.setText(obiekt.wydawnictwo);

        }

        void Save(){
            obiekt = new Ksiazka(TAutor.getText(), TIlosc_stron.getText(),
                    TWydawnictwo.getText());
        }

        void SaveToFile()  {
            ObjectOutputStream zapis = null;
            try {

                zapis = new ObjectOutputStream(new FileOutputStream(Nazwa_pliku));
                Save();
                zapis.writeObject(obiekt);
                zapis.flush();
                JOptionPane.showMessageDialog(null, "Zapisano");

                if(zapis!=null)
                    zapis.close();
            }

            catch (FileNotFoundException e1) {
                JOptionPane.showMessageDialog(null,"Problem: "+e1);
            }

            catch (IOException e1) {
                JOptionPane.showMessageDialog(null,"Problem: "+e1);
            }


        }

        void OpenFromFile() {
            ObjectInputStream odczyt = null;
            try{

                    odczyt = new ObjectInputStream(new FileInputStream(Nazwa_pliku));
                    obiekt = (Ksiazka) odczyt.readObject();
                    Open();
                    JOptionPane.showMessageDialog(null,"Odczytano");


                    if(odczyt != null)
                        odczyt.close();

            }
            catch (IOException e1) {
                JOptionPane.showMessageDialog(null,"Problem: "+e1);
            }
            catch (ClassNotFoundException e1) {
                JOptionPane.showMessageDialog(null,"Problem: "+e1);
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if( source == ButtonZapisz ){
                SaveToFile();
            }

            if( source == ButtonOtworz ){
                OpenFromFile();
            }
        }

        public EdytujKsiazka(String n, int x){
            Nazwa_pliku = n;
            obiekt = new Ksiazka("","","");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, (x*30));
            setLocation(50,50);
            setLayout(null);


            JLabel M = new JLabel("Autor:");
            M.setBounds(0, 0, 200, 30);
            getContentPane().add(M);
            TAutor = new JTextField("");
            TAutor.setBounds(200, 0, 200, 30);
            getContentPane().add(TAutor);

            JLabel P = new JLabel("Ilosc stron:");
            P.setBounds(0, 30, 200, 30);
            getContentPane().add(P);
            TIlosc_stron = new JTextField("");
            TIlosc_stron.setBounds(200, 30, 200, 30);
            getContentPane().add(TIlosc_stron);

            JLabel R = new JLabel("Wydawnictwo:");
            R.setBounds(0, 60, 200, 30);
            getContentPane().add(R);
            TWydawnictwo = new JTextField("");
            TWydawnictwo.setBounds(200, 60, 200, 30);
            getContentPane().add(TWydawnictwo);


            ButtonZapisz = new JButton("Zapisz do pliku");
            ButtonOtworz = new JButton("Otwórz z pliku");

            ButtonZapisz.setBounds(0,30*(x-1) , 200, 30);
            ButtonOtworz.setBounds(200,30*(x-1), 200, 30);

            getContentPane().add(ButtonZapisz);
            getContentPane().add(ButtonOtworz);
            ButtonZapisz.addActionListener(this);
            ButtonOtworz.addActionListener(this);

            setVisible(true);
        }
    }


