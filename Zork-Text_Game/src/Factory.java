
public class Factory implements IFactory {
	
	@Override
	public Enemy CreateEnemy(String name, String Type, double Health, int FisicDmg, int EnergyDmg, int RadDmg,String Description) {
		return new Enemy(name, Type, Health, FisicDmg, EnergyDmg, RadDmg,Description);
	}

	@Override
	public Gun CreateGun(String name, int FisicDmg, int EnergyDmg, int RadDmg, int FisicAmmoCost, int EnergyAmmoCost,int RadAmmoCost) {
		return new Gun( name,FisicDmg,EnergyDmg,RadDmg,FisicAmmoCost,EnergyAmmoCost,RadAmmoCost);
	}

	@Override
	public Armor CreateArmor(String name, int FisicDefend, int EnergyDefend, int RadDefend) {
		return new Armor(name,FisicDefend,EnergyDefend,RadDefend);
	}
}
