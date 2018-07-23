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
	
	public void showAllGun() {
		for(int i=0;i<this.Gun_list.size();i++) {
			
		System.out.println("----------------------------");
		System.out.println("  " + this.Gun_list.get(i).getName());
		System.out.println("");
		System.out.println("Daño:");
		System.out.println("  Fisico: " + this.Gun_list.get(i).getFisicDmg());
		System.out.println("  Energia: " + this.Gun_list.get(i).getEnergyDmg());
		System.out.println("  Radiacion: " + this.Gun_list.get(i).getRadDmg());
		System.out.println("");
		if(this.Gun_list.get(i).getFisicAmmoCost()!=0) {
			if(this.Gun_list.get(i).getFisicAmmoCost()==1) {
		System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getFisicAmmoCost() + " bala");
			}
			else if(this.Gun_list.get(i).getFisicAmmoCost()>1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getFisicAmmoCost() + " balas");
			}
		}
		else if(this.Gun_list.get(i).getEnergyAmmoCost()!=0){
			if(this.Gun_list.get(i).getEnergyAmmoCost()==1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getEnergyAmmoCost() + " celda de energia");
					}
					else if(this.Gun_list.get(i).getEnergyAmmoCost()>1) {
						System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getEnergyAmmoCost() + " celdas de energia");
					}
		}
		else if(this.Gun_list.get(i).getRadAmmoCost()!=0){
			if(this.Gun_list.get(i).getRadAmmoCost()==1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getRadAmmoCost() + " Cartuchos Gamma");
					}
					else if(this.Gun_list.get(i).getRadAmmoCost()>1) {
						System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getRadAmmoCost() + " Cartuchos Gamma");
					}
		}
		System.out.println("");
		System.out.println("Peso: " + this.Gun_list.get(i).getWeigh());
		System.out.println("");
		}
	}
	
	public void showGunNames() {

		for(int i=0;i<this.Gun_list.size();i++) {
			System.out.println(i+1+"-"+this.Gun_list.get(i).getName());
		}
	}
	
	public void showGun(int option) {
		System.out.println("----------------------------");
		System.out.println("  " + this.Gun_list.get(option-1).getName());
		System.out.println("");
		System.out.println("Daño:");
		System.out.println("  Fisico: " + this.Gun_list.get(option-1).getFisicDmg());
		System.out.println("  Energia: " + this.Gun_list.get(option-1).getEnergyDmg());
		System.out.println("  Radiacion: " + this.Gun_list.get(option-1).getRadDmg());
		System.out.println("");
		if(this.Gun_list.get(option-1).getFisicAmmoCost()!=0) {
			if(this.Gun_list.get(option-1).getFisicAmmoCost()==1) {
		System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getFisicAmmoCost() + " bala");
			}
			else if(this.Gun_list.get(option-1).getFisicAmmoCost()>1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getFisicAmmoCost() + " balas");
			}
		}
		else if(this.Gun_list.get(option-1).getEnergyAmmoCost()!=0){
			if(this.Gun_list.get(option-1).getEnergyAmmoCost()==1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getEnergyAmmoCost() + " celda de energia");
					}
					else if(this.Gun_list.get(option-1).getEnergyAmmoCost()>1) {
						System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getEnergyAmmoCost() + " celdas de energia");
					}
		}
		else if(this.Gun_list.get(option-1).getRadAmmoCost()!=0){
			if(this.Gun_list.get(option-1).getRadAmmoCost()==1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getRadAmmoCost() + " Cartuchos Gamma");
					}
					else if(this.Gun_list.get(option-1).getRadAmmoCost()>1) {
						System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getRadAmmoCost() + " Cartuchos Gamma");
					}
		}
		System.out.println("");
		System.out.println("Peso: " + this.Gun_list.get(option-1).getWeigh());
		System.out.println("");
	}
	
	public void showAllArmor() {
		for(int i=0;i<this.Armor_list.size();i++) {
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("  " + this.Armor_list.get(i).getName());
		System.out.println("");
		System.out.println("Resistencia:");
		System.out.println("  Fisico: "+this.Armor_list.get(i).getFisicDefend());
		System.out.println("  Energia: "+this.Armor_list.get(i).getEnergyDefend());
		System.out.println("  Radiacion: "+this.Armor_list.get(i).getRadDefend());
		System.out.println("");
		System.out.println("Peso: "+this.Armor_list.get(i).getWeigh());
	}
}
	
	public void showArmorNames() {
		for(int i=0;i<this.Armor_list.size();i++) {
			System.out.println(i+1+"-" + this.Armor_list.get(i).getName());
		}
	}

	public void showArmor(int option) {
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("  " + this.Armor_list.get(option-1).getName());
		System.out.println("");
		System.out.println("Resistencia:");
		System.out.println("  Fisico: "+this.Armor_list.get(option-1).getFisicDefend());
		System.out.println("  Energia: "+this.Armor_list.get(option-1).getEnergyDefend());
		System.out.println("  Radiacion: "+this.Armor_list.get(option-1).getRadDefend());
		System.out.println("");
		System.out.println("Peso: "+this.Armor_list.get(option-1).getWeigh());
	}
	
		public int weigh() {
		int TotalWeigh = 0;
		for(int i=0;i<this.Gun_list.size();i++) {
			TotalWeigh =TotalWeigh + this.Gun_list.get(i).getWeigh();
			}
		for(int i=0;i<this.Armor_list.size();i++) {
			TotalWeigh=TotalWeigh + this.Armor_list.get(i).getWeigh();
			}
		return  TotalWeigh;
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
