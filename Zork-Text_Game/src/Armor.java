
public class Armor implements IArmor {

	private String Name;
	private int FisicDefend;
	private int EnergyDefend;
	private int RadDefend;
	
	public Armor(String name, int FDefend,int EDefend,int RDefend) {
		this.Name=name;
		this.FisicDefend=FDefend;
		this.EnergyDefend=EDefend;
		this.RadDefend=RDefend;
	}
	
	
	@Override
	public String getName() {
		return this.Name;
	}

	@Override
	public int getFisicDefend() {
		return this.FisicDefend;
	}

	@Override
	public int getEnergyDefend() {
		return this.EnergyDefend;
	}

	@Override
	public int getRadDefend() {
		return this.RadDefend;
	}
	
}
