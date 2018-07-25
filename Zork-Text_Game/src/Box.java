import java.util.ArrayList;

public class Box {
	String Dialoge;
	ArrayList<Gun> Gun_list= new ArrayList<Gun>();
	ArrayList<Armor> Armor_list= new ArrayList<Armor>();
	ArrayList<Enemy> Enemy_list= new ArrayList<Enemy>();
	
	public Box() {
		
	}

	public  Box(Gun G) {
		this.Gun_list.add(G);
	}
}
