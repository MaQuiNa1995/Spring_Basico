package maquina1995.spring.basico.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import maquina1995.spring.basico.dominio.Espadachin;
import maquina1995.spring.basico.dominio.Mago;

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
public class JavaConfig {

    /**
     * No poner nada y poner: @Scope("singleton") es lo mismo
     * <p>
     * En este caso se comporta de manera de que cada vez que llames a Spring para
     * devolver este bean te devolverá la referencia al mismo de tal manera que si
     * le actualizas en una clase en el que le uses de otra tambien se actualizará
     * 
     * @return {@link Espadachin}
     */
    @Scope("singleton")
    @Bean("espadachin")
    public Espadachin crearEspadachin() {
	Espadachin espadachin = new Espadachin();
	// Seteamos un valor por defecto con fines didácticos
	espadachin.setArma("Espadas Dobles");
	return espadachin;
    }

    /**
     * En este caso se comporta de manera de que cada vez que llames a Spring para
     * devolver este bean te devolverá un objeto distinto cada vez
     * 
     * @return {@link Espadachin}
     */
    @Scope("prototype")
    @Bean("mago")
    public Mago crearMago() {
	Mago mago = new Mago();
	return mago;
    }

}
