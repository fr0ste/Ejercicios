package exception;

import javax.swing.JOptionPane;

public class Correcaminos extends Animal {
    
    private int patas;
    private final int VELOCIDADMAX = 25;

    public Correcaminos(int patas, String codigo, String nombre, double velocidad) {
        super(codigo, nombre, velocidad);
        this.patas = patas;
    }

    public Correcaminos(int patas) {
        this.patas = patas;
    }

   
    @Override
    public String sonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.getNombre() + " va a una velocidad de:" + super.getVelocidad() + " km/h ";
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
    
    
}
