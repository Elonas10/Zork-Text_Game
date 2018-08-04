
public class Gun extends Entity {

	private String Name;
	private int FisicDmg;
	private int EnergyDmg;
	private int RadDmg;
	private int FisicAmmoCost;
	private int EnergyAmmoCost;
	private int RadAmmoCost;
	private int FusionCoreCost;
	private int NukeCost;;
	private int Weigh;
	
	public Gun(String name,int FisicDmg, int EnergyDmg,int RadDmg,int FisicAmmoCost,int EnergyAmmoCost,int RadAmmoCost,int NukeCost ,int FusionCoreCost,int Weigh){
		this.Name=name;
		this.FisicDmg=FisicDmg;
		this.EnergyDmg=EnergyDmg;
		this.RadDmg=RadDmg;
		this.FisicAmmoCost=FisicAmmoCost;
		this.EnergyAmmoCost=EnergyAmmoCost;
		this.RadAmmoCost=RadAmmoCost;
		this.FusionCoreCost=FusionCoreCost;
		this.NukeCost=NukeCost;
		this.Weigh=Weigh;
	}

	public String getName() {return this.Name;}
	public int getFisicDmg() {return this.FisicDmg;}
	public int getEnergyDmg() {return this.EnergyDmg;}
	public int getRadDmg() {return this.RadDmg;}
	public int getFisicAmmoCost() {return this.FisicAmmoCost;}
	public int getEnergyAmmoCost() {return this.EnergyAmmoCost;}
	public int getRadAmmoCost() {return this.RadAmmoCost;}
	public int getFusionCoreCost() {return this.FusionCoreCost;}
	public int getNukeCost() {return this.NukeCost;}
	public int getWeigh() {return this.Weigh;}
	public String getType() {return this.getClass().getSimpleName();}

	@Override
	public int getFisicDefend() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setDmg(int n) {
		this.FisicDmg=n;
	}

	@Override
	public int getEnergyDefend() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadDefend() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCureH() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCureR() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getS() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getE() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getC() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getI() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getL() {
		// TODO Auto-generated method stub
		return 0;
	}
}
