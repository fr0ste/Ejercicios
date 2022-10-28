/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author labingsw05
 */
public class Conejo extends Animal{
    
    private int patas;
    
    @Override
    public String sonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setVelocidad(double velocidad) {
                
        
        if (velocidad > 30) {
            
            System.out.println("peligro");
            
        } else {
            super.setVelocidad(velocidad);
        }
        
    }


    

    @Override
    public String toString() {
        return "Conejo{" + "patas=" + patas + '}';
    }

    
    
    
    
    
    
}
