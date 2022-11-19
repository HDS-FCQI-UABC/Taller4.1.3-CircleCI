package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AsteroideTest {

    @org.junit.jupiter.api.Test
    void getPosicion() {
        Posicion posicion = new Posicion(10, 10);
        Asteroide asteroide = new Asteroide(posicion);
        assertEquals(posicion, asteroide.getPosicion());
    }

    @org.junit.jupiter.api.Test
    void setPosicion() {
        Posicion posicion = new Posicion(10, 10);
        Asteroide asteroide = new Asteroide(posicion);
        assertEquals(posicion, asteroide.getPosicion());

    }

    @org.junit.jupiter.api.Test
    void mover() {
        Posicion posicion = new Posicion(10, 10);
        Asteroide asteroide = new Asteroide(posicion);
        asteroide.mover(10, 10);
        assertEquals(20, asteroide.getPosicion().getX());
        assertEquals(20, asteroide.getPosicion().getY());
    }
}