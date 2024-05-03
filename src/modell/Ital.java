/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.Serializable;

/**
 *
 * @author TerényiJános(SZF_E_2
 */
public abstract class Ital implements Serializable{

    private String nev;
    private String alkohol_fok;
    public ItalCimke cimke;

    public Ital(String nev, String alkohol_fok, ItalCimke cimke) {
        this.nev = nev;
        this.alkohol_fok = alkohol_fok_ellenorzo(alkohol_fok);
        this.cimke = cimke;
    }

    private String alkohol_fok_ellenorzo(String bemenet) {
        String utolso_karakter_string = String.valueOf(bemenet.charAt(bemenet.length() - 1));
        if (!utolso_karakter_string.equals("%")) {
            throw new ItalFokException("Nincs %-jel a végén!");
        }

        if (!bemenet.contains(".")) {
            String szazalek_nelkul = bemenet.replace("%", "");
            bemenet = szazalek_nelkul + ".0%";
        }
        return bemenet;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getAlkohol_fok() {
        return alkohol_fok;
    }

    public void setAlkohol_fok(String alkohol_fok) {
        this.alkohol_fok = alkohol_fok;
    }

    public ItalCimke getCimke() {
        return cimke;
    }

    public void setCimke(ItalCimke cimke) {
        this.cimke = cimke;
    }

    @Override
    public String toString() {
        return "Ital{" + "nev=" + nev + ", alkohol_fok=" + alkohol_fok + ", cimke=" + cimke + '}';
    }

}
