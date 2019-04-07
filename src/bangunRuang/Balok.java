package bangunRuang;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Balok extends BangunRuang {
	double p;
	double l;
	double t;
	
	public void setBalok(double panjang, double lebar, double tinggi) {
		this.p = panjang;
		this.l = lebar;
		this.t = tinggi;
	}
	
	public double luasBalok() {
		double luas;
		luas = 2*(this.p*this.l)+(this.p*this.t)+(this.l*this.t);
		return luas;
	}
	
	public double volumeBalok() {
		double volume;
		volume = this.p*this.l*this.t;
		return volume;
	}
	
	

}
