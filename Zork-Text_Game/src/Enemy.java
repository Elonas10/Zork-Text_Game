
public class Enemy implements IEnemy {
	
	private String Name;
	private String EnemyType; 
	private double Health;
	private int FisicDmg;
	private int EnergyDmg;
	private int RadDmg;
	private String Description;
	
	public Enemy(String name,String Type,double health,int FDmg,int EDmg,int RDmg,String Description){
		this.Name=name;
		this.EnemyType=Type;
		this.Health=health;
		this.FisicDmg=FDmg;
		this.EnergyDmg=EDmg;
		this.RadDmg=RDmg;
		this.Description=Description;
		
	}
	
	@Override
	public String getName() {
		
		return this.Name;
	}

	@Override
	public String getEnemyType() {
		
		return this.EnemyType;
	}

	@Override
	public double getHealth() {
		
		return this.Health;
	}

	@Override
	public int getFisicDmg() {
		
		return this.FisicDmg;
	}

	@Override
	public int getEnergyDmg() {
		
		return this.EnergyDmg;
	}

	@Override
	public int getRadDmg() {
		
		return this.RadDmg;
	}

	@Override
	public String getDescription() {
		
		return this.Description;
	}
}
