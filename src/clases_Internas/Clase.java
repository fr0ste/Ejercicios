/*

Autor: Joel && Elio
Fecha de creación: 10/10/2022
Fecha de modificación: 30/10/2022
Descripción: ejemplo de clase para su implementación posterior
             como clase anonima.

*/
package clases_Internas;

public class Clase {
    public String mensaje = "soy un de la clase interna";
    private String mensajePrivado = "soy un mensaje privado de la clase interna";
    public void metodo(){
        System.out.println(this.mensajePrivado);
    }
}
