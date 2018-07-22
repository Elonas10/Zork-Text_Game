
public interface IFactory {

	public Enemy CreateEnemy(String name,String Type,double Health,int FisicDmg,int EnergyDmg ,int RadDmg,String Description );
	public Gun CreateGun(String name,int FisicDmg, int EnergyDmg,int RadDmg,int FisicAmmoCost,int EnergyAmmoCost,int RadAmmoCost);
	public Armor CreateArmor(String name,int FisicDefend,int EnergyDefend,int RadDefend);
	
}
