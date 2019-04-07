package bangunRuang;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Kubus extends BangunRuang {
	double s;
	
	public void setKubus(double sisi) {
		this.s = sisi;
	}
	
	public double luasKubus() {
		double luas;
		luas = 6*(this.s*this.s);
		return luas;
	}
	
	public double volumeKubus() {
		double volume;
		volume = this.s*this.s*this.s;
		return volume;
	}
	
	

}
