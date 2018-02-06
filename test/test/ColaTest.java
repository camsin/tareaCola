package test;

import app.Cola;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camendez
 */
public class ColaTest {
 
     @Test
     public void ColaTest() {
         //Declaramos la cola con 5 elementos
        Cola cola = new Cola(5);
        
        //Como acabamos de declarar la cola, estara vacia
        //Afirmacion de que la cola esta vacia
        assertTrue(cola.vacia());
        //Negacion de que la cola esta llena
        assertFalse(cola.llena());
        
        //Llenamos la cola con 4 elementos
        cola.encolar("A");
        cola.encolar("B");
        cola.encolar("C");
        cola.encolar("D");
        
        //Como tenemos 4 elementos, la cola no estara llena ni vacia
        List<String> cola1 = asList("A", "B", "C", "D");
        assertTrue(cola.equals(cola1));

        //Negacion de que la cola esta vacia
        assertFalse(cola.vacia());
        //Negacion de que la cola esta llena
        assertFalse(cola.llena());
        
        

        
        //Agregamos el quinto elemento
        cola.encolar("E");
        
        //La cola ahora tiene 5 elementos, esta llena
        List<String> cola2 = asList("A", "B", "C", "D", "E");
        assertTrue(cola.equals(cola2));
        
        //Afirmacion de que la cola esta llena
        assertTrue(cola.llena());
        //Negacion de que la cola esta vacia
        assertFalse(cola.vacia());
        
        //Quitamos un elemento de la cola
        cola.desencolar();
        
        //Comprobamos que la cola no esta llena (por que tiene 4 elementos ahora)
        //Negacion de que la cola esta llena
        assertFalse(cola.llena());
        //Negacion de que la cola esta vacia
        assertFalse(cola.vacia());
        
        //Ahora vamos a vaciar la cola (nos quedaban 4 elementos)
        for (int i = 0; i < 4; i++) {
            cola.desencolar();
        }
        
        //La cola ahora esta vacia
        //Afirmacion de que la cola esta vacia
        assertTrue(cola.vacia());
        //Negacion de que la cola esta llena
        assertFalse(cola.llena());

     }
}
