package bangunRuang;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Kerucut extends BangunRuang {
	double r;
	double t2;
	double ss;
	
	public void setKerucut(double radius, double sisi, double tinggi) {
		this.r = radius;
		this.ss = sisi;
		this.t2 = tinggi;
	}
	
	public double luasKerucut() {
		double luas;
		luas = (3.14*this.r*this.r)+(3.14*this.r*this.ss);
		return luas;
	}
	
	public double volumeKerucut() {
		double volume;
		volume = 1/3*3.14*this.r*this.r*this.t2;
		return volume;
	}
	
	public double luasSelimutKerucut() {
		double luasSelimut;
		luasSelimut = 3.14*this.r*this.ss;
		return luasSelimut;
	}
	

}
