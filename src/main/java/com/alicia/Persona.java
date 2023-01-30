package com.alicia;

/*Se requiere un programa que modele el concepto de una persona. una persona posee nombre, apellido, número de documento de identidad y año de nacimiento. La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
 * la clase debe incluir los siguientes métodos:
 * 1.- Definir un método que imprima en pantalla los valores de sus respectivos atributos del objeto.
 * 2.-En un método main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.
 Agregar dos nuevos atributos a la clase Persona. Un atributo que
represente el país de nacimiento de la persona (de tipo String) y

otro que identifique el género de la persona, el cual debe represen-
tarse como un char con valores 'H' o 'M'.

u Modificar el constructor de la clase Persona para que inicialice es-
tos dos nuevos atributos.

u Modificar el método imprimir de la clase Persona para que mues-
tre en pantalla los valores de los nuevos atributos.
 
 */

public class Persona {
    private String nombre;
    private String apellido;
    private String documentoIdentidad;
    private int añoNacimiento;
    private String pais;
    private char genero;


    
    public Persona(String nombre, String apellido, String documentoIdentidad, int añoNacimiento, String pais, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.pais = pais;
        this.genero = genero;
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    
    public int getAñoNacimiento() {
        return añoNacimiento;
    }
    
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    

    public String render() {
        String Out = String.format("Nombre: %s, Apellido: %s, documentoIdentidad: %s, añoNacimiento: %d, pais:%s, genero %c");
        return (Out);

    }

}
