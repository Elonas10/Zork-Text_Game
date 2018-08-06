

public class Box implements Visited {

	    private Entity Gun, Armor,Enemy,Add;
	    private int FAmmo,EAmmo,RAmmo,NAmmo,FCAmmo;

	    public Box(Entity Armor, Entity Gun, Entity Enemy, Entity Add,int FAmmo,int EAmmo,int RAmmo,int Nammo,int FCAmmo){
	        this.Armor = Armor;
	        this.Gun = Gun;
	        this.Enemy = Enemy;
	        this.Add = Add;
	        this.FAmmo=FAmmo;
	        this.EAmmo=EAmmo;
	        this.RAmmo=RAmmo;
	        this.NAmmo=Nammo;
	        this.FCAmmo=FCAmmo;
	    }


	    public Human accept(Visitor v) {
	        return v.visit(this, (Human) v);
	    }

	    public Entity getArmor() { return this.Armor; }
	    public Entity getGun() { return this.Gun; }
	    public Entity getEnemy() { return this.Enemy; }
	    public Entity getAdd() { return this.Add; }
	    public int getFAmmo() {return this.FAmmo;}
	    public int getEAmmo() {return this.EAmmo;}
	    public int getRAmmo() {return this.RAmmo;}
	    public int getNAmmo() {return this.NAmmo;}
	    public int getFCAmmo() {return this.FCAmmo;}
	    
	    
	    public void setArmor(Entity Armor) {this.Armor = Armor;}
	    public void setGun(Entity Gun) {this.Gun = Gun;}
	    public void setEnemy(Entity Enemy) {this.Enemy = Enemy;}
	    public void setAdd(Entity Add) {this.Add = Add;}
	    public int setFAmmo(int FAmmo) {return this.FAmmo=FAmmo;}
	    public int setEAmmo(int EAmmo) {return this.EAmmo=EAmmo;}
	    public int setRAmmo(int RAmmo) {return this.RAmmo=RAmmo;}
	    public int setNAmmo(int NAmmo) {return this.NAmmo=NAmmo;}
	    public int setFCAmmo(int FCAmmo) {return this.FCAmmo=FCAmmo;}
	}