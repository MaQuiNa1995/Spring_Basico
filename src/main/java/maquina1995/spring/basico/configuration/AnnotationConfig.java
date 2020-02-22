package maquina1995.spring.basico.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * Clase usada para cargar la configuracion por javaconfig de spring
 * <p>
 * 
 * @Configuration - Marcar esta clase como una de configuracion de spring
 *                <p>
 * @ComponentScan(basePackages = "ruta del paquete") - donde buscar los beans
 *                             que queremos meter al contenedor de spring
 * 
 * @author MaQuiNa1995
 *
 */
@Configuration
@ComponentScan(basePackages = "maquina1995.spring.basico.dominio")
public class AnnotationConfig {

    // Como usamos anotaciones solo tenemos que usar el @ComponentScan(basePackages
    // = "maquina1995.spring.basico.dominio") explicado arriba para decirle a spring
    // donde tiene que buscar

}
