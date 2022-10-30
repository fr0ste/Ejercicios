/*

Autor: Joel && Elio
fecha de creación: 10/10/2022
fecha de modificación: 11/10/2022
Descripción: ejemplo de clase local.

*/
package clases_Internas;

public class ClaseLocal {
    
    //metodo de la clase externa
    public void metodoEjemplo() {
        System.out.println("Esto es un método de la clase externa");

        /*Clase contenido dentro de un método
        * su ambito será solo dentro del método
        */
        class claseLocal {
            private String ejemplo;

            public void metodoLocal() {
                System.out.println("Esto es un método de la clase Local");
            }
        }
        claseLocal claseLocal = new claseLocal();
        claseLocal.metodoLocal();
    }
}
