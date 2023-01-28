package com.alicia;


/*Se requiere un programa que modele el concepto de una persona. una persona posee nombre, apellido, número de documento de identidad y año de nacimiento. La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
 * la clase debe incluir los siguientes métodos:
 * 1.- Definir un método que imprima en pantalla los valores de sus respectivos atributos del objeto.
 * 2.-En un método main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.
 */



public  class Persona {
    private  String nombre;
    private  String apellido;
    private String documentoIdentidad;
    private int añoNacimiento;

    


    public Persona(String nombre, String apellido, String documentoIdentidad, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.añoNacimiento = añoNacimiento;
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


    public static void main(String nombre, String apellido, String documentoIdentidad,int añoNacimiento) {
        System.out.println("persona es " + nombre + apellido + documentoIdentidad + añoNacimiento);

    }


public static void main  (String [] args){
     Person alicia = new Person (name:"Alicia", Surname: "Fernández", dni : "53558347h", bornYear: 1986)

     render.alicia ();

}

    public void render() {
        String Out = String.format (format: "Name: %s, Surname: %s, DNi: %s, Born year: %d" , name, 
        System.out.println (Out)
        
    }

    
}



