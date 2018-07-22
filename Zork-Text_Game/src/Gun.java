
public class Gun {

	private String Name;
	private int FisicDmg;
	private int EnergyDmg;
	private int RadDmg;
	private int FisicAmmoCost;
	private int EnergyAmmoCost;
	private int RadAmmoCost;
	
	public Gun(String name,int FisicDmg, int EnergyDmg,int RadDmg,int FisicAmmoCost,int EnergyAmmoCost,int RadAmmoCost){
		this.Name=name;
		this.FisicDmg=FisicDmg;
		this.EnergyDmg=EnergyDmg;
		this.RadDmg=RadDmg;
		this.FisicAmmoCost=FisicAmmoCost;
		this.EnergyAmmoCost=EnergyAmmoCost;
		this.RadAmmoCost=RadAmmoCost;
	}
	
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.Name;
	}

	
	public int getFisicDmg() {
		// TODO Auto-generated method stub
		return this.FisicDmg;
	}

	
	public int getEnergyDmg() {
		// TODO Auto-generated method stub
		return this.EnergyDmg;
	}

	
	public int getRadDmg() {
		// TODO Auto-generated method stub
		return this.RadDmg;
	}

	
	public int getFisicAmmoCost() {
		// TODO Auto-generated method stub
		return this.FisicAmmoCost;
	}

	
	public int getEnergyAmmoCost() {
		// TODO Auto-generated method stub
		return this.EnergyAmmoCost;
	}

	
	public int getRadAmmoCost() {
		// TODO Auto-generated method stub
		return this.RadAmmoCost;
 }
	
}
