/*

autor: Joel && Elio
fecha de creación: 10/10/2022
fecha de modificación: 30/10/2022
Descripción: ejemplo de clase interna.

 */
package clases_Internas;

public class ClaseExterna {

    private String hola = "Hola mundo, saludos desde la clase externa";

    /*a diferencia de la clase externa en una clase interna se puede usar 
    el modificador de accer private*/
    //private class claseInterna{
    public class claseInterna {

        private String adios = "Adios mundo, saludos desde la clase interna";

        public void metodoInterno() {

            System.out.println("Esto es un método de la clase interna donde\n "
                    + "se puede acceder a todas las variables de la clase externa\n"
                    + "ejemplo: " + hola
                    + "\ntambien se puede acceder a los mienbos de la clase interna"
                    + "\nejemplo: " + adios);

        }
    }
}
