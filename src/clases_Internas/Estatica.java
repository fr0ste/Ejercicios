/*

Autor: Joel && Elio
Fecha de creación: 10/10/2022
Fecha de modificación: 11/10/2022
Descripción: ejemplo de clase anidada estática.

*/
package clases_Internas;

public class Estatica {
    
    public int numero;
    public static int numero2;
    
    static class ClaseAnidada {
        public void metodo() {
            int numero3 = 25;
            
            System.out.println("*********CLASE ANIDADA ESTÁTICA (STATIC)********");
            
            System.out.println("Clase anidada que puede acceder solo a "
                    + "los elementos estáticos de su clase exterior ejemplo: numero = " + 
                    numero2);
            
            System.out.println("\n******************");
            
            System.out.println("tambien accede a sus propios elementos ejemplo"
                    + "numero = " + numero3 );
        }
        
    }


    public static void main(String args[]) {
        
        //se puede instanciar sin antes haber instanciado a su clase exterior
        Estatica.ClaseAnidada m = new Estatica.ClaseAnidada();
        m.metodo();
        
    }
}
