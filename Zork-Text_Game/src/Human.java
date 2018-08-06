import java.util.ArrayList;
import java.util.Scanner;

public class Human implements Visitor {
	double Health,Max_Health,Rad;
	int Max_Weigh,Xp,FisicAmmo,EnergyAmmo,RadAmmo,NukaAmmo,FusionCoreAmmo,Position_x,Position_y;
	Gun equippedGun;
	Armor equippedArmor;
	Box Myposition;
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
		if(this.Rad<0) {
			this.Rad=0;
		}
		this.Max_Health = Max_H-Rad;
		if(this.Health>Max_H) {
			this.Health=Max_H;
			return this.Health;
		}
		else {
		return this.Health;
	}
	}
	
	public static void Game(Human Humano) {
		Map Mapa=new Map();
		Mapa.createMap();
		Scanner a= new Scanner(System.in);
		int option;
		Main.gameOver=false;
		Main.endGame=false;
		Gun Puños =new Gun("Puños",5+(1*Humano.SPECIAL[0]),0,0,0,0,0,0,0,0);
		Gun StartGun =new Gun("Pistola de tubo",6,0,0,1,0,0,0,0,3);
		Armor StartArmor=(new Armor("Traje de Vaul-Tec (111)",0,0,1,3));
		Humano.Gun_list.add(Puños);
		Humano.Gun_list.add(StartGun);
		Humano.Armor_list.add(StartArmor);
		Humano.equippedGun=StartGun;
		Humano.equippedArmor=StartArmor;
		Humano.FisicAmmo=100;
		Humano.EnergyAmmo=50;
		Humano.RadAmmo=50;
		do {
		Puños.setDmg(5+(1*Humano.SPECIAL[0]));
		Humano.Max_Weigh=50+ (10*Humano.SPECIAL[0]);
		Humano.Max_Health=100 + (10*Humano.SPECIAL[2]);
		
       
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Salud:" + (int)Humano.applyRad(Humano.Max_Health,Humano.Rad)+"/"+(int)Humano.Max_Health+"      Radiacion:"+(int)Humano.Rad+"      Peso:"+Humano.TotalWeigh()+"/"+Humano.Max_Weigh+"      S.P.E.C.I.A.L:("+Humano.SPECIAL[0]+","+Humano.SPECIAL[1]+","+Humano.SPECIAL[2]+","+Humano.SPECIAL[3]+","+Humano.SPECIAL[4]+","+Humano.SPECIAL[5]+","+Humano.SPECIAL[6]+")"+"Xp:"+Humano.Xp+"/100");
		System.out.println("");
		if(Humano.equippedGun==null){Humano.equippedGun=Puños;}
		System.out.println("Daño: (Fisico:"+Humano.equippedGun.getFisicDmg()+" Energia:"+Humano.equippedGun.getEnergyDmg()+" Radiacion:"+Humano.equippedGun.getRadDmg()+")  Municion: (Balas:"+Humano.FisicAmmo+" Celdas de energia:"+Humano.EnergyAmmo+" Cartuchos Gamma:"+Humano.RadAmmo+" Mini-Bombas Nucleares:"+Humano.NukaAmmo+" Nucleo de Fusion:"+Humano.FusionCoreAmmo+")");
		
		System.out.println("");
		if(Humano.equippedArmor!=null) {
		System.out.println("Resistencia: (Fisica:"+Humano.equippedArmor.getFisicDefend()+" Energia:"+Humano.equippedArmor.getEnergyDefend()+" Radiacion:"+Humano.equippedArmor.getRadDefend()+")");
		}
		System.out.println("");
		System.out.println("1.Inventario");
		System.out.println("");
		System.out.println("2.Equipar Arma");
		System.out.println("");
		System.out.println("3.Equipar Armadura");
		System.out.println("");
		System.out.println("4.Usar consumible");
		System.out.println("");
		System.out.println("5.Tirar Objeto");
		System.out.println("");
		if(Humano.Xp>=100) {
			System.out.println("**10.Subir de nivel**");
		}
		System.out.println("");
		System.out.println("Moverse:");
		System.out.println("  6.Arriba");
		System.out.println("  7.Abajo");
		System.out.println("  8.Derecha");
		System.out.println("  9.Izquierda");
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
				System.out.println("VOLVER AL MENU");
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
					System.out.println("VOLVER AL MENU");
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
			
		case 2: 
			System.out.println("Arma equipada: "+"("+Humano.equippedGun.getName()+")");
			Humano.showGunNames();
			System.out.println("Cual arma desea elegir:");
			option=a.nextInt();
			Humano.changeGun((Gun) Humano.Gun_list.get(option-1), Humano);
			break;
		case 3:
			System.out.println("Armadura equipada: "+"("+Humano.equippedArmor.getName()+")");
			Humano.showArmorNames();
			System.out.println("Cual armadura desea elegir:");
			option=a.nextInt();
			Humano.changeArmor((Armor)Humano.Armor_list.get(option-1), Humano);
			break;
		case 4: 
			if(Humano.Add_list.isEmpty()) {
				System.out.println("No tienes ningun consumible");
			}
			else {
			Humano.showAddNames();
			System.out.println("Cual consumible desea usar:");
			option=a.nextInt();
			Humano.useAdd((Add)Humano.Add_list.get(option-1),Humano);
			Humano.Add_list.remove(option-1);
			}
			break;
		case 5:
			System.out.println("Si tiras un objeto desaparecera");
			System.out.println("Que tipo de objeto quiere lanzar:");
			System.out.println(" 0.Volver");
			System.out.println(" 1.Arma");
			System.out.println(" 2.Amadura");
			System.out.println("Que tipo de objeto quiere lanzar:");
			option=a.nextInt();
			if(option==0) {
				System.out.println("VOLVER AL MENU");
			}
			else if(option==1) {
				System.out.println("Que Arma desea lanzar:");
				System.out.println("0-Volver");
				Humano.showGunNames();
				option=a.nextInt();
				if(option==0) {
					System.out.println("VOLVER AL MENU");
				}
				else if(Humano.Gun_list.get(option-1)==Humano.equippedGun){
					System.out.println("No puedes lanzar una arma que tienes equipada");
				}
				else {
				Humano.Gun_list.remove(option-1);
				}
				if(option==1) {
					Main.gameOver=true;
					System.out.println("Mueres desangrado por quitarte tus puños");
				}
			}
			else if(option==2) {
				System.out.println("Que Armadura desea lanzar:");
				System.out.println("0-Volver");
				Humano.showArmorNames();
				option=a.nextInt();
				if(option==0) {
					System.out.println("VOLVER AL MENU");
				}
				else if(Humano.Armor_list.get(option-1)==Humano.equippedArmor){
					System.out.println("No puedes lanzar una armadura que tienes equipada");
				}
				else {
				Humano.Armor_list.remove(option-1);
				}
			}
			break;
		case 6:
			if(Humano.TotalWeigh()>=Humano.Max_Weigh) {
				System.out.println("Tienes demasiado peso, tira algunas cosas de tu inventario");
			}
			else {
			if(Humano.Position_y+1==Main.Y) {
				System.out.println("Te das cuenta que el camino que elegiste te lleva a un lugar lleno de radiacion y animales mutados, asi que decides regresar");
			}
			else {
			Humano.Position_y++;
			}
			}
			 Humano.Myposition=Mapa.getBox(Humano.Position_x, Humano.Position_y);
		     Humano = Humano.Myposition.accept(Humano);
			break;
			
		case 7:
			if(Humano.TotalWeigh()>=Humano.Max_Weigh) {
				System.out.println("Tienes demasiado peso, tira algunas cosas de tu inventario");
			}
			else {
			if(Humano.Position_y-1==-1) {
				System.out.println("Te das cuenta que el camino que elegiste te lleva a un lugar lleno de radiacion y animales mutados, asi que decides regresar");
			}
			else {
			Humano.Position_y--;
			}
			}
			 Humano.Myposition=Mapa.getBox(Humano.Position_x, Humano.Position_y);
		     Humano = Humano.Myposition.accept(Humano);
			break;
			
		
		case 8:
			if(Humano.TotalWeigh()>=Humano.Max_Weigh) {
				System.out.println("Tienes demasiado peso, tira algunas cosas de tu inventario");
			}
			else {
			if(Humano.Position_x+1==Main.X) {
				System.out.println("Te das cuenta que el camino que elegiste te lleva a un lugar lleno de radiacion y animales mutados, asi que decides regresar");
			}
			else {
			Humano.Position_x++;
			}
			}
			 Humano.Myposition=Mapa.getBox(Humano.Position_x, Humano.Position_y);
		     Humano = Humano.Myposition.accept(Humano);
			break;
			
		
		case 9:
			if(Humano.TotalWeigh()>=Humano.Max_Weigh) {
				System.out.println("Tienes demasiado peso, tira algunas cosas de tu inventario");
			}
			else {
			if(Humano.Position_x-1==-1) {
			System.out.println("Te das cuenta que el camino que elegiste te lleva a un lugar lleno de radiacion y animales mutados, asi que decides regresar");
			}
			else {
			Humano.Position_x--;
			}
			}
			 Humano.Myposition=Mapa.getBox(Humano.Position_x, Humano.Position_y);
		     Humano = Humano.Myposition.accept(Humano);
			break;
		case 10:
			if(Humano.Xp>=100) {
				System.out.println("Cual atributo desea subir de nivel:");
				System.out.println("1-Fuerza");
				System.out.println("2-Percepcion");
				System.out.println("3-Resistencia");
				System.out.println("4-Carisma");
				System.out.println("5-Inteligencia");
				System.out.println("6-Agilidad");
				System.out.println("7-Suerte");
				option=a.nextInt();
				if(option==1) {Humano.SPECIAL[0]=Humano.SPECIAL[0]+1;}
				else if(option==2) {Humano.SPECIAL[1]=Humano.SPECIAL[1]+1;}
				else if(option==3) {Humano.SPECIAL[2]=Humano.SPECIAL[2]+1;}
				else if(option==4) {Humano.SPECIAL[3]=Humano.SPECIAL[3]+1;}
				else if(option==5) {Humano.SPECIAL[4]=Humano.SPECIAL[4]+1;}
				else if(option==6) {Humano.SPECIAL[5]=Humano.SPECIAL[5]+1;}
				else if(option==7) {Humano.SPECIAL[6]=Humano.SPECIAL[6]+1;}
			}
			else {
				System.out.println("No tienes suficientes puntos de experiencia");
			}
				break;
			}
		if(Humano.Health<=0) {Main.gameOver=true;}
		if(Mapa.getBox(Main.X-1, Main.Y-1).getEnemy()==null) {Main.endGame=true;}
		}while(Main.endGame==false && Main.gameOver==false);		
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
			System.out.println("   1- FUERZA (" + Humano.SPECIAL[0] +"): La FUERZA hace que puedas llevar mas cosas contigo (+10 al Peso Maximo por nivel) \n   y causas mas daño con tus puños ( +1 al daño de los puños por nivel)");
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

	@Override
	public Human visit(Box box, Human Humano) {
		boolean Found=Humano.foundObject(Humano);
		
		if(box.getEnemy()==null && Found==false) {
			System.out.println("No encontraste nada");
		}
		
		if(box.getEnemy()!=null) {
			Humano.Fight(Humano,(Enemy)box.getEnemy());
			Enemy E=(Enemy)box.getEnemy();
			Humano.Xp=Humano.Xp+E.getXp()+2*Humano.SPECIAL[4];
			if(Humano.Health>0) {box.setEnemy(null);}
		}
		
		if(box.getArmor()!=null && Found==true){
			Scanner a=new Scanner(System.in);
			Armor A=(Armor)box.getArmor();
			System.out.println("Encontraste una armadura!");
			System.out.println("----------------------------");
			System.out.println("");
			System.out.println("  " + A.getName());
			System.out.println("");
			System.out.println("Resistencia:");
			System.out.println("  Fisico: "+A.getFisicDefend());
			System.out.println("  Energia: "+A.getEnergyDefend());
			System.out.println("  Radiacion: "+A.getRadDefend());
			System.out.println("");
			System.out.println("Peso: "+A.getWeigh());
			System.out.println("----------------------------");
			System.out.print("Agarrar Armadura: 0.No 1.Si");
			int option = a.nextInt();
			if(option==0) {
				box.setArmor(A);
			}
			if(option==1) {
				Humano.Armor_list.add(A);
				box.setArmor(null);
			}
		}
		if(box.getGun()!=null && Found==true){
			Scanner a=new Scanner(System.in);
			Gun G=(Gun)box.getGun();
			System.out.println("Encontraste una arma!");
			System.out.println("----------------------------");
			System.out.println("  " + G.getName());
			System.out.println("");
			System.out.println("Daño:");
			System.out.println("  Fisico: " + G.getFisicDmg());
			System.out.println("  Energia: " + G.getEnergyDmg());
			System.out.println("  Radiacion: " + G.getRadDmg());
			System.out.println("");
			System.out.println("Peso: "+G.getWeigh());
			System.out.println("----------------------------");
			System.out.println("Agarrar Arma: 0.No  1.Si");
			int option = a.nextInt();
			if(option==0) {
				box.setGun(G);
			}
			if(option==1) {
				Humano.Gun_list.add(G);
				box.setGun(null);
			}
		}
		if(box.getAdd()!=null && Found==true){
			Scanner a=new Scanner(System.in);
			Add Ad=(Add)box.getAdd();
			System.out.println("Encontraste un consumible!");
			System.out.println("----------------------------");
			System.out.println("");
			System.out.println("  " + Ad.getName());
			System.out.println("");
			if(Ad.getCureH()!=0) {
				System.out.println("  Cura "+Ad.getCureH()+" puntos de salud");
			}
			if(Ad.getCureR()!=0) {
				System.out.println("  Cura "+Ad.getCureR()+" puntos de Radiacion");
			}
			if(Ad.getRad()!=0) {
				System.out.println("  Te da "+Ad.getRad()+" puntos de Radiacion");
			}
			if(Ad.getS()!=0) {
				System.out.println("  Te da "+Ad.getS()+" punto de Fuerza");
			}
			if(Ad.getP()!=0) {
				System.out.println("  Te da "+Ad.getP()+" punto de Percepcion");
			}
			if(Ad.getE()!=0) {
				System.out.println("  Te da "+Ad.getE()+" punto de Resistencia");
			}
			if(Ad.getC()!=0) {
				System.out.println("  Te da "+Ad.getC()+" punto de Carisma");
			}
			if(Ad.getI()!=0) {
				System.out.println("  Te da "+Ad.getI()+" punto de Inteligencia");
			}
			if(Ad.getA()!=0) {
				System.out.println("  Te da "+Ad.getA()+" punto de Agilidad");
			}
			if(Ad.getL()!=0) {
				System.out.println("  Te da "+Ad.getL()+" punto de Suerte");
			}
			System.out.println("----------------------------");
			
				Humano.Add_list.add(Ad);
				box.setAdd(null);
			
		}
		if((box.getFAmmo()!=0 || box.getEAmmo()!=0 || box.getRAmmo()!=0) && Found==true) {
			System.out.println("Encontraste una caja de muncion!");
			Humano.FisicAmmo=Humano.FisicAmmo + box.getFAmmo();
			Humano.EnergyAmmo=Humano.EnergyAmmo + box.getEAmmo();
			Humano.RadAmmo=Humano.RadAmmo+ box.getRAmmo();
			box.setFAmmo(0);
			box.setEAmmo(0);
			box.setRAmmo(0);
		}
		if(box.getNAmmo()!=0 && Found==true) {
			System.out.println("Encontraste una Mini-Bomba nuclear!");
			Humano.NukaAmmo=Humano.NukaAmmo + box.getNAmmo();
			box.setNAmmo(0);
		}
		if(box.getFCAmmo()!=0 && Found==true) {
			System.out.println("Encontraste un Nucleo de Fusion !");
			Humano.FusionCoreAmmo=Humano.FusionCoreAmmo + box.getFCAmmo();
			box.setFCAmmo(0);
		}
		return Humano;
	}
	
	public void Fight(Human Humano,Enemy Enemigo) {
		Scanner a=new Scanner(System.in);
		int option;
		System.out.println("Haz encontrado a un Enemigo: " + Enemigo.getName());
		System.out.println("Descripcion: " + Enemigo.getDescription());
		boolean Huir = false;
		do {
			System.out.println("El enemigo tiene: "+Enemigo.getHealth()+" puntos de vida");
			System.out.println("-----------------------------------");
			System.out.println("");
			System.out.println("Que quieres hacer:");
			System.out.println(" 1.Atacar");
			System.out.println(" 2.Cambiar arma");
			System.out.println(" 3.Usar consumible");
			System.out.println(" 4.Cambiar armadura");
			System.out.println(" 5.Huir");
			System.out.println("OPCION:");
			option=a.nextInt();
			switch(option) {
			
			case 1: 
				if(Humano.equippedGun.getFisicAmmoCost()<=Humano.FisicAmmo && Humano.equippedGun.getEnergyAmmoCost()<=Humano.EnergyAmmo && Humano.equippedGun.getRadAmmoCost()<= Humano.RadAmmo && Humano.equippedGun.getNukeCost()<=Humano.NukaAmmo&& Humano.equippedGun.getFusionCoreCost()<=Humano.FusionCoreAmmo) {
					if(Humano.critic(Humano)) {
						System.out.println("Diste un golpe critico");
						Enemigo.setHealth(2*((Humano.totalDmg(equippedGun)*0.1*Humano.SPECIAL[5])+Humano.totalDmg(equippedGun)));
					}
					else {
						Enemigo.setHealth((Humano.totalDmg(equippedGun)*0.1*Humano.SPECIAL[5])+Humano.totalDmg(equippedGun));
					}
					Humano.FisicAmmo=Humano.FisicAmmo-Humano.equippedGun.getFisicAmmoCost();
					Humano.EnergyAmmo=Humano.EnergyAmmo-Humano.equippedGun.getEnergyAmmoCost();
					Humano.RadAmmo=Humano.RadAmmo-Humano.equippedGun.getRadAmmoCost();
					Humano.NukaAmmo=Humano.NukaAmmo-Humano.equippedGun.getNukeCost();
					Humano.FusionCoreAmmo=Humano.FusionCoreAmmo-Humano.equippedGun.getFusionCoreCost();
				}
				else {
					System.out.println("");
					System.out.println("No tienes suficientes municion para usar esta arma");
					System.out.println("");
				}
			break;
			
			case 2: 
			System.out.println("Arma equipada: "+"("+Humano.equippedGun.getName()+")");
			Humano.showGunNames();
			System.out.println("Cual arma desea elegir:");
			option=a.nextInt();
			Humano.changeGun((Gun) Humano.Gun_list.get(option-1), Humano);
			break;
			
			case 3: 
				if(Humano.Add_list.isEmpty()) {
					System.out.println("No tienes ningun consumible");
				}
				else {
				Humano.showAddNames();
				System.out.println("Cual consumible desea usar:");
				option=a.nextInt();
				Humano.useAdd((Add)Humano.Add_list.get(option-1),Humano);
				Humano.Add_list.remove(option-1);
				}
				break;
				
			case 4:
				System.out.println("Armadura equipada: "+"("+Humano.equippedArmor.getName()+")");
				Humano.showArmorNames();
				System.out.println("Cual armadura desea elegir:");
				option=a.nextInt();
				Humano.changeArmor((Armor)Humano.Armor_list.get(option-1), Humano);
				break;
			
			case 5:
				Huir=Humano.run(Humano);
				if(Huir) {
					System.out.println("Lograste huir de la batalla contra: "+Enemigo.getName());
				}
				else{
					System.out.println("No podras escapar tan facil");
					Huir=false;
				}
				break;

			default:
				System.out.println("Esa opcion no existe,ahora te jodei piazo de marico te van a dar tremendo coñazo por sapo");
				break;
			    }
			if(Enemigo.getHealth()>0 && Huir==false){Humano.EnemyAttack(Enemigo, Humano);}
			
		}while(Enemigo.getHealth()>0 && Humano.Health>0 && Huir==false);
		if(Enemigo.getHealth()<=0) {System.out.println("Ganaste la Batalla");}
		if(Humano.Health<=0) {System.out.println("Moriste");}
	}
	
	public void changeGun(Gun Gun,Human Humano) {
		Humano.equippedGun=Gun;
	}
	
	public void changeArmor(Armor Armor,Human Humano) {
		Humano.equippedArmor=Armor;
	}
	
	public void EnemyAttack(Enemy Enemigo,Human Humano) {
		Humano.Health= Humano.Health - Humano.totalEnemyDamage(Enemigo,Humano);
		double Rad= 0.5*Enemigo.getRadDmg();
		Humano.Rad=Humano.Rad+Rad;
		System.out.println("'"+Enemigo.getName()+"' te infligio: "+Humano.totalEnemyDamage(Enemigo,Humano)+" puntos de daño");
		System.out.println("Tienes: "+Humano.Health+" puntos de salud");
	}
	
	public int totalEnemyDamage(Enemy Enemigo,Human Humano) {
		int F=Enemigo.getFisicDmg() -Humano.equippedArmor.getFisicDefend();
		int E=Enemigo.getEnergyDmg() -Humano.equippedArmor.getEnergyDefend();
		int R=Enemigo.getRadDmg() -Humano.equippedArmor.getRadDefend();
		if(F<0) {F=0;}
		if(E<0) {E=0;}
		if(R<0) {R=0;}
		return F+E+R;
	}
	
	public void useAdd(Add add,Human Humano) {
	 Humano.Health=Humano.Health+add.getCureH();
	 Humano.Rad= -add.getCureR() +add.getRad();
	 Humano.applyRad(Humano.Max_Health, Humano.Rad);
	 Humano.SPECIAL[0]=Humano.SPECIAL[0] + add.getS();
	 Humano.SPECIAL[1]=Humano.SPECIAL[1]+add.getP();
	 Humano.SPECIAL[2]=Humano.SPECIAL[2]+add.getE();
	 Humano.SPECIAL[3]=Humano.SPECIAL[3]+add.getC();
	 Humano.SPECIAL[4]=Humano.SPECIAL[4]+add.getI();
	 Humano.SPECIAL[5]=Humano.SPECIAL[5]+add.getA();
	 Humano.SPECIAL[6]=Humano.SPECIAL[6]+add.getL();
	 
	}
	
	public boolean foundObject(Human Humano) {
		int option;
		option= (int)Math.round(Math.random()*19);
		if(option>=0 && option<=9) {
			return true;
		}
		else if(option==10) {
			if(Humano.SPECIAL[1]>=1) {return true;}
			else {return false;}
		}
		else if(option==11) {
			if(Humano.SPECIAL[1]>=2) {return true;}
			else {return false;}
		}
		else if(option==12) {
			if(Humano.SPECIAL[1]>=3) {return true;}
			else {return false;}
		}
		else if(option==13) {
			if(Humano.SPECIAL[1]>=4) {return true;}
			else {return false;}
		}
		else if(option==14) {
			if(Humano.SPECIAL[1]>=5) {return true;}
			else {return false;}
		}
		else if(option==15) {
			if(Humano.SPECIAL[1]>=6) {return true;}
			else {return false;}
		}
		else if(option==16) {
			if(Humano.SPECIAL[1]>=7) {return true;}
			else {return false;}
		}
		else if(option==17) {
			if(Humano.SPECIAL[1]>=8) {return true;}
			else {return false;}
		}
		else if(option==18) {
			if(Humano.SPECIAL[1]>=9) {return true;}
			else {return false;}
		}
		else if(option==19) {
			if(Humano.SPECIAL[1]>=10) {return true;}
			else {return false;}
		}
		else {return false;}
	}
	
	public int totalDmg(Gun gun) {
		return gun.getFisicDmg()+gun.getEnergyDmg()+gun.getRadDmg();
	}
	
	public boolean run(Human Humano) {
		int option;
		option= (int)Math.round(Math.random()*9);
		if(Humano.SPECIAL[3]==0) {
			return false;
		}
		else if(option==0) {
			if(Humano.SPECIAL[3]>=1) {return true;}
			else {return false;}
		}
		else if(option==1) {
			if(Humano.SPECIAL[3]>=2) {return true;}
			else {return false;}
		}
		else if(option==2) {
			if(Humano.SPECIAL[3]>=3) {return true;}
			else {return false;}
		}
		else if(option==3) {
			if(Humano.SPECIAL[3]>=4) {return true;}
			else {return false;}
		}
		else if(option==4) {
			if(Humano.SPECIAL[3]>=5) {return true;}
			else {return false;}
		}
		else if(option>=5){
			return false;
		}
		else{return false;}
	}
	
	public boolean critic(Human Humano) {
		int option;
		option= (int)Math.round(Math.random()*9);
		if(Humano.SPECIAL[6]==0) {
			return false;
		}
		else if(option==0) {
			if(Humano.SPECIAL[6]>=1) {return true;}
			else {return false;}
		}
		else if(option==1) {
			if(Humano.SPECIAL[6]>=2) {return true;}
			else {return false;}
		}
		else if(option==2) {
			if(Humano.SPECIAL[6]>=3) {return true;}
			else {return false;}
		}
		else if(option==3) {
			if(Humano.SPECIAL[6]>=4) {return true;}
			else {return false;}
		}
		else if(option==4) {
			if(Humano.SPECIAL[6]>=5) {return true;}
			else {return false;}
		}
		else if(option==5) {
			if(Humano.SPECIAL[6]>=6) {return true;}
			else {return false;}
		}
		else if(option==6) {
			if(Humano.SPECIAL[6]>=7) {return true;}
			else {return false;}
		}
		else if(option==7) {
			if(Humano.SPECIAL[6]>=8) {return true;}
			else {return false;}
		}
		else if(option==8) {
			if(Humano.SPECIAL[6]>=9) {return true;}
			else {return false;}
		}
		else if(option==9) {
			if(Humano.SPECIAL[6]>=10) {return true;}
			else {return false;}
		}
		else {return false;}
	}
}
