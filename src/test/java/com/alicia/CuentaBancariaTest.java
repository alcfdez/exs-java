package com.alicia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.alicia.CuentaBancaria.tipoCuenta;

public class CuentaBancariaTest {
    @Test
    void testSaldoActualRetirada() {
        // Given
        CuentaBancaria cuenta = new CuentaBancaria("Giaco", "Pepe", "0000-0000-0000-0000-0000", tipoCuenta.AHORROS, 0);
        cuenta.setSaldoCuenta(200.00);

        cuenta.saldoActualRetirada(100.00);

        assertEquals(100, cuenta.getSaldoCuenta());
    }
}
