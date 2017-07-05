package es.cic.christian.ejemplospring;


/**
 *
 * @author cmunoz
 * @link InterfaceHablar
 *
 * Clase genérica de datos
 *
 * Implementa la interfaz InterfaceHablar
 *
 */
public class Terran implements InterfaceHablar {

    /**
     *
     * Buena practica: separar las string en una variable por si la vas a usar
     * mas de una vez no estar escribiendolas
     *
     * final: Modificador de variables que hace que no se pueda modificar la
     * variable FRASE en ningún caso (hacerla Constante)
     *
     * Buena practica: Variables constantes se denominan en Mayúsculas
     *
     */
    private final String FRASE = "Listo Para Darme El Piro";

    /**
     * 
     * Constructor genérico de clase
     * 
     */
    public Terran() {
        super();
    }

    
    /**
     * 
     * Método de la interfaz que muestra por consola el valor de la variable FRASE 
     * 
     */
    @Override
    public void hablar() {
        System.out.println(FRASE);
    }

}
