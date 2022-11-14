/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_genericas.lista;

/**
 *
 * @author froste
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazada<Double> listaDouble = new ListaEnlazada<>();
        listaDouble.insertarPrimero(1.55);
        ListaEnlazada<Integer> listaInt = new ListaEnlazada<>();
        listaInt.insertarPrimero(1);
        
       listaDouble.mostrar();
       listaInt.mostrar();
        
    }
}
