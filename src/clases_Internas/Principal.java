/*

Autor: Joel && Elio
fecha de creación: 10/10/2022
fecha de modificación: 301/10/2022
Descripción: Instancia de clases internas de miembros de clases e 
             internas locales.

*/
package clases_Internas;

public class Principal {
    public static void main(String[] args) {
        
        
        //ejemplo de creación de una clase interna miembro de otra clase.
        System.out.println("EJEMPLO 1\n");
        ClaseExterna claseExterna = new ClaseExterna();//Clase Externa.
        ClaseExterna.claseInterna claseInterna = claseExterna.new claseInterna();//Se inicializa a travez de un objeto de la clase externa
        claseInterna.metodoInterno(); //uso del método de la clase interna.
        
        //clase que contiene un metodo que a su vez contiene una clase
        //se denomina: clase interna local
        System.out.println("\n\nEJEMPLO \n");
        ClaseLocal claseLocal = new ClaseLocal();
        claseLocal.metodoEjemplo();
        
        
        
    }
}
