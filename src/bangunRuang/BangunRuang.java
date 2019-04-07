package bangunDatar;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class BangunRuang {

	public BangunRuang() {
		
	}

	public static void main(String[] args) {
//		Scanner scan = new Scanner();
//		int choose;
		int choose = Integer.parseInt(JOptionPane.showInputDialog("Menu: 1. Bola" + "2. Kubus" + "3. Balok" + "4. Kerucut"));
		
//		do {
//			do {
//				System.out.println("1. Bola");
//				System.out.println("2. Kubus");
//				System.out.println("3. Balok");
//				System.out.println("4. Kerucut");
//				choose = scan.nextInt(); scan.nextLine();
//			}while(choose < 1 || choose > 4);
			
			switch(choose) {
			case 1:
				double j;
				String nilaij = JOptionPane.showInputDialog("Masukkan nilai jari-jari: ");
				j = Double.parseDouble(nilaij);
				
				Bola B = new Bola();
				B.setBola(j);
				
				JOptionPane.showInputDialog(null, "Luas Bola adalah " + B.luasBola());
				JOptionPane.showInputDialog(null, "Volume Bola adalah " + B.volumeBola());
				
				break;
				
			case 2:
				double s;
				String nilais = JOptionPane.showInputDialog("Masukkan nilai sisi: ");
				s = Double.parseDouble(nilais);
				
				Kubus K = new Kubus();
				K.setKubus(s);
				
				JOptionPane.showInputDialog(null, "Luas Persmukaan Kubus adalah " + K.luasKubus());
				JOptionPane.showInputDialog(null, "Volume Kubus adalah " + K.volumeKubus());
				break;
				
			case 3:
				double p, l, t;
				String nilaip = JOptionPane.showInputDialog("Masukkan nilai panjang: ");
				p = Double.parseDouble(nilaip);
				String nilail = JOptionPane.showInputDialog("Masukkan nilai lebar: ");
				l = Double.parseDouble(nilail);
				String nilait = JOptionPane.showInputDialog("Masukkan nilai tinggi: ");
				t = Double.parseDouble(nilait);
				
				Balok BL = new Balok();
				BL.setBalok(p, l, t);
				
				JOptionPane.showInputDialog(null, "Luas Permukaan Balok adalah " + BL.luasBalok());
				JOptionPane.showInputDialog(null, "Volume Balok adalah " + BL.volumeBalok());
				break;
				
			case 4:
				double r, t2, ss;
				String nilair = JOptionPane.showInputDialog("Masukkan nilai radius segitiga: ");
				r = Double.parseDouble(nilair);
				String nilait2 = JOptionPane.showInputDialog("Masukkan nilai tinggi segitiga: ");
				t2 = Double.parseDouble(nilait2);
				String nilaiss = JOptionPane.showInputDialog("Masukkan nilai sisi 1 segitiga: ");
				ss = Double.parseDouble(nilaiss);
				
				
				Kerucut KC = new Kerucut();
				KC.setKerucut(r, t2, ss);
				
				JOptionPane.showInputDialog(null, "Luas Permukaan Kerucut adalah " + KC.luasKerucut());
				JOptionPane.showInputDialog(null, "Luas Selimut Kerucut adalah " + KC.luasSelimutKerucut());
				JOptionPane.showInputDialog(null, "Volume Kerucut adalah " + KC.volumeKerucut());
				break;
//			}
//		}while(choose != 5);

	}

}
