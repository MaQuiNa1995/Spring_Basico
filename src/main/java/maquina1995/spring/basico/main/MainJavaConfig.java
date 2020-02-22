package maquina1995.spring.basico.main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import maquina1995.spring.basico.configuration.JavaConfig;
import maquina1995.spring.basico.dominio.Espadachin;
import maquina1995.spring.basico.dominio.Mago;

/**
 * main que explica el uso de beans por javaconfig
 * 
 * @author MaQuiNa1995
 *
 */
public class MainJavaConfig {

    private static final Logger LOGGER = Logger.getLogger(MainJavaConfig.class.getName());

    public static void main(String[] args) {

	LOGGER.info("Inicia la aplicación");

	// Try con recursos para cerrar automaticamente al final del try el contexto
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class)) {

	    String nombreBeanEspadachin = "espadachin";

	    // Singleton
	    LOGGER.info("----- Singleton -----");
	    Espadachin espadachinSingleton = context.getBean(nombreBeanEspadachin, Espadachin.class);
	    Espadachin espadachinSingleton2 = context.getBean(nombreBeanEspadachin, Espadachin.class);

	    espadachinSingleton2.setArma("ArmaCambiada");
	    espadachinSingleton2.setDanno(999999);

	    LOGGER.info("\nEspadachin Singleton: " + espadachinSingleton + "\nEspadachin Singleton 2: "
		    + espadachinSingleton2 + "\n");

	    String nombreBeanMago = "mago";

	    // Proyotype
	    LOGGER.info("----- Prototype -----");
	    Mago magoPrototype = context.getBean(nombreBeanMago, Mago.class);
	    Mago magoPrototype2 = context.getBean(nombreBeanMago, Mago.class);

	    magoPrototype.setArma("ArmaCambiada");
	    magoPrototype.setDanno(999999);

	    LOGGER.info("\nMago Singleton: " + magoPrototype + "\nMago Singleton 2: " + magoPrototype2 + "\n");

	}
	LOGGER.info("Termina la aplicacion");

    }

}
