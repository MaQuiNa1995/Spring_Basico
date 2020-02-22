package maquina1995.spring.basico.main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import maquina1995.spring.basico.configuration.AnnotationConfig;
import maquina1995.spring.basico.dominio.Proto;
import maquina1995.spring.basico.dominio.Terran;

/**
 * main que explica el uso de beans por anotaciones
 * 
 * @author MaQuiNa1995
 *
 */
public class MainAnnotationConfig {

    /**
     * Logger genérico de la clase
     */
    private static final Logger LOGGER = Logger.getLogger(MainAnnotationConfig.class.getName());

    public static void main(String[] args) {

	LOGGER.info("Inicia la aplicación");

	// Try con recursos para cerrar automaticamente al final del try el contexto
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		AnnotationConfig.class)) {

	    String nombreBeanProto = "proto";

	    // ------------------------ Singleton ------------------------
	    LOGGER.info("----- Singleton -----");

	    // Recordemos que se han dado valores por defecto a la clase {@link Proto}
	    // al recorgerlo del contenedor de spring vendrán con esos campos seteados
	    Proto protoSingleton = context.getBean(nombreBeanProto, Proto.class);
	    Proto protoSingleton2 = context.getBean(nombreBeanProto, Proto.class);

	    // Como se puede ver se le setea tanto al bean 1 como al 2 uno de sus atributos
	    protoSingleton.setArma("ArmaCambiada");
	    protoSingleton2.setDanno(999999);

	    // Ahora vemos que pasa
	    LOGGER.info("\nProto Singleton: " + protoSingleton + "\nProto Singleton 2: " + protoSingleton2 + "\n");

	    String nombreBeanTerran = "terran";

	    // ------------------------ Prototype ------------------------
	    LOGGER.info("----- Prototype -----");

	    // Recordemos que se han dado valores por defecto a la clase {@link Terran}
	    Terran terranPrototype = context.getBean(nombreBeanTerran, Terran.class);
	    Terran terranPrototype2 = context.getBean(nombreBeanTerran, Terran.class);

	    // Como se puede ver se le setea al bean 1 sus atributos pero en este caso no
	    // tienen el mismo valor los 2
	    terranPrototype.setArma("ArmaCambiada");
	    terranPrototype.setDanno(999999);

	    // Lo vemos aqui
	    LOGGER.info("\nTerran Singleton: " + terranPrototype + "\nTerran Singleton 2: " + terranPrototype2 + "\n");

	}
	LOGGER.info("Termina la aplicación");

    }

}
