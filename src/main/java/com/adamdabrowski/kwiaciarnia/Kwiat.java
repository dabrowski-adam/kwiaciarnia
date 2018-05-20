package com.adamdabrowski.kwiaciarnia;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Kwiat {
    final int rozmiar;
    final double cena;

    public Kwiat(int rozmiar, double cena) {
        this.rozmiar = rozmiar;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(rozmiar)
                .append(cena)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != getClass()) { return false; }

        Kwiat rhs = (Kwiat) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(rozmiar, rhs.rozmiar)
                .append(cena, rhs.cena)
                .build();
    }
}
