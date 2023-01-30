package com.alicia;

public class App {

    public static void main  (String [] args){
        Persona alicia = new Persona ("Alicia", "Fernández", "53558347h", 1986, "España", 'M');
        Persona catalina = new Persona ("Catalina", "García", "53558348L", 2019, "España", 'M');
   
        System.out.println(alicia.render()); 
        System.out.println(catalina.render()); 
   
   }
    
}
