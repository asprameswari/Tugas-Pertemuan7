package bangunDatar;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Persegi extends BangunDatar {
	double s;
	
	public void setPersegi(double sisi) {
		this.s = sisi;
	}
	
	public double luasPersegi() {
		double luas;
		luas = this.s*this.s;
		return luas;
	}
	
	public double kelilingPersegi() {
		double keliling;
		keliling = 4*this.s;
		return keliling;
	}
	
	

}
