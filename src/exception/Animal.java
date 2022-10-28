package exception;

public abstract class Animal {

    private String nombre;
    private double velocidad;
    private String codigo;

    public Animal(String codigo, String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.codigo = codigo;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Animal() {
    }
    
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", velocidad=" + velocidad + ", codigo=" + codigo + '}';
    }
    
        
    public void acelerar(double acelera) throws LimiteVelocidadException{
        
        this.setVelocidad(this.velocidad + acelera);
        
    }
    
    
    public abstract String sonido();
   
    
}
