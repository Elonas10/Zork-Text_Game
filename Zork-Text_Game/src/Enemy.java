
public class Enemy extends Entity {
	
	private String Name;
	private double Health;
	private int FisicDmg;
	private int EnergyDmg;
	private int RadDmg;
	private int Xp;
	private String Description;
	
	public Enemy(String name,double health,int FDmg,int EDmg,int RDmg,int Xp,String Description){
		this.Name=name;
		this.Health=health;
		this.FisicDmg=FDmg;
		this.EnergyDmg=EDmg;
		this.RadDmg=RDmg;
		this.Description=Description;
		this.Xp=Xp;
	}
	
	public String getName() {return this.Name;}
	public double getHealth() {return this.Health;}
	public double setHealth(double dmg) {return this.Health=this.Health-dmg;}
	public int getFisicDmg() {return this.FisicDmg;}
	public int getEnergyDmg() {return this.EnergyDmg;}
	public int getRadDmg() {return this.RadDmg;}
	public int getXp() {return this.Xp;}
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
