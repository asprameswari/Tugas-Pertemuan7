package bangunRuang;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Bola extends BangunRuang {
	double j;
	
	public void setBola(double jari) {
		this.j = jari;
	}
	
	public double luasBola() {
		double luas;
		luas = 4*3.14*this.j*this.j;
		return luas;
	}
	
	public double volumeBola() {
		double volume;
		volume = 4/3*(3.14*this.j*this.j*this.j);
		return volume;
	}
	
	

}
