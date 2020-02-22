package maquina1995.spring.basico.dominio;

public class Mago {

    private String arma = "bastón";
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
	return "Arma del Mago: " + arma + " con daño: " + danno;
    }

}
