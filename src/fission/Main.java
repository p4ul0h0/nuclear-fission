package fission;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calcs fission = new Calcs();
		System.out.println("Número de Uranio235 disponível em g: ");
		double uQtdG = scan.nextDouble();
		fission.calculateEnergyByQtd(uQtdG);
	}
	
}
