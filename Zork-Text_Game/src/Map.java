
public class Map {
	private Box[][] Map=new Box[Main.X][Main.Y];
	Enemy Boss=new Enemy("Frank Horrigan",3000,50,0,0,20,"Lider de la faccion del enclave, el fue quien destruyo el refugio donde estabas tu y las unicas personas en las que podias confiar");
	public void createMap() {
		
		for(int y=0;y<Main.Y;y++){
			for(int x=0;x<Main.X;x++){
				int option= (int)Math.round(Math.random()*10);
				if(x==0 && y==0) {Map[x][y]= new Box(null,null,null,null,0,0,0,0,0);}
				else if(x==Main.X-1 && y==Main.Y-1) {Map[x][y]= new Box(null,null,Boss,null,0,0,0,0,0);}
				else if(option==1 || option==2|| option ==3){Map[x][y]= new Box(null,null,null,null,0,0,0,0,0);}
				else if(option==4){Map[x][y]= new Box(Factory.getEntity("Armor"),null,null,null,0,0,0,0,0);}
				else if(option==5){Map[x][y]= new Box(null,Factory.getEntity("Gun"),null,null,0,0,0,0,0);}
				else if(option==6 ){Map[x][y]= new Box(null,null,Factory.getEntity("Enemy"),null,0,0,0,0,0);}
				else if(option==7){Map[x][y]= new Box(null,null,Factory.getEntity("Enemy"),null,0,0,0,0,0);}
				else if(option==8){Map[x][y]= new Box(null,null,null,Factory.getEntity("Add"),0,0,0,0,0);}
				else if(option==9){Map[x][y]= new Box(null,null,null,null,30,30,30,0,0);}
				else if(option==0){Map[x][y]= new Box(null,null,null,null,0,0,0,1,0);}
				else if(option==10){Map[x][y]= new Box(null,null,null,null,0,0,0,0,1);}		
				}
			}
		}
	
	public Box getBox(int x,int y) {return Map[x][y];}
	}

