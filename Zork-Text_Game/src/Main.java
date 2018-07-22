
public class Main {
	public static void main(String[] args) {
		Factory Fabrica=new Factory();
		Gun Arma=Fabrica.CreateGun("Pistola de 10mm", 10, 0, 0, 1, 0, 0);
		Enemy Enemigo=Fabrica.CreateEnemy("Sanguinario", "Bestia", 200.0, 20, 0, 0, "Es un tuqueque mutado");
		Armor Armadura=Fabrica.CreateArmor("Traje de Vault-Tec (111)", 0, 0, 5);
		
		
		
		
		System.out.println("Tines una: " + Arma.getName());
		System.out.println("");
		System.out.println("Daño:");
		System.out.println("  Fisico: " + Arma.getFisicDmg());
		System.out.println("  Energia: " + Arma.getEnergyDmg());
		System.out.println("  Radiacion: " + Arma.getRadDmg());
		System.out.println("");
		System.out.println("Esta arma utiliza: " + Arma.getFisicAmmoCost() + " bala");
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("Tienes un: " + Armadura.getName());
		System.out.println("");
		System.out.println("Resistencia:");
		System.out.println("  Fisico: "+Armadura.getFisicDefend());
		System.out.println("  Energia: "+Armadura.getEnergyDefend());
		System.out.println("  Radiacion: "+Armadura.getRadDefend());
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("Observas a un " + Enemigo.getName()+" desde lo lejos");
		System.out.println("");
		System.out.println("Tiene " + Enemigo.getHealth() + " puntos de vida"+" y " + Enemigo.getFisicDmg()+" puntos de daño");
	}
}
