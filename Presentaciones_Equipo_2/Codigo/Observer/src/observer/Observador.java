package observer;

import java.util.Observable;
import java.util.Observer;


public class Observador implements Observer{
    
    
    //Esta clase solo se encarga de observar y recibir las notificaciones del objeto observado.
    @Override
    public void update(Observable o, Object arg){
        System.out.println("Actualizacion: "+ o.toString()+arg.toString()+"\n");
    }
}
