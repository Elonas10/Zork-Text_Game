import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Historia
		
		System.out.println("Una gran guerra nuclear destruyo todo el mundo,quedando solo una superficie  llena \nde radiacion y  escombros de lo que antes eran grandes ciudades de la humanidad.");
		System.out.println("");
		System.out.println("Afortunadamente el gobierno de los Estados Unidos creo cientos de los llamados \nVaults (refugios),bunkeres extremadamente grandes y complejos, los cuales pueden \nalbergar a una cantidad significativa de personas,salvandolas de las explosiones \nnucleares de la superficie.");
		System.out.println("");
		System.out.println("Tu fuiste una de las personas que pudo entrar a uno de estos refugios, Al llegar \naqui te dan un traje especialmente hecho para protegerte de la radiacion y con \nun numero en la parte trasera del traje que indica el refugio en donde te encuentras\n,la persona de mas alto rango lleva a todas las personas del refugio a una camara \ncriogenica,para despertar en un futuro en el que la radiacion ya a desaparecido.");
		System.out.println("");
		System.out.println("(300 AÑOS DESPUES)");
		System.out.println("");
		System.out.println("Despiertas de tu sueño criogenico,pero algo esta mal, las personas no estan en sus \ncapsulas,hay gente muerta en el suelo,encuentras una Pistola de 10mm,observas que la \npuerta del refugio esta abierta y sales en busca de respuestas....");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Human Humano = new Human();
		
		
		
		//Colocando los Atributos del personaje
		
		for(int i=0;i<=6;i++) {
			Humano.SPECIAL[i]=0;
		}
		
		Human.SPECIAL(Humano);
		
		
		//HUD del personaje
		Humano.Armor_list.add(new Armor("Traje de Vaul-Tec (111)",1,1,1,3));
		Humano.Max_Weigh=50+ (10*Humano.SPECIAL[0]);
		Humano.Max_Health=100 + (10*Humano.SPECIAL[2]);
		Humano.Health=100 + (10*Humano.SPECIAL[2]);
		Humano.Rad=0;
		Human.HUD(Humano);
	}
}