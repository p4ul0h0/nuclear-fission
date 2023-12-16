package fission;

/**
 * @author T-Gamer
 *
 */
public class Calcs {
	final double uraniumMass = 235.0439;
	final double neutronMass = 1.008665;
	final double bariumMass = 140.9144;
	final double kryptonMass = 91.92616;
	final double avogadroConst = 6.022 * Math.pow(10, 23);

	public void calculateEnergyByQtd(double uQtd) {
		double atmQtd = uQtd / uraniumMass * avogadroConst;
		System.out.println("Energia liberada na fissão de "
				+ uQtd + "g de Uranio235 gerando: " +
				calculateFissionEnergy() * (atmQtd / uraniumMass) + " Kj/g");
	}
	
	public double calculateFissionEnergy() {
		double deltaMassKg = ((uraniumMass + neutronMass) - (bariumMass + kryptonMass + (3*neutronMass))) * (1.66 * Math.pow(10, -27));
		double spdOfLightSqrd = Math.pow((3*Math.pow(10,8)), 2);
		double totalEnergyJ = deltaMassKg * spdOfLightSqrd;
		System.out.println("Energia gerada em fissão de um átomo de Uranio235: " + totalEnergyJ + " J");
		double totalEnergyKj = totalEnergyJ / 1000 * avogadroConst;
		System.out.println("Energia em fissão de um mol de Uranio235: " + totalEnergyKj + " Kj/mol-1");
		return totalEnergyKj;
	}
}
