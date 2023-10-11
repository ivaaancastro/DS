package ej4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BolaBillarTest {

    BolaBillar bola1, blanca, bola8, bola12;

    @BeforeEach
    void setUp() {
        bola1 = BolaBillar.BOLA1;
        blanca = BolaBillar.BLANCA;
        bola8 = BolaBillar.BOLA8;
        bola12 = BolaBillar.BOLA12;

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getColor() {
        assertEquals(bola1.getColor(), "AMARILLO");
        assertEquals(blanca.getColor(), "BLANCO");
        assertEquals(bola8.getColor(), "NEGRO");
        assertEquals(bola12.getColor(), "VIOLETA");
    }

    @Test
    void getTipo() {
        assertEquals(bola1.getTipo(), "LISA");
        assertEquals(blanca.getTipo(), "LISA");
        assertEquals(bola8.getTipo(), "LISA");
        assertEquals(bola12.getTipo(), "RAYADA");
    }

    @Test
    void getNumero() {
        assertEquals(bola1.getNumero(), 1);
        assertEquals(blanca.getNumero(), 0);
        assertEquals(bola8.getNumero(), 8);
        assertEquals(bola12.getNumero(), 12);
    }


    @Test
    void values() {
        BolaBillar[] bolas = BolaBillar.values();
        assertEquals(bolas.length, 16);
    }
}