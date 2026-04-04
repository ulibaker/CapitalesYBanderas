package com.mycompany.capitalesybanderas;
import java.util.Random;
/**
 *
 * @author uli
 */
public class Generador<T> {
    private final T[] conjunto;
    private final Random rand = new Random();
    private int ultimoIndice = -1;
    
    public Generador(T[] conjunto) {
        this.conjunto = conjunto;
        if (conjunto.length == 0) {
            throw new IllegalArgumentException("Can't be void");
        }
    }
    
    public T obtenerAleatorio() {
        if (conjunto.length == 1) {
            return conjunto[0];
        }
        
        int i;
        do {
            i = rand.nextInt(conjunto.length);
        } while (i == ultimoIndice);

        ultimoIndice = i;
        return conjunto[i];
    }
}
