package maquina1995.spring.basico.main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import maquina1995.spring.basico.configuration.AnnotationConfig;
import maquina1995.spring.basico.dominio.Proto;
import maquina1995.spring.basico.dominio.Terran;

/**
 * main que explica el uso de beans por javaconfig
 * 
 * @author MaQuiNa1995
 *
 */
public class MainAnnotationConfig {

    private static final Logger LOGGER = Logger.getLogger(MainAnnotationConfig.class.getName());

    public static void main(String[] args) {

	LOGGER.info("Inicia la aplicación");

	// Try con recursos para cerrar automaticamente al final del try el contexto
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		AnnotationConfig.class)) {

	    String nombreBeanProto = "proto";

	    // Singleton
	    LOGGER.info("----- Singleton -----");
	    Proto protoSingleton = context.getBean(nombreBeanProto, Proto.class);
	    Proto protoSingleton2 = context.getBean(nombreBeanProto, Proto.class);

	    protoSingleton.setArma("ArmaCambiada");
	    protoSingleton2.setDanno(999999);

	    LOGGER.info("\nProto Singleton: " + protoSingleton + "\nProto Singleton 2: " + protoSingleton2 + "\n");

	    String nombreBeanTerran = "terran";

	    // Proyotype
	    LOGGER.info("----- Prototype -----");
	    Terran terranPrototype = context.getBean(nombreBeanTerran, Terran.class);
	    Terran terranPrototype2 = context.getBean(nombreBeanTerran, Terran.class);

	    terranPrototype.setArma("ArmaCambiada");
	    terranPrototype.setDanno(999999);

	    LOGGER.info("\nTerran Singleton: " + terranPrototype + "\nTerran Singleton 2: " + terranPrototype2 + "\n");

	}
	LOGGER.info("Termina la aplicacion");

    }

}
