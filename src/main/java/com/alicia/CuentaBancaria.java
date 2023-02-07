package com.alicia;


public class CuentaBancaria {
    private String nombreTitular;
    private String apellidoTitular;
    private String numeroCuenta;
    public enum tipoCuenta {AHORROS, CORRIENTE};
    private tipoCuenta tipo;
    private double saldoCuenta = 0;
  
    public CuentaBancaria(String nombreTitular, String apellidoTitular, String numeroCuenta, tipoCuenta tipo,
            double saldoCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
        this.saldoCuenta = saldoCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getApellidoTitular() {
        return apellidoTitular;
    }

    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public tipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(tipoCuenta tipo) {
        this.tipo = tipo;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public double consultarSaldoCuenta(){
        return getSaldoCuenta();
    }

    public double saldoActulizado(double cantidad){
        return saldoCuenta + cantidad;
    }

    public double saldoActualRetirada(Double retirada){
        if (retirada > saldoCuenta ){
            retirada = saldoCuenta;
        }
        setSaldoCuenta(saldoCuenta-retirada);
        return saldoCuenta;
    }

    // public boolean saldoActualRetirada(double n) {
    //     boolean reintegroCorrecto = true;                                                                         
    //     if (n > 0) {
    //         reintegroCorrecto = false;
    //     } else if (saldoCuenta <= n) {
    //         saldoCuenta -= n;
    //     } else {
    //         reintegroCorrecto = false;
    //     }
    //     return reintegroCorrecto;
    // }

    
}
