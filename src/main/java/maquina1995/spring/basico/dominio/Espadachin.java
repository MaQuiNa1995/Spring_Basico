package maquina1995.spring.basico.dominio;

/**
 * Clase que representa un espadachín
 * 
 * @author MaQuiNa1995
 *
 */
public class Espadachin {

    // Como podeis ver se están seteando valores por defecto a arma y daño para que
    // veais como se comporta spring

    private String arma = "Estoque";
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
	return "Arma del Espadachín: " + arma + " y con daño: " + danno;
    }

}
