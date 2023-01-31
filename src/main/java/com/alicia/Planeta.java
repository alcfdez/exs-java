package com.alicia;

/* Un planeta tiene los siguientes atributos:
- Un nombre de tipo Sring con valor inicial de null.
- Cantidad de satélites de tipo int con valor inicial de cero.
- Masa en kilogramos de tipo double con valor inicial de cero.
- Volumen en kilómetros cúbicos de tipo double con valor inicial de
cero.
- Diámetro en kilómetros de tipo int con valor inicial de cero.
- Distancia media al Sol en millones de kilómetros, de tipo int con
valor inicial de cero.
- Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con
los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
-Observable a simple vista, de tipo booleano con valor inicial false.

La clase debe incluir los siguientes métodos:
- La clase debe tener un constructor que inicialice los valores de sus
respectivos atributos.
- Definir un método que imprima en pantalla los valores de los atri-
butos de un planeta.
- Calcular la densidad un planeta, como el cociente entre su masa y
su volumen.
- Determinar si un planeta del sistema solar se considera exterior.
Un planeta exterior está situado más allá del cinturón de asteroi-
des. El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una
unidad astronómica (UA) es la distancia entre la Tierra y el Sol=
149 597 870 Km.
- En un método main se deben crear dos planetas y mostrar los va-
lores de sus atributos en pantalla. Además, se debe imprimir la
densidad de cada planeta y si el planeta es un planeta exterior del
sistema solar.
 */

public class Planeta {
    private String name = null;
    private int satelites = 0;
    private double masaKg = 0;
    private double volumenKmCub = 0;
    private int diametro = 0;
    private int distanciaSol = 0;
    private enum tipolaneta {
        GASEOSO, TERRESTRE, ENANO
    };
    private Boolean esObservable = false;

    public Planeta(String name, int satelites, double masaKg, double volumenKmCub, int diametro, int distanciaSol,
            Boolean esObservable) {
        this.name = name;
        this.satelites = satelites;
        this.masaKg = masaKg;
        this.volumenKmCub = volumenKmCub;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.esObservable = esObservable;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatelites() {
        return satelites;
    }
    
    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }
    
    public double getMasaKg() {
        return masaKg;
    }
    
    public void setMasaKg(double masaKg) {
        this.masaKg = masaKg;
    }
    
    public double getVolumenKmCub() {
        return volumenKmCub;
    }
    
    public void setVolumenKmCub(double volumenKmCub) {
        this.volumenKmCub = volumenKmCub;
    }
    
    public int getDiametro() {
        return diametro;
    }
    
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }
    
    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }
    
    public Boolean getEsObservable() {
        return esObservable;
    }
    
    public void setEsObservable(Boolean esObservable) {
        this.esObservable = esObservable;
    }
    
    public void imprimir () {
        System.out.println("Nombre del planeta = " + name
        );
        System.out.println("Cantidad de satelites = " + satelites
        );
        System.out.println("Masa del planeta = " + masaKg
        );
        System.out.println("Volumen del planeta = " + volumenKmCub
        );
        System.out.println("Diametro del planeta = " + diametro
        );
        System.out.println("Distancia al Sol = " + distanciaSol
        );
        System.out.println("Tipo de planeta = " + tipoPlaneta
        );
        System.out.println("Es observable = " + esObservable
        );
    }

    public double calcularDensidad (double masaKg, double volumenKmCub) {
        return masaKg/volumenKmCub;
        
    }

    public Boolean esPlanetaExterior() {
        float limiteCinturonAsteroides = (float) (149597870 * 3.4);
        if (distanciaSol >limiteCinturonAsteroides){
            return true;
        }else {
            return false;
        }
        
    }

}