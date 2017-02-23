package observer;

import java.util.Observable;

/**
 *
 * @author Cristian
 */
public class Observado extends Observable{
    //Esta clase representa a un objeto que puede ser observado por varios observadores.
    String mensaje;
    
    public Observado(){
        mensaje = "Obervando al objeto";
    }
    
    public void mensaje(String m){
        mensaje  = m;
        
        //REalizamos un cambio al objeto observado
        setChanged();
        
        
        notifyObservers(mensaje);
        //EL metodo avisa que hubo cambio al observador en su propuedad mensaje y lo notifica.
    }
}
