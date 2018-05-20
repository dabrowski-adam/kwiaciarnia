package com.adamdabrowski.kwiaciarnia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WazonTest {

    @Test
    void dodaj() {
        Wazon wazon = new Wazon(10);
        Roza roza = new Roza(3, 4);
        Tulipan tulipan = new Tulipan(2, 3);
        Slonecznik slonecznik = new Slonecznik(5, 3);

        wazon.dodaj(roza);
        wazon.dodaj(tulipan);
        wazon.dodaj(slonecznik);

        assertEquals(0, wazon.ileWolnegoMiejsca());
        assertEquals(roza.cena + tulipan.cena + slonecznik.cena,
                wazon.podajWartosc());
        assertFalse(wazon.dodaj(new Roza(2, 4)));
    }

    @Test
    void usun() {
        Wazon wazon = new Wazon(10);
        Roza roza = new Roza(3, 4);
        Tulipan tulipan = new Tulipan(2, 3);
        Slonecznik slonecznik = new Slonecznik(5, 3);

        wazon.dodaj(roza);
        wazon.dodaj(tulipan);
        wazon.dodaj(slonecznik);

        assertEquals(0, wazon.ileWolnegoMiejsca());
        assertEquals(roza.cena + tulipan.cena + slonecznik.cena,
                wazon.podajWartosc());

        wazon.usun(slonecznik);

        assertEquals(5, wazon.ileWolnegoMiejsca());
        assertEquals(roza.cena + tulipan.cena,
                wazon.podajWartosc());
    }
}