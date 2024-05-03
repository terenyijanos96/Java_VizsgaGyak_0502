/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.Comparator;

/**
 *
 * @author TerényiJános(SZF_E_2
 */
public class MalataComparator implements Comparator<Sor> {

    @Override
    public int compare(Sor s1, Sor s2) {
        return s2.getMalata_arany() - s1.getMalata_arany();
    }

}
