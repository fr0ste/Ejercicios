/*
 * Fecha de creación: 10 de octubre de 2022
 * Fecha de actualización: 30 de octubre de 2022
 * Autor
 * Descripción: Clase principal de implementación 
 */
package clases_genericas;

public class Principal {
	//Declaración de objetos pasando diferentes variables.
	private static Bolsa<Soda> bolsaDeSodas;
	private static Bolsa<Chocolate> bolsaDeChocolates;
	private static Bolsa<Integer> bolsaDeMonedas;

	public static void main(String[] args) {
            
		//instanciamiento de la clase bolsa especificando el tipo de dato a manejar
		bolsaDeSodas = new Bolsa<Soda>();
		bolsaDeChocolates = new Bolsa<Chocolate>();
		bolsaDeMonedas = new Bolsa<Integer>();
		
		//Inserción de datos 
		bolsaDeSodas.add(new Soda("Soda_1", "Limon"));
		bolsaDeSodas.add(new Soda("Soda_2", "Fresa"));
                
		//Impresión de datos utilizando un for each
		for (Soda soda : bolsaDeSodas.getProducts()) {
            System.out.println(soda.getNombre() + " " + soda.getSabor());
        }
                
                
		//Inserción de datos para la bolsa de chocolate
		bolsaDeChocolates.add(new Chocolate("Chocolate_1", "Negro"));
		bolsaDeChocolates.add(new Chocolate("Chocolate_2", "Blanco"));
		//Impresión de datos
		for (Chocolate chocolate : bolsaDeChocolates.getProducts()) {
            System.out.println(chocolate.getNombre() + " " + chocolate.getColor());
        }
		
		//Inserción de datos en bolsa de monedas
		bolsaDeMonedas.add(1);
		bolsaDeMonedas.add(2);
		//Impresión de datos
		for (int i = 0; i < bolsaDeMonedas.getProducts().size(); i++) {
            System.out.println(bolsaDeMonedas.getProducts().get(i));
        }

	}
	/*
	 * De las clases genéricas más utilizadas de java se encuentran las collecciones
	 * como ArrayList, HashSet, HashMap, LinkedList.
	 */
}
