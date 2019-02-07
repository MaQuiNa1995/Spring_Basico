package es.cic.christian.ejemplospring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author MaQuina1995
 * 
 * @version 
 *
 * Clase de datos que almacena una interfaz
 *
 * Lo unico que hace es el objeto(bean) que le pases (que tiene que implementar)
 * si o si la InterfaceHablar ejecuta el método .hablar() (al tener implementado
 * la interfaz siempre tendrá este método)
 *
 */
public class GuerreroHabla {

    /**
     * 
     * Atributo con nombre guerrero de la clase InterfazHablar
     * 
     */
	@Autowired
    private InterfaceHablar guerrero;

    /**
     *
     * Constructor genérico
     *
     */
    public GuerreroHabla() {
        super();
    }

    /**
     * 
     * Método que ejecuta el método .hablar() del objeto que se le haya
     * inyectado a la clase a traves del xml
     * 
     */
    public void hablaGuerrero() {
        guerrero.hablar();
    }

    /**
     * 
     * Getter genérico del Atributo
     * 
     * @return guerrero retorna el objeto inyectado que implementa la interfaz
     * 
     */
    public InterfaceHablar getGuerrero() {
        return guerrero;
    }

    /**
     * 
     * Setter genérico del Atributo
     * 
     * @param guerrero objeto a inyectar que implementa la interfaz
     * 
     */
    public void setGuerrero(InterfaceHablar guerrero) {
        this.guerrero = guerrero;
    }

}
