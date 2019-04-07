package bangunDatar;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class BangunDatar {

	public BangunDatar() {
		
	}

	public static void main(String[] args) {
//		Scanner scan = new Scanner(null);
//		int choose;
		int choose = Integer.parseInt(JOptionPane.showInputDialog("Menu: 1. Lingkaran" + "2. Persegi" + "3. Persegi Panjang" + "4. Segitiga"));
		
		
//		do {
//			do {
//				System.out.println("1. Lingkaran");
//				System.out.println("2. Persegi");
//				System.out.println("3. Persegi Panjang");
//				System.out.println("4. Segitiga");
//				choose = scan.nextInt(); scan.nextLine();
//			}while(choose < 1 || choose > 4);
			
			switch(choose) {
			case 1:
				double j;
				String nilaij = JOptionPane.showInputDialog("Masukkan nilai jari-jari: ");
				j = Double.parseDouble(nilaij);
				
				Lingkaran L = new Lingkaran();
				L.setLingkaran(j);
				
				JOptionPane.showInputDialog(null, "Luas Lingkaran adalah " + L.luasLingkaran());
				JOptionPane.showInputDialog(null, "Keliling Lingakaran adalah " + L.kelilingLingkaran());
				break;
				
			case 2:
				double s;
				String nilais = JOptionPane.showInputDialog("Masukkan nilai sisi persegi: ");
				s = Double.parseDouble(nilais);
				
				Persegi P = new Persegi();
				P.setPersegi(s);
				
				JOptionPane.showInputDialog(null, "Luas Persegi adalah " + P.luasPersegi());
				JOptionPane.showInputDialog(null, "Keliling Persegi adalah " + P.kelilingPersegi());
				break;
				
			case 3:
				double p, l;
				String nilaip = JOptionPane.showInputDialog("Masukkan nilai panjang persegi panjang: ");
				p = Double.parseDouble(nilaip);
				String nilail = JOptionPane.showInputDialog("Masukkan nilai lebar persegi panjang: ");
				l = Double.parseDouble(nilail);
				
				PersegiPanjang PP = new PersegiPanjang();
				PP.setPersegiPanjang(p, l);
				
				JOptionPane.showInputDialog(null, "Luas PersegiPanjang adalah " + PP.luasPersegiPanjang());
				JOptionPane.showInputDialog(null, "Keliling PersegiPanjang adalah " + PP.kelilingPersegiPanjang());
				break;
				
			case 4:
				double a, t, s1, s2, s3;
				String nilaia = JOptionPane.showInputDialog("Masukkan nilai alas segitiga: ");
				a = Double.parseDouble(nilaia);
				String nilait = JOptionPane.showInputDialog("Masukkan nilai tinggi segitiga: ");
				t = Double.parseDouble(nilait);
				String nilais1 = JOptionPane.showInputDialog("Masukkan nilai sisi 1 segitiga: ");
				s1 = Double.parseDouble(nilais1);
				String nilais2 = JOptionPane.showInputDialog("Masukkan nilai sisi2 segitiga: ");
				s2 = Double.parseDouble(nilais2);
				String nilais3 = JOptionPane.showInputDialog("Masukkan nilai sisi 3 segitiga: ");
				s3 = Double.parseDouble(nilais3);
				
				Segitiga S = new Segitiga();
				S.setSegitiga(a, t, s1, s2, s3);
				
				JOptionPane.showInputDialog(null, "Luas Segitiga adalah " + S.luasSegitiga());
				JOptionPane.showInputDialog(null, "Keliling Segitiga adalah " + S.kelilingSegitiga());
				break;
//			}
//		}while(choose != 5);

	}

}
