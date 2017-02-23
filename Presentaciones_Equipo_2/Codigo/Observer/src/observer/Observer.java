package observer;

/**
 *
 * @author Cristian
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se instanciaron un objeto observador y un observable.
        Observado observado = new Observado();
        Observador observador = new Observador();
        
        //Se agrega al observador.
        observado.addObserver(observador);
        
        observado.mensaje("hola");
        observado.mensaje("cambio de mensaje");
        observado.mensaje("mensaje nuevo");
    }
    
}
