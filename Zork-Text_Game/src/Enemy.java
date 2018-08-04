
public class Enemy extends Entity {
	
	private String Name;
	private double Health;
	private int FisicDmg;
	private int EnergyDmg;
	private int RadDmg;
	private int Xp;
	private int FisicC;
	private int EnergyC;
	private int RadC;
	private String Description;
	
	public Enemy(String name,double health,int FDmg,int EDmg,int RDmg,int Xp,int FisicC,int EnergyC,int RadC,String Description){
		this.Name=name;
		this.Health=health;
		this.FisicDmg=FDmg;
		this.EnergyDmg=EDmg;
		this.RadDmg=RDmg;
		this.Description=Description;
		this.Xp=Xp;
		this.FisicC=FisicC;
		this.EnergyC=EnergyC;
		this.RadC=RadC;
	}
	
	public String getName() {return this.Name;}
	public double getHealth() {return this.Health;}
	public int getFisicDmg() {return this.FisicDmg;}
	public int getEnergyDmg() {return this.EnergyDmg;}
	public int getRadDmg() {return this.RadDmg;}
	public String getDescription() {return this.Description;}
	public String getType() {return this.getClass().getSimpleName();}

	@Override
	public int getFisicAmmoCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEnergyAmmoCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadAmmoCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFusionCoreCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNukeCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWeigh() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFisicDefend() {
		// TODO Auto-generated method stub
		return 0;
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
