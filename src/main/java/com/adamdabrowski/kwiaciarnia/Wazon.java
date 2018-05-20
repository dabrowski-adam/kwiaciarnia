package com.adamdabrowski.kwiaciarnia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wazon implements Kontener<Kwiat> {
    private int pojemnosc;
    private List<Kwiat> kwiaty;

    public Wazon(int pojemnosc) {
        this.pojemnosc = pojemnosc;
        kwiaty = new ArrayList<>();
    }

    public boolean dodaj(Kwiat obj) {
        if (obj == null) { return false; }

        return (ileWolnegoMiejsca() >= obj.rozmiar) && kwiaty.add(obj);
    }

    public boolean usun(Kwiat obj) {
        if (obj == null) { return false; }

        return kwiaty.remove(obj);
    }

    public List<Kwiat> pobierzWszystkie() {
        return Collections.unmodifiableList(kwiaty);
    }

    public int ileWolnegoMiejsca() {
        return pojemnosc - kwiaty.stream().mapToInt(kwiat -> kwiat.rozmiar).sum();
    }

    double podajWartosc() {
        return kwiaty.stream().mapToDouble(kwiat -> kwiat.cena).sum();
    }
}
