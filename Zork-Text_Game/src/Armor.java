
public class Armor extends Entity {

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
	
	public String getName() {return this.Name;}
	public int getFisicDefend() {return this.FisicDefend;}
	public int getEnergyDefend() {return this.EnergyDefend;}
	public int getRadDefend() {return this.RadDefend;}
	public int getWeigh() {return this.Weigh;}
	public String getType() {return this.getClass().getSimpleName();}

	@Override
	public int getFisicDmg() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEnergyDmg() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadDmg() {
		// TODO Auto-generated method stub
		return 0;
	}

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

	@Override
	public void showAllGun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showGunNames() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showGun(int option) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllArmor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showArmorNames() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showArmor(int option) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllAdd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAdd(int option) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAddNames() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int TotalWeigh() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double applyRad(double Max_H, double Rad) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Human visit(Box box, Human Humano) {
        return super.visit(box, Humano);
    }
}
