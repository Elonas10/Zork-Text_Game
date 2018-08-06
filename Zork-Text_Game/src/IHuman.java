
public interface IHuman extends Visitor{

	public void showAllGun();
	public void showGunNames();
	public void showGun(int option);
	public void showAllArmor();
	public void showArmorNames() ;
	public void showArmor(int option) ;
	public void showAllAdd();
	public void showAdd(int option);
	public void showAddNames();
	public int TotalWeigh();
	public double applyRad(double Max_H,double Rad);
	Human visit(Box box, Human Humano);
}
