package com.alicia;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CirculoTest {
    @Test
    void test_circulo_tiene_radio() {
        Circulo circulo = new Circulo (10);
        assertEquals(10, circulo.getRadio());
    }

    @Test
    void testCalcularArea() {
       Circulo circulo = new Circulo(1);
       double result = circulo.calcularArea();
       assertEquals(Math.PI, result);
    }

    @Test
    void testCalcularPErimetro() {
        
    }

    @Test
    void testGetRadio2() {
        
    }

    @Test
    void testSetRadio() {
        
    }
}
