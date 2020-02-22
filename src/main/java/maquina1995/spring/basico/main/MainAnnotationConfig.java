package maquina1995.spring.basico.main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import maquina1995.spring.basico.configuration.AnnotationConfig;
import maquina1995.spring.basico.dominio.Proto;
import maquina1995.spring.basico.dominio.Terran;

/**
 * Main que explica el uso de beans por anotaciones
 * <p>
 * Para coger 1 bean del contexto del contenedor de spring desde una clase
 * estática
 * <p>
 * NUNCA podrás usar el @Autowired o @Resource deberás instancia el contexto y
 * obtener a traves de los distintos métodos disponibles:
 * <p>
 * 
 * 
 * <li>Equivalente a @Resource
 * {@link AnnotationConfigApplicationContext#getBean(String,Class)}</li>
 * <p>
 * <li>Equivalente a @Autowired
 * {@link AnnotationConfigApplicationContext#getBean(Class)}</li>
 * <p>
 * <li>O bien obtenerle por ID:
 * {@link AnnotationConfigApplicationContext#getBean(String)}</li>
 * <p>
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
	    Class<Proto> claseBeanProtos = Proto.class;

	    // ------------------------ Singleton ------------------------
	    LOGGER.info("----- Singleton -----");

	    // Recordemos que se han dado valores por defecto a la clase {@link Proto}
	    // al recorgerlo del contenedor de spring vendrán con esos campos seteados
	    Proto protoSingleton = context.getBean(nombreBeanProto, claseBeanProtos);
	    Proto protoSingleton2 = context.getBean(nombreBeanProto, claseBeanProtos);

	    // Como se puede ver se le setea tanto al bean 1 como al 2 uno de sus atributos
	    protoSingleton.setArma("ArmaCambiada");
	    protoSingleton2.setDanno(999999);

	    // Ahora vemos que pasa
	    LOGGER.info("\nProto Singleton: " + protoSingleton + "\nProto Singleton 2: " + protoSingleton2 + "\n");

	    String nombreBeanTerran = "terran";
	    Class<Terran> claseBeanTerran = Terran.class;

	    // ------------------------ Prototype ------------------------
	    LOGGER.info("----- Prototype -----");

	    // Recordemos que se han dado valores por defecto a la clase {@link Terran}
	    Terran terranPrototype = context.getBean(nombreBeanTerran, claseBeanTerran);
	    Terran terranPrototype2 = context.getBean(nombreBeanTerran, claseBeanTerran);

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
