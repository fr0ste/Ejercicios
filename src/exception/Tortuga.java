package exception;


public class Tortuga extends Animal{
    
    private int patas;
    
    
    @Override
    public String sonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Tortuga{" + "patas=" + patas + '}';
    }
    
    
    
}
