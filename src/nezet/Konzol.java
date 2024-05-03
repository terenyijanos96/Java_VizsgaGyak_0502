/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Asztal;
import modell.Bor;
import modell.Ital;
import modell.Sor;

/**
 *
 * @author TerényiJános(SZF_E_2s
 */
public class Konzol {

    private List<Ital> italok;
    private List<Sor> sorok;
    private List<Bor> borok;

    public Konzol() {
        Asztal a = new Asztal();
        this.italok = a.getItalok();
        this.sorok = new ArrayList<Sor>();
        this.borok = new ArrayList<Bor>();
        ital_valogato();
    }

    private void ital_valogato() {

        for (Ital ital : this.italok) {
            if (ital instanceof Sor) {
                this.sorok.add((Sor) ital);

            } else if (ital instanceof Bor) {
                this.borok.add((Bor) ital);
            }

        }
    }

    public void feladatok() {
        italokAsztalon();
        italokFajlban();
        statisztika();
    }

    private void italokAsztalon() {
        for (Sor sor : sorok) {
            System.out.println(sor);
        }

        for (Bor bor : borok) {
            System.out.println(bor);
        }
    }

    private void italokFajlban() {
        try {
            FileOutputStream fajlKi = new FileOutputStream("italok_fajlban.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fajlKi);

            for (Sor sor : sorok) {
                oos.writeObject(sor);
            }

            for (Bor bor : borok) {
                oos.writeObject(bor);
            }
            
            oos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Konzol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Konzol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void statisztika() {
        Map<String, String> map = new HashMap();
        
        
     
        
    }

}
