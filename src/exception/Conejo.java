/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

import javax.swing.JOptionPane;

/**
 *
 * @author labingsw05
 */
public class Conejo extends Animal{
    
    private int patas;
    private final int VELOCIDADMAX = 30;

    public Conejo(int patas, String codigo, String nombre, double velocidad) {
        super(codigo, nombre, velocidad);
        this.patas = patas;
    }

    public Conejo(int patas) {
        this.patas = patas;
    }
    
    @Override
    public String sonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void acelerar(double acelera) throws LimiteVelocidadException {
        try{
        if((super.getVelocidad() + acelera) > this.VELOCIDADMAX){
            throw new LimiteVelocidadException("Excediendo de límite");            
        }{
            super.setVelocidad(super.getVelocidad()+acelera);
        }
        } catch (LimiteVelocidadException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    

    @Override
    public String toString() {
        return super.getNombre() + " va a una velocidad de:" + super.getVelocidad() + " km/h ";
    }

    
    
    
    
    
    
}
