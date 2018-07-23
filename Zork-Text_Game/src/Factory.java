
public class Factory implements IFactory {
	
	@Override
	public Enemy CreateEnemy(String name, String Type, double Health, int FisicDmg, int EnergyDmg, int RadDmg,int Xp,String Description) {
		return new Enemy(name, Type, Health, FisicDmg, EnergyDmg, RadDmg,Xp,Description);
	}

	@Override
	public Gun CreateGun(String name, int FisicDmg, int EnergyDmg, int RadDmg, int FisicAmmoCost, int EnergyAmmoCost,int RadAmmoCost,int Weigh) {
		return new Gun( name,FisicDmg,EnergyDmg,RadDmg,FisicAmmoCost,EnergyAmmoCost,RadAmmoCost,Weigh);
	}

	@Override
	public Armor CreateArmor(String name, int FisicDefend, int EnergyDefend, int RadDefend,int Weigh) {
		return new Armor(name,FisicDefend,EnergyDefend,RadDefend,Weigh);
	}
}
