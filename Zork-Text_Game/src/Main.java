import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Factory Fabrica=new Factory();
		Gun Arma=Fabrica.CreateGun("Pistola de 10mm", 10, 0, 0, 1, 0, 0,5);
		Gun Arma1=Fabrica.CreateGun("Rifle Laser", 0, 30, 0, 0, 5, 0, 10);
		Gun Arma2=Fabrica.CreateGun("Pistola de tubo", 7, 0, 0, 2, 0, 0, 3);
		Gun Arma3=Fabrica.CreateGun("Rifle de rayos Gama", 0, 0, 30, 0, 0, 5, 10);
		Armor Armadura=Fabrica.CreateArmor("Traje de Vault-Tec (111)", 0, 0, 5,5);
		Armor Armadura1=Fabrica.CreateArmor("Armadura de Saqueador", 5, 0, 0,8);
		Armor Armadura2=Fabrica.CreateArmor("Armadura de cuero", 0, 5, 0,7);
		Scanner a=new Scanner(System.in);
		
		Human Humano = new Human();
		for(int i=0;i<=6;i++) {
			Humano.SPECIAL[i]=0;
		}
		System.out.println("Es hora de saber que te hace SPECIAL, tienes 10 puntos de habilidad para tus atributos");
		System.out.println("");
		int Lvs=10;
		do {
			
			System.out.println("");
			System.out.println("Escoje un atributo:                 Tienes "+ Lvs+" puntos de habilidad");
			 System.out.println("");
		    System.out.println("Cada Atributo tiene un maximo de 10 puntos");
		    System.out.println("");
			System.out.println("   1- FUERZA (" + Humano.SPECIAL[0] +"): La FUERZA hace que puedas llevar mas cosas contigo (+10 al Peso Maximo por nivel) \n   y causas mas daño con tus puños ( +2 al daño de los puños por nivel)  ");
			System.out.println("");
			System.out.println("   2- PERCEPCION (" + Humano.SPECIAL[1] +"): Mientras mas PERCEPCION tengas mas facil es encontrar objetos en el yermo(+0.05% de encontrar objetos por nivel)");
			System.out.println("");
			System.out.println("   3- RESISTENCIA (" + Humano.SPECIAL[2] +"): La RESISTENCIA aumenta la salud de tu personaje(+10 de salud maxima por nivel)");
			System.out.println("");
			System.out.println("   4- CARISMA (" + Humano.SPECIAL[3] +"): La CARISMA hace que tu personaje pueda dialogar con los habitantes del yermo y \n   domesticar a bestias para que te dejen en paz (+0.05% de exito al hablar por nivel ");
			System.out.println("");
			System.out.println("   5- INTELIGENCIA (" + Humano.SPECIAL[4] +"):La INTELIGENCIA hace que consigas mas experiencia al vencer a un enemigo(+2 de experiencia por enemigo por nivel)");
			System.out.println("");
			System.out.println("   6- AGILIDAD (" + Humano.SPECIAL[5] +"): La AGILIDAD aumenta el daño que causas con armas -menos los puños- (+0.1% de daño con armas por nivel");
			System.out.println("");
			System.out.println("   7- SUERTE (" + Humano.SPECIAL[6] +"): La SUERTE aumenta la probabildad de que tu proximo ataque sea \n   golpe critico (+0.1% de probabilidad de golpe critico por nivel");
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
		
		
		Humano.Max_Health=100;
		Humano.Health=100;
		Humano.Rad=20;
		System.out.println("Vida: " + Humano.applyRad(Humano.Max_Health,Humano.Rad));
		
		Humano.Gun_list.add(Arma);
		Humano.Gun_list.add(Arma1);
		Humano.Gun_list.add(Arma2);
		Humano.Gun_list.add(Arma3);
		Humano.Armor_list.add(Armadura);
		Humano.Armor_list.add(Armadura1);
		Humano.Armor_list.add(Armadura2);
		
		for(int i=0;i<Humano.Gun_list.size();i++) {
		Humano.showGun(Humano.Gun_list.get(i));
		}
		for(int i=0;i<Humano.Armor_list.size();i++) {
			Humano.showArmor(Humano.Armor_list.get(i));
			}
}
}