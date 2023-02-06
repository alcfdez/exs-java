package com.alicia;

/* Enunciado: clase Automóvil
Se requiere un programa que modele el concepto de un automóvil. Un
automóvil tiene los siguientes atributos:
- Marca: el nombre del fabricante.
- Modelo: año de fabricación.
- Motor: volumen en litros del cilindraje del motor de un automóvil.
- Tipo de combustible: valor enumerado con los posibles valores de
gasolina, bioetanol, diésel, biodiésel, gas natural.
- Tipo de automóvil: valor enumerado con los posibles valores de
carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.
- Número de puertas: cantidad de puertas.
- Cantidad de asientos: número de asientos disponibles que tiene el
vehículo.
- Velocidad máxima: velocidad máxima sostenida por el vehículo
en km/h.
- Color: valor enumerado con los posibles valores de blanco, negro,
rojo, naranja, amarillo, verde, azul, violeta.
- Velocidad actual: velocidad del vehículo en un momento dado.

La clase debe incluir los siguientes métodos:
- Un constructor para la clase Automóvil donde se le pasen como
parámetros los valores de sus atributos.
- Métodos get y set para la clase Automóvil.
- Métodos para acelerar una cierta velocidad, desacelerar y frenar
(colocar la velocidad actual en cero). Es importante tener en cuen-
ta que no se debe acelerar más allá de la velocidad máxima per-
mitida para el automóvil. De igual manera, tampoco es posible
desacelerar a una velocidad negativa. Si se cumplen estos casos, se
debe mostrar por pantalla los mensajes correspondientes.
- Un método para calcular el tiempo estimado de llegada, utilizando
como parámetro la distancia a recorrer en kilómetros. El tiempo
estimado se calcula como el cociente entre la distancia a recorrer y
la velocidad actual.
- Un método para mostrar los valores de los atributos de un Auto-
móvil en pantalla.
- Un método main donde se deben crear un automóvil, colocar su
velocidad actual en 100 km/h, aumentar su velocidad en 20 km/h,
luego decrementar su velocidad en 50 km/h, y después frenar. Con
cada cambio de velocidad, se debe mostrar en pantalla la velocidad
actual.*/

public class Automovil {
    private String marca = null;
    private int fecha = 0;
    private int motor= 0;
    private enum tipoCombustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GASNATURAL};
    private tipoCombustible typeCombustible= null;
    private enum tipoAutomovil {CARRODECIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV} 
    private tipoAutomovil typeAutomovil = null;
    private int numeroPuertas = 0;
    private int cantidadAsientos = 0;
    private int velocidadMax = 120;
    private enum color {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA};
    private color typeColor = null;
    private int velocidadActual = 0;
    
    public Automovil(String marca, int fecha, int motor, tipoCombustible typeCombustible, tipoAutomovil typeAutomovil,
            int numeroPuertas, int cantidadAsientos, int velocidadMax, color typeColor, int velocidadActual) {
        this.marca = marca;
        this.fecha = fecha;
        this.motor = motor;
        this.typeCombustible = typeCombustible;
        this.typeAutomovil = typeAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMax = velocidadMax;
        this.typeColor = typeColor;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCombustible getTypeCombustible() {
        return typeCombustible;
    }

    public void setTypeCombustible(tipoCombustible typeCombustible) {
        this.typeCombustible = typeCombustible;
    }

    public tipoAutomovil getTypeAutomovil() {
        return typeAutomovil;
    }

    public void setTypeAutomovil(tipoAutomovil typeAutomovil) {
        this.typeAutomovil = typeAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public color getTypeColor() {
        return typeColor;
    }

    public void setTypeColor(color typeColor) {
        this.typeColor = typeColor;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
private boolean acelerar (int velocidadActual, int velocidadMax) {
    if (velocidadActual < 10 ){
        return velocidadActual == 10;   
    }
    
}    
    

}
