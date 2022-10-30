/*

autor: Joel && Elio
fecha de creación: 10/10/2022
fecha de modificación: 30/10/2022
Descripción: ejemplo de implementación de la clase anónima.

*/
package clases_Internas;

public class ClaseAnonima {

    
    public static void main(String args[]) {
        
        //A la vez que se implenta la clase, se realiza la instancia.
        Clase inner = new Clase(){
            @Override
            public void metodo() {
                System.out.println("Ejemplo de clase anónima");
                System.out.println("accediendo a los elementos"
                        + this.mensaje);
            }
        };
        
        inner.metodo();
        
        
        
    }
}


