
public class Armor implements IArmor {

	private String Name;
	private int FisicDefend;
	private int EnergyDefend;
	private int RadDefend;
	private int Weigh;
	
	public Armor(String name, int FDefend,int EDefend,int RDefend,int Weigh) {
		this.Name=name;
		this.FisicDefend=FDefend;
		this.EnergyDefend=EDefend;
		this.RadDefend=RDefend;
		this.Weigh=Weigh;
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
	@Override
	public int getWeigh() {
		return this.Weigh;
	}
	
}
