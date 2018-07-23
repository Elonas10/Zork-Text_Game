
public interface IFactory {

	public Enemy CreateEnemy(String name,String Type,double Health,int FisicDmg,int EnergyDmg ,int RadDmg,int Xp,String Description );
	public Gun CreateGun(String name,int FisicDmg, int EnergyDmg,int RadDmg,int FisicAmmoCost,int EnergyAmmoCost,int RadAmmoCost,int Weigh);
	public Armor CreateArmor(String name,int FisicDefend,int EnergyDefend,int RadDefend,int Weigh);
	
}
