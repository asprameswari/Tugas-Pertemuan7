package bangunDatar;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lingkaran extends BangunDatar {
	double j;
	
	public void setLingkaran(double jari) {
		this.j = jari;
	}
	
	public double luasLingkaran() {
		double luas;
		luas = 3.14*this.j*this.j;
		return luas;
	}
	
	public double kelilingLingkaran() {
		double keliling;
		keliling = 2*3.14*this.j;
		return keliling;
	}
	
	

}
