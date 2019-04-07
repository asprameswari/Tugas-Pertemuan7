package bangunDatar;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Segitiga extends BangunDatar {
	double a;
	double t;
	double s1;
	double s2;
	double s3;
	
	public void setSegitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
		this.a = alas;
		this.t = tinggi;
		this.s1 = sisi1;
		this.s2 = sisi2;
		this.s3 = sisi3;
	}
	
	public double luasSegituga() {
		double luas;
		luas = (this.a*this.t)/2;
		return luas;
	}
	
	public double kelilingLingkaran() {
		double keliling;
		keliling = (this.s1 + this.s2 + this.s3);
		return keliling;
	}
	
	

}
