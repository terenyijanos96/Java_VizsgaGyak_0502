/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.text.Collator;
import java.util.UUID;

/**
 *
 * @author TerényiJános(SZF_E_2
 */
public class Sor extends Ital implements Comparable<Sor> {

    private UUID id;
    private int malata_arany;

    public Sor(String nev, String alkohol_fok, ItalCimke cimke, int malata_arany) {
        super(nev, alkohol_fok, cimke);
        this.id = UUID.randomUUID();
        this.malata_arany = malata_arany;
    }

    public Sor(String nev, String alkohol_fok, ItalCimke cimke) {

        this(nev,
                alkohol_fok,
                cimke,
                50 + (int) (Math.random() * (75 - 50) + 1)
        );
    }

    public int getMalata_arany() {
        return malata_arany;
    }

    public void setMalata_arany(int malata_arany) {
        this.malata_arany = malata_arany;
    }

    @Override
    public ItalCimke getCimke() {
        return cimke;
    }

    @Override
    public void setCimke(ItalCimke cimke) {
        this.cimke = cimke;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {

        return "Ital{" + super.toString() + "}" + "Sor{" + "id=" + id + ", malata_arany=" + malata_arany + '}';
    }

    @Override
    public int compareTo(Sor o) {
        Collator coll = Collator.getInstance();
        return coll.compare(super.getNev(), o.getNev());
    }

}
