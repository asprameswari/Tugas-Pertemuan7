package bangunDatar;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class PersegiPanjang extends BangunDatar {
	double p;
	double l;
	
	public void setLingkaran(double panjang, double lebar) {
		this.p = panjang;
		this.l = lebar;
	}
	
	public double luasPersegiPanjang() {
		double luas;
		luas = this.p*this.l;
		return luas;
	}
	
	public double kelilingLingkaran() {
		double keliling;
		keliling = 2*(this.p*this.l);
		return keliling;
	}
	
	

}
