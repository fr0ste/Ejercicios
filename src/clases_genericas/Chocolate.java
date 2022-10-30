/*
 * Fecha de creación: 10 de octubre de 2022
 * Fecha de actualización: 30 de octubre de 2022
 * Autor:
 * Descripción: Clase Chocolate, con atributos de nombre y color 
 */
package clases_genericas;

public class Chocolate {
	private String nombre;
	private String color;
	public Chocolate() {
		
	}
	
	public Chocolate(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
