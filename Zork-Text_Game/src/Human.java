import java.util.ArrayList;
import java.util.Scanner;

public class Human implements Visitor {
	double Health;
	double Max_Health;
	double Rad;
	int Max_Weigh;
	int Xp;
	int FisicDefense;
	int EnergyDefense;
	int RadDefense;
	int FisicAmmo;
	int EnergyAmmo;
	int RadAmmo;
	int NukaAmmo;
	int FusionCoreAmmo;
	int SPECIAL[]= new int[7];
	ArrayList<Entity> Gun_list= new ArrayList<Entity>();
	ArrayList<Entity> Armor_list= new ArrayList<Entity>();
	ArrayList<Entity> Add_list= new ArrayList<Entity>();
	
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
		else if(this.Gun_list.get(i).getFusionCoreCost()!=0){
			if(this.Gun_list.get(i).getFusionCoreCost()==1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getFusionCoreCost() + " Nucleo de fusion");
					}
					else if(this.Gun_list.get(i).getFusionCoreCost()>1) {
						System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getFusionCoreCost() + " Nucleos de Fusion");
								}
		}
		else if(this.Gun_list.get(i).getNukeCost()!=0){
			if(this.Gun_list.get(i).getNukeCost()==1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getNukeCost() + " MiniBomba nuclear");
					}
			else if(this.Gun_list.get(i).getNukeCost()>1) {
				System.out.println("Esta arma utiliza: " + this.Gun_list.get(i).getNukeCost() + " MiniBombas nucleares");
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
					else if(this.Gun_list.get(option-1).getFusionCoreCost()!=0){
						if(this.Gun_list.get(option-1).getFusionCoreCost()==1) {
							System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getFusionCoreCost() + " Nucleo de fusion");
								}
								else if(this.Gun_list.get(option-1).getFusionCoreCost()>1) {
									System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getFusionCoreCost() + " Nucleos de Fusion");
											}
					}
					else if(this.Gun_list.get(option-1).getNukeCost()!=0){
						if(this.Gun_list.get(option-1).getNukeCost()==1) {
							System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getNukeCost() + " MiniBomba nuclear");
								}
						else if(this.Gun_list.get(option-1).getNukeCost()>1) {
							System.out.println("Esta arma utiliza: " + this.Gun_list.get(option-1).getNukeCost() + " MiniBombas nucleares");
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
	
	public void showAllAdd() {
		for(int i=0;i<this.Add_list.size();i++) {
			System.out.println("----------------------------");
			System.out.println("");
			System.out.println("  " + this.Add_list.get(i).getName());
			
			if(this.Add_list.get(i).getCureH()!=0) {
				System.out.println("  Cura "+this.Add_list.get(i).getCureH()+" puntos de salud");
			}
			if(this.Add_list.get(i).getCureR()!=0) {
				System.out.println("  Cura "+this.Add_list.get(i).getCureR()+" puntos de Radiacion");
			}
			if(this.Add_list.get(i).getRad()!=0) {
				System.out.println("  Te da "+this.Add_list.get(i).getRad()+" puntos de Radiacion");
			}
			if(this.Add_list.get(i).getS()!=0) {
				System.out.println("  Te da "+this.Add_list.get(i).getS()+" puntos de Fuerza");
			}
			if(this.Add_list.get(i).getP()!=0) {
				System.out.println("  Te da "+this.Add_list.get(i).getP()+" puntos de Percepcion");
			}
			if(this.Add_list.get(i).getE()!=0) {
				System.out.println("  Te da "+this.Add_list.get(i).getE()+" puntos de Resistencia");
			}
			if(this.Add_list.get(i).getC()!=0) {
				System.out.println("  Te da "+this.Add_list.get(i).getC()+" puntos de Carisma");
			}
			if(this.Add_list.get(i).getI()!=0) {
				System.out.println("  Te da "+this.Add_list.get(i).getI()+" puntos de Inteligencia");
			}
			if(this.Add_list.get(i).getA()!=0) {
				System.out.println("  Te da "+this.Add_list.get(i).getA()+" puntos de Agilidad");
			}
			if(this.Add_list.get(i).getL()!=0) {
				System.out.println("  Te da "+this.Add_list.get(i).getL()+" puntos de Suerte");
			}
		}
	}
	
	public void showAdd(int option) {
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("  " + this.Add_list.get(option-1).getName());
		System.out.println("");
		
		if(this.Add_list.get(option-1).getCureH()!=0) {
			System.out.println("  Cura "+this.Add_list.get(option-1).getCureH()+" puntos de salud");
		}
		if(this.Add_list.get(option-1).getCureR()!=0) {
			System.out.println("  Cura "+this.Add_list.get(option-1).getCureR()+" puntos de Radiacion");
		}
		if(this.Add_list.get(option-1).getRad()!=0) {
			System.out.println("  Te da "+this.Add_list.get(option-1).getRad()+" puntos de Radiacion");
		}
		if(this.Add_list.get(option-1).getS()!=0) {
			System.out.println("  Te da "+this.Add_list.get(option-1).getS()+" punto de Fuerza");
		}
		if(this.Add_list.get(option-1).getP()!=0) {
			System.out.println("  Te da "+this.Add_list.get(option-1).getP()+" punto de Percepcion");
		}
		if(this.Add_list.get(option-1).getE()!=0) {
			System.out.println("  Te da "+this.Add_list.get(option-1).getE()+" punto de Resistencia");
		}
		if(this.Add_list.get(option-1).getC()!=0) {
			System.out.println("  Te da "+this.Add_list.get(option-1).getC()+" punto de Carisma");
		}
		if(this.Add_list.get(option-1).getI()!=0) {
			System.out.println("  Te da "+this.Add_list.get(option-1).getI()+" punto de Inteligencia");
		}
		if(this.Add_list.get(option-1).getA()!=0) {
			System.out.println("  Te da "+this.Add_list.get(option-1).getA()+" punto de Agilidad");
		}
		if(this.Add_list.get(option-1).getL()!=0) {
			System.out.println("  Te da "+this.Add_list.get(option-1).getL()+" punto de Suerte");
		}
	  }
	
	public void showAddNames() {
		for(int i=0;i<this.Add_list.size();i++) {
			System.out.println(i+1+"-" + this.Add_list.get(i).getName());
		}
	}
	
	public int TotalWeigh() {
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
	
	public static void HUD(Human Humano) {
		Scanner a= new Scanner(System.in);
		int option;
		int ciclo=1;
		Gun Puños =new Gun("Puños",5+(5*Humano.SPECIAL[0]),0,0,0,0,0,0,0,0);
		Humano.Gun_list.add(Puños);
		do {
		Puños.setDmg(5+(5*Humano.SPECIAL[0]));
		Humano.Max_Weigh=50+ (10*Humano.SPECIAL[0]);
		Humano.Max_Health=100 + (10*Humano.SPECIAL[2]);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Salud:" + (int)Humano.applyRad(Humano.Max_Health,Humano.Rad)+"/"+(int)Humano.Max_Health+"      Radiacion:"+(int)Humano.Rad+"      Peso:"+Humano.TotalWeigh()+"/"+Humano.Max_Weigh+"      S.P.E.C.I.A.L:("+Humano.SPECIAL[0]+","+Humano.SPECIAL[1]+","+Humano.SPECIAL[2]+","+Humano.SPECIAL[3]+","+Humano.SPECIAL[4]+","+Humano.SPECIAL[5]+","+Humano.SPECIAL[6]+")");
		System.out.println("");
		System.out.println("1.Inventario");
		System.out.println("");
		System.out.println("Moverse:");
		System.out.println("  2.Arriba");
		System.out.println("  3.Abajo");
		System.out.println("  4.Derecha");
		System.out.println("  5.Izquierda");
		option=a.nextInt();
		switch(option){
		case 1:
			System.out.println("------------------------------------");
			System.out.println("INVENTARIO:\n");
			System.out.println("  0.Volver");
			System.out.println("  1.Armas");
			System.out.println("  2.Armaduras");
			System.out.println("  3.Consumibles");
			System.out.println("");
			System.out.println("Eleccion:");
			option=a.nextInt();
			switch(option) {
			case 0:
				ciclo=1;
				break;
				
			case 1:
				System.out.println("------------------------------------");
				System.out.println("-1 -Ver los detalles de todas las armas");
				System.out.println("0-Volver");
						Humano.showGunNames();
						System.out.println("");
						System.out.println("Elige una arma para ver su detalle:");
						option=a.nextInt();
	
				if(option==0) {
					ciclo=1;
				}
					else if(option==-1) {
					Humano.showAllGun();
				}
				else{
					if(option>Humano.Gun_list.size()) {
						System.out.println("No tienes una arma numero: "+option);
					}
					else {
						Humano.showGun(option);
					}
				}
				break;
				
			case 2:
				System.out.println("------------------------------------");
				System.out.println("-1-Ver los detalles de todas las armaduras");
				System.out.println("0-Volver");
						Humano.showArmorNames();
						System.out.println("");
						System.out.println("Elige una armadura para ver su detalle:");
						option=a.nextInt();
					if(option==0) {
						ciclo=1;
					}
				else if(option==-1) {
					Humano.showAllArmor();
				}
				else{
					if(option>Humano.Armor_list.size()) {
						System.out.println("No tienes una armadura numero: "+option);
					}
					else {
						Humano.showArmor(option);
					}
				}
				break;
				
			case 3:
				System.out.println("------------------------------------");
				System.out.println("-1-Ver los detalles de todas los consumibles");
				System.out.println("0-Volver");
						Humano.showAddNames();
						System.out.println("");
						System.out.println("Elige un consumible para ver su detalle:");
						option=a.nextInt();
					if(option==0) {
						ciclo=1;
					}
				else if(option==-1) {
					Humano.showAllAdd();
				}
				else{
					if(option>Humano.Add_list.size()) {
						System.out.println("No tienes un consumible numero: "+option);
					}
					else {
						Humano.showAdd(option);
					}
				}
				break;
				default:
					System.out.println("Elige una opcion valida");
					break;
				}
			}
		}while(ciclo==1);		
	}
	
	public static void SPECIAL(Human Humano) {
		Scanner a= new Scanner(System.in);
		System.out.println("Es hora de saber que te hace S.P.E.C.I.A.L");
		System.out.println("");
		int Lvs=10;
		do {
			
			System.out.println("");
			System.out.println("Escoje un atributo:                 Tienes "+ Lvs+" puntos de habilidad");
			 System.out.println("");
		    System.out.println("Cada Atributo tiene un maximo de 10 puntos");
		    System.out.println("");
			System.out.println("   1- FUERZA (" + Humano.SPECIAL[0] +"): La FUERZA hace que puedas llevar mas cosas contigo (+10 al Peso Maximo por nivel) \n   y causas mas daño con tus puños ( +2 al daño de los puños por nivel)");
			System.out.println("");
			System.out.println("   2- PERCEPCION (" + Humano.SPECIAL[1] +"): Mientras mas PERCEPCION tengas mas facil es encontrar objetos en el yermo(+0.05% de encontrar objetos por nivel)");
			System.out.println("");
			System.out.println("   3- RESISTENCIA (" + Humano.SPECIAL[2] +"): La RESISTENCIA aumenta la salud de tu personaje(+10 de salud maxima por nivel)");
			System.out.println("");
			System.out.println("   4- CARISMA (" + Humano.SPECIAL[3] +"): La CARISMA hace que tu personaje pueda dialogar con los habitantes del yermo y \n   domesticar a bestias para que te dejen en paz (+0.05% de exito al hablar por nivel)");
			System.out.println("");
			System.out.println("   5- INTELIGENCIA (" + Humano.SPECIAL[4] +"):La INTELIGENCIA hace que consigas mas experiencia al vencer a un enemigo(+2 de experiencia por enemigo por nivel)");
			System.out.println("");
			System.out.println("   6- AGILIDAD (" + Humano.SPECIAL[5] +"): La AGILIDAD aumenta el daño que causas con armas -menos los puños- (+0.1% de daño con armas por nivel)");
			System.out.println("");
			System.out.println("   7- SUERTE (" + Humano.SPECIAL[6] +"): La SUERTE aumenta la probabildad de que tu proximo ataque sea \n   golpe critico (+0.1% de probabilidad de golpe critico por nivel)");
			System.out.println("");
			System.out.println("Que atributo desea:");
			int option=a.nextInt();
			switch(option) {
			case 1:
				System.out.println("Cuantos puntos de FUERZA desea para su personaje:");
				option=a.nextInt();
				if((Humano.SPECIAL[0]+option)>10) {
					System.out.println("");
					System.out.println("Los atributos no pueden tener mas de 10 puntos");
					System.out.println("------------------------------------------------------------");
				}
				else if((Lvs-option)<0) {
					System.out.println("");
					System.out.println("No tienes los suficientes puntos de habilidad");
					System.out.println("------------------------------------------------------------");
				}
				else {
					Humano.SPECIAL[0]=Humano.SPECIAL[0]+option;
					Lvs=Lvs-option;
					System.out.println("------------------------------------------------------------");
				}
				break;
			case 2:
				System.out.println("Cuantos puntos de PERCEPCION desea para su personaje:");
				option=a.nextInt();
				if((Humano.SPECIAL[1]+option)>10) {
					System.out.println("");
					System.out.println("Los atributos no pueden tener mas de 10 puntos");
					System.out.println("------------------------------------------------------------");
				}
				else if((Lvs-option)<0) {
					System.out.println("");
					System.out.println("No tienes los suficientes puntos de habilidad");
					System.out.println("------------------------------------------------------------");
				}
				else {
					Humano.SPECIAL[1]=Humano.SPECIAL[1]+option;
					Lvs=Lvs-option;
					System.out.println("------------------------------------------------------------");
				}
				break;
			case 3:
				System.out.println("Cuantos puntos de RESISTENCIA desea para su personaje:");
				option=a.nextInt();
				if((Humano.SPECIAL[2]+option)>10) {
					System.out.println("");
					System.out.println("Los atributos no pueden tener mas de 10 puntos");
					System.out.println("------------------------------------------------------------");
				}
				else if((Lvs-option)<0) {
					System.out.println("");
					System.out.println("No tienes los suficientes puntos de habilidad");
					System.out.println("------------------------------------------------------------");
				}
				else {
					Humano.SPECIAL[2]=Humano.SPECIAL[2]+option;
					Lvs=Lvs-option;
					System.out.println("------------------------------------------------------------");
				}
				break;
			case 4:
				System.out.println("Cuantos puntos de CARISMA desea para su personaje:");
				option=a.nextInt();
				if((Humano.SPECIAL[3]+option)>10) {
					System.out.println("");
					System.out.println("Los atributos no pueden tener mas de 10 puntos");
					System.out.println("------------------------------------------------------------");
				}
				else if((Lvs-option)<0) {
					System.out.println("");
					System.out.println("No tienes los suficientes puntos de habilidad");
					System.out.println("------------------------------------------------------------");
				}
				else {
					Humano.SPECIAL[3]=Humano.SPECIAL[3]+option;
					Lvs=Lvs-option;
					System.out.println("------------------------------------------------------------");
				}
				break;
			case 5:
				System.out.println("Cuantos puntos de INTELIGENCIA  desea para su personaje:");
				option=a.nextInt();
				if((Humano.SPECIAL[4]+option)>10) {
					System.out.println("");
					System.out.println("Los atributos no pueden tener mas de 10 puntos");
					System.out.println("------------------------------------------------------------");
				}
				else if((Lvs-option)<0) {
					System.out.println("");
					System.out.println("No tienes los suficientes puntos de habilidad");
					System.out.println("------------------------------------------------------------");
				}
				else {
					Humano.SPECIAL[4]=Humano.SPECIAL[4]+option;
					Lvs=Lvs-option;
					System.out.println("------------------------------------------------------------");
				}
				break;
			case 6:
				System.out.println("Cuantos puntos de AGILIDAD desea para su personaje:");
				option=a.nextInt();
				if((Humano.SPECIAL[5]+option)>10) {
					System.out.println("");
					System.out.println("Los atributos no pueden tener mas de 10 puntos");
					System.out.println("------------------------------------------------------------");
				}
				else if((Lvs-option)<0) {
					System.out.println("");
					System.out.println("No tienes los suficientes puntos de habilidad");
					System.out.println("------------------------------------------------------------");
				}
				else {
					Humano.SPECIAL[5]=Humano.SPECIAL[5]+option;
					Lvs=Lvs-option;
					System.out.println("------------------------------------------------------------");
				}
				break;
			case 7:
				System.out.println("Cuantos puntos de SUERTE desea para su personaje:");
				option=a.nextInt();
				if((Humano.SPECIAL[6]+option)>10) {
					System.out.println("");
					System.out.println("Los atributos no pueden tener mas de 10 puntos");
					System.out.println("------------------------------------------------------------");
				}
				else if((Lvs-option)<0) {
					System.out.println("");
					System.out.println("No tienes los suficientes puntos de habilidad");
					System.out.println("------------------------------------------------------------");
				}
				else {
					Humano.SPECIAL[6]=Humano.SPECIAL[6]+option;
					Lvs=Lvs-option;
					System.out.println("------------------------------------------------------------");
				}
				break;
				default:
					System.out.println("Elige una opcion valida");
					System.out.println("------------------------------------------------------------");
				break;
			}
		}while(Lvs >0);
	}


	public Human visit(Box box, Human Humano) {
		// TODO Auto-generated method stub
		return null;
	}
}
