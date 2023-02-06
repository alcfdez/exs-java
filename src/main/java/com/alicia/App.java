package com.alicia;

public class App {

    public static void main  (String [] args){
        Persona alicia = new Persona ("Alicia", "Fernández", "53558347h", 1986, "España", 'M');
        Persona catalina = new Persona ("Catalina", "García", "53558348L", 2019, "España", 'M');
   
        System.out.println(alicia.render()); 
        System.out.println(catalina.render()); 
   
   }
    
     public static void main2 (String[] args) {
        Planeta tierra = new Planeta("Tierra", 3, 200000, 400000, 500000, 1000000, true);
        Planeta marte = new Planeta(
            "marte", 4, 15000, 25000, 30000, 800000, true);

        // System.out.println(tierra.render());
        // System.out.println(marte.render());
        
    }
        
    
}
