package maquina1995.spring.basico.dominio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("terran")
@Scope("prototype")
public class Terran {

    // Como podeis ver se están seteando valores por defecto a arma y daño para que
    // veais como se comporta spring

    private String arma = "Metralleta";
    private int danno = 100;

    public int getDanno() {
	return danno;
    }

    public void setDanno(int danno) {
	this.danno = danno;
    }

    public String getArma() {
	return arma;
    }

    public void setArma(String arma) {
	this.arma = arma;
    }

    @Override
    public String toString() {
	return "Arma del Terran: " + arma + " con daño: " + danno;
    }

}
