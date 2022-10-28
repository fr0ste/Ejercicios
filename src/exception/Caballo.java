package exception;

public class Caballo extends Animal{
    
    private int patas;
    private Carga carga;
    private final double umbral= 60.0;
    private final double umbralCarga = 90.0;

    public Caballo() {
    }

    public Caballo(int patas, String codigo, String nombre, double velocidad) {
        super(codigo, nombre, velocidad);
        this.patas = patas;
        this.carga = null;
    }

    
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    @Override
    public void acelerar(double acelera) throws LimiteVelocidadException {
        
        
        try {
            if(carga != null && (super.getVelocidad() + acelera) > this.umbralCarga){
            throw new LimiteVelocidadException("Excediendo de límite");
        }else if((super.getVelocidad() + acelera) > this.umbral){
            throw new LimiteVelocidadException("Excediendo de límite");            
        }{
            super.setVelocidad(super.getVelocidad()+acelera);
        }
        } catch (LimiteVelocidadException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
    }
    
    public void quitarCarga(){
        this.carga = null;
    }
    
    @Override
    public String sonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        if(this.carga!=null){
        return super.getNombre() + " va a una velocidad de:" + super.getVelocidad() + " km/h " + this.getCarga().toString();
        }else{
            return super.getNombre() + " va a una velocidad de: " + super.getVelocidad() + " km/h";
            
        }
    }
   
        
}
