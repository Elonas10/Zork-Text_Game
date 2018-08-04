
public class Add extends Entity{

	private String Name;
	private int CureH;
	private int CureR;
	private int Rad;
	private int S;
	private int P;
	private int E;
	private int C;
	private int I;
	private int A;
	private int L;
	
	public Add(String name,int CureH,int CureR,int Rad,int S,int P,int E,int C,int I,int A,int L) {
		this.Name=name;
		this.CureH=CureH;
		this.CureR=CureR;
		this.Rad=Rad;
		this.S=S;
		this.P=P;
		this.E=E;
		this.C=C;
		this.I=I;
		this.A=A;
		this.L=L;
	}

	public String getName() {return this.Name;}
	public int getCureH() {return this.CureH;}
	public int getCureR() {return this.CureR;}
	public int getRad() {return this.Rad;}
	public int getS() {return this.S;}
	public int getP() {return this.P;}
	public int getE() {return this.E;}
	public int getC() {return this.C;}
	public int getI() {return this.I;}
	public int getA() {return this.A;}
	public int getL() {return this.L;}
	public String getType() {return this.getClass().getSimpleName();}

	@Override
	public int getFisicDmg() {return 0;}

	@Override
	public int getEnergyDmg() {return 0;}

	@Override
	public int getRadDmg() {return 0;}

	@Override
	public int getFisicAmmoCost() {return 0;}

	@Override
	public int getEnergyAmmoCost() {return 0;}

	@Override
	public int getRadAmmoCost() {return 0;}

	@Override
	public int getFusionCoreCost() {return 0;}

	@Override
	public int getNukeCost() {return 0;}

	@Override
	public int getWeigh() {return 0;}

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
}	
	
