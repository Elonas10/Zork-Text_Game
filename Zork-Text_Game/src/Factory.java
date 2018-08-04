
public class Factory{
	
	public static Entity getEntity(String Type) {
		if(Type.equalsIgnoreCase("Gun")) {return Attributes.randomGun();}
		else if(Type.equalsIgnoreCase("Armor")) {return Attributes.randomArmor();}
		else if(Type.equalsIgnoreCase("Enemy")) {return Attributes.randomEnemy();}
		else if(Type.equalsIgnoreCase("Add")) {return Attributes.randomAdd();}
		return null;
	}
}
		
	
