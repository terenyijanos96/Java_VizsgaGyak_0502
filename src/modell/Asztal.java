/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author TerényiJános(SZF_E_2
 */
public class Asztal {

    ArrayList<Ital> italok = new ArrayList<>();

    public Asztal() {
        italok.add(new Sor("Dreher (sör)", "5.0%", ItalCimke.REGI, 60));
        italok.add(new Sor("Miller (sör)", "6%", ItalCimke.REGI));
        italok.add(new Sor("Kőbányai (sör)", "4.9%", ItalCimke.REGI));
        italok.add(new Bor("Egri Bikavér (bor)", "15.2%", ItalCimke.REGI, "száraz"));
        italok.add(new Bor("Szürkebarát (bor)", "13%", ItalCimke.REGI, "édes"));
        italok.add(new Bor("Furmint (bor)", "16.9%", ItalCimke.REGI, "félédes"));
    }

    public List<Ital> getItalok() {
        return Collections.unmodifiableList(italok);
    }

}
