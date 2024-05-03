package modell;

import modell.Ital;
import modell.ItalCimke;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author TerényiJános(SZF_E_2
 */
public class Bor extends Ital {

    private final String cukor_tartalom;

    public Bor(String nev, String alkohol_fok, ItalCimke cimke, String cukor_tartalom) {
        super(nev, alkohol_fok, cimke);
        this.cukor_tartalom = cukor_tartalom;
    }

    @Override
    public ItalCimke getCimke() {
        return cimke;
    }

    @Override
    public void setCimke(ItalCimke cimke) {
        this.cimke = cimke;
    }

    public String getCukor_tartalom() {
        return cukor_tartalom;
    }

    @Override
    public String toString() {
        return "Ital{" + super.toString() + "}" + "Bor{" + "cukor_tartalom=" + cukor_tartalom + "}";
    }

}
