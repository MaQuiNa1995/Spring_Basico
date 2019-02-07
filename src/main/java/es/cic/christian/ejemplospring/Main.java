package es.cic.christian.ejemplospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author cmunoz
 * @version 1.0
 * @link GuerreroHabla
 * @see http://www.oracle.com/technetwork/java/codeconvtoc-136057.html
 *  
 */
public class Main {

    /**
     * Método main que ejecuta la aplicación y muestra la frase de un guerrero
     * 
     * @param args array de parámetros que pueden pasarse al método
     * (No suelen usarse solo cuando son cosas muy específicas)
     */
    public static void main(String[] args) {

        /**
         * Definicion del AplicationContext 
         */
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
              "classpath:\\es\\cic\\christian\\ejemplospring\\spring-config.xml"
        );
        
        //GuerreroHabla guerreroHabla = new GuerreroHabla();
        //guerreroHabla.hablaGuerrero();
        
        /**
         * Recuperación del bean que definimos en el XML
         *      context.getBean("guerreroServices")
         * 
         * Parseado(Conversión) del objeto que nos devuelve de:
         *      Bean --> GuerreroHabla
         * 
         */
        GuerreroHabla guerreroHabla = (GuerreroHabla) context.getBean("guerreroServices");
        
        context.close();
        /**
         * 
         * 2 Líneas para localizar mejor la frase del guerrero 
         * 
         * Llamada al método hablaGuerrero()
         * 
         */
        
        System.out.println("_________________________________________________");
        guerreroHabla.hablaGuerrero();
        System.out.println("_________________________________________________");

    }

}
