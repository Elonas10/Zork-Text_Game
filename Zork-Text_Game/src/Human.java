import java.util.ArrayList;

public class Human {
	double Health;
	double Max_Health;
	double Rad;
	int Max_Weigh;
	int Xp;
	int FisicDefence;
	int EnergyDefence;
	int RadDefence;
	int FisicAmmo;
	int EnergyAmmo;
	int RadAmmo;
	int SPECIAL[]= new int[7];
	ArrayList<Gun> Gun_list= new ArrayList<Gun>();
	ArrayList<Armor> Armor_list= new ArrayList<Armor>();
	
	public void showGun(Gun G) {
		System.out.println("----------------------------");
		System.out.println("Tines una: " + G.getName());
		System.out.println("");
		System.out.println("Daño:");
		System.out.println("  Fisico: " + G.getFisicDmg());
		System.out.println("  Energia: " + G.getEnergyDmg());
		System.out.println("  Radiacion: " + G.getRadDmg());
		System.out.println("");
		if(G.getFisicAmmoCost()!=0) {
			if(G.getFisicAmmoCost()==1) {
		System.out.println("Esta arma utiliza: " + G.getFisicAmmoCost() + " bala");
			}
			else if(G.getFisicAmmoCost()>1) {
				System.out.println("Esta arma utiliza: " + G.getFisicAmmoCost() + " balas");
			}
		}
		else if(G.getEnergyAmmoCost()!=0){
			if(G.getEnergyAmmoCost()==1) {
				System.out.println("Esta arma utiliza: " + G.getEnergyAmmoCost() + " celda de energia");
					}
					else if(G.getEnergyAmmoCost()>1) {
						System.out.println("Esta arma utiliza: " + G.getEnergyAmmoCost() + " celdas de energia");
					}
		}
		else if(G.getRadAmmoCost()!=0){
			if(G.getRadAmmoCost()==1) {
				System.out.println("Esta arma utiliza: " + G.getRadAmmoCost() + " Cartuchos Gamma");
					}
					else if(G.getRadAmmoCost()>1) {
						System.out.println("Esta arma utiliza: " + G.getRadAmmoCost() + " Cartuchos Gamma");
					}
		}
		System.out.println("");
		System.out.println("Peso: " + G.getWeigh());
		System.out.println("");
	}
	
	public void showArmor(Armor A) {

		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("Tienes un: " + A.getName());
		System.out.println("");
		System.out.println("Resistencia:");
		System.out.println("  Fisico: "+A.getFisicDefend());
		System.out.println("  Energia: "+A.getEnergyDefend());
		System.out.println("  Radiacion: "+A.getRadDefend());
	}
	
	public double applyRad(double Max_H,double Rad) {
		Max_H = Max_H-Rad;
		if(this.Health>Max_H) {
			this.Health=Max_H;
			return this.Health;
		}
		else {
		return this.Health;
	}
	}
}
