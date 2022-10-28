package exception;


public class Principal {
     
    public static void main(String[] args) throws LimiteVelocidadException {
        
        Caballo caballo = new Caballo(0, "1", "El cantador", 10);
        Carga cargaCaballo = new Carga(0);
        
            caballo.setCarga(cargaCaballo);
            caballo.acelerar(60);
            
            System.out.println(caballo.toString());  
        
        
       
    }
            
}
