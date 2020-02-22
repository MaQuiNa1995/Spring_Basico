package maquina1995.spring.basico.dominio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("proto")
@Scope("singleton")
public class Proto {

    private String arma = "Cuchilla Energética";
    private int danno = 1000;

    public String getArma() {
	return arma;
    }

    public void setArma(String arma) {
	this.arma = arma;
    }

    public int getDanno() {
	return danno;
    }

    public void setDanno(int danno) {
	this.danno = danno;
    }

    @Override
    public String toString() {
	return "Arma del Proto: " + arma + " con daño: " + danno;
    }

}
