/*
 * Fecha de creación: 10 de octubre de 2022
 * Fecha de actualización: 30 de octubre de 2022
 * Autor
 * Descripción: Clase Soda, con atributos de nombre y sabor 
 */
package clases_genericas;

public class Soda {
	private String nombre;
	private String sabor;
	public Soda() {
		
	}

	public Soda(String nombre, String sabor) {
		super();
		this.nombre = nombre;
		this.sabor = sabor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}
