
public class Attributes {
	public static Gun randomGun() {
	   int option= (int)Math.round(Math.random()*33);
	   if(option==6 || option==1 || option==2) {return new Gun("Pistola de tubo",6,0,0,1,0,0,0,0,3);}
	   else if(option==3 || option==4 || option==5) {return new Gun("Pistola de 10mm",10,0,0,2,0,0,0,0,4);}
	   else if(option==9|| option==7 || option==8) {return new Gun("Rifle de asalto",20,0,0,5,0,0,0,0,10);}
	   else if(option==30|| option==31 || option==32) {return new Gun("Escopeta de doble cañon",25,0,0,5,0,0,0,0,13);}
	   else if(option==17|| option==10) {return new Gun("Ametraladora",100,0,0,20,0,0,0,0,25);}
	   else if(option==11 || option==12 || option==25) {return new Gun("Pistola laser",0,10,0,0,1,0,0,0,4);}
	   else if(option==13 || option==14 || option==28) {return new Gun("Rifle laser",0,25,0,0,5,0,0,0,10);}
	   else if(option==15 || option==16 || option==29) {return new Gun("Mosquete Laser",0,50,0,0,10,0,0,0,5);}
	   else if(option==0 || option==18) {return new Gun("Ametralladora Laser",0,150,0,0,0,0,0,1,25);}
	   else if(option==19 || option==20 || option==26) {return new Gun("Pistola Gamma",0,0,15,0,0,1,0,0,15);}
	   else if(option==21 || option==22) {return new Gun("Rifle Gamma",0,0,25,0,0,5,0,0,10);}
	   else if(option==23 || option==24) {return new Gun("Rifle de Plasma",25,25,25,5,5,5,0,0,15);}
	   else if(option==33) {return new Gun("Fat-Man",0,0,1000,0,0,0,1,0,30);}
	   else {return null;}
	}
	public static Armor randomArmor() {
		int option= (int)Math.round(Math.random()*21);
		if(option==1 || option==2 || option==3 || option==4) {return new Armor("Armadura de saqueador",2,0,0,3);}
		else if(option==5 || option==6 || option==7 || option==8) {return new Armor("Armadura de cuero",0,2,0,2);}
		else if(option==9 || option==10 || option==11) {return new Armor("Armadura reforsada",5,0,0,4);}
		else if(option==19 || option==20 ) {return new Armor("Armadura aislante",2,10,0,5);}
		else if(option==12 || option==13) {return new Armor("Armadura Synth",8,5,0,6);}
		else if(option==14) {return new Armor("Armadura de la B.O.S",10,7,0,8);}
		else if(option==15 || option==16) {return new Armor("Capucha de los hijos del atomo",0,3,10,6);}
		else if(option==17) {return new Armor("Traje Hazmat",0,0,100,10);}
		else if(option==18) {return new Armor("Coraza Mirelurk",10,0,6,9);}
		else if(option==21) {return new Armor("Armadura del Enclave",10,10,10,12);}
		else if(option==0) {return new Armor("Armadura del Lobo solitario",15,15,15,10);}
		else{return null;}
	}
	public static Enemy randomEnemy() {
		int option= (int)Math.round(Math.random()*35);
		if(option==1 || option==2 || option==3 || option==4) {return new Enemy("Saqueador",10,8,0,0,3,0,1,1,"'Humano con los instintos de un animal,solo vive para matar y robar' /nDebil contra las armas de radiacion y de energia");}
		else if(option==5 || option==6 || option==7 || option==8) {return new Enemy("Mutaracha",5,5,0,0,2,1,0,0,"'Cucaracha que muto por la radiacion del yermo,ahora es una criatura /ndel tamaño de un perro que lo unico que quiere es comer'/nDebil contra las armas Fisicas");}
		else if(option==9 || option==10 || option==11 || option==12) {return new Enemy("Flotador",5,0,0,5,3,1,0,0,"'Mosca gigante,escupe una sustancia muy radioactiva'/nDebil contra las armas Fisicas");}
		else if(option==13 || option==14 || option==15) {return new Enemy("Artillero",20,10,0,0,5,0,1,1,"'Humano que pertenece a la faccion de los 'Artilleros', una faccion de mercenarios organizada del yermo /nmuchas veces matan a otras personas para quitarle sus cosas o para practicar su punteria'/nDebil contra las armas de radiacion y de energia");}
		else if(option==16 || option==17 || option==18) {return new Enemy("Necrofago",20,5,0,5,6,1,0,0,"'Zombies del yermo que una vez fueron humanos, la radiacion les causo /ndeformaciones en el cuerpo y perder su uso de razon,contienen mucha radiacion en sus cuerpos, cuando ve un ser vivo lo ataca para comerselo'/nDebil contra las armas Fisicas");}
		else if(option==19 || option==20 || option==21) {return new Enemy("Saqueador Veterano",25,10,0,0,7,0,1,1,"'Saqueador experimentado del yermo, ha pasado por tantas matansas y saqueos que se ha convertido en una maquina de matar'/nDebil contra las armas de radiacion y de energia");}
		else if(option==22 || option==23 || option==24) {return new Enemy("Protectron",20,10,12,0,8,1,0,0,"Robot creado antes de la gran guerra para servir a la humanidad,con el paso de los años/ny la radiacion afecto a su sistema, ahora solo mata lo que ve /nDebil contra las armas Fisicas");}
		else if(option==25 || option==26) {return new Enemy("Super Mutante",30,15,0,0,10,0,1,0,"Humano que fue mutado geneticamente por el virus V.E.F,Ahora es una masa de puro musculo y sin cerebro,Esta raza se cree superior a las demas,para el tu eres otra mutaracha mas /nDebil contra las armas de Energia");}
		else if(option==27 || option==28) {return new Enemy("Synth",30,0,15,0,10,1,0,0,"Androide creado por una organizacion misteriosa del yermo, estos androides/n matan o capturan por ordenes de sus creadores/nDebil contra las armas Fisicas");}
		else if(option==27 || option==28) {return new Enemy("Lider Saqueador",35,0,15,0,14,0,0,0,"Saqueador muy poderoso que es lider de bandas de saqueadores /nNo tiene Ninguna debilidad");}
		else if(option==27 || option==28) {return new Enemy("Hijo del atomo",35,0,0,15,14,0,0,0,"Humano que pertenece a la faccion del 'Atomo', creen que la /nradiacion es una bendicion y que los va a salvar de la muerte,si no eres de su faccion eres un enemigo para ellos /nNo tiene Ninguna debilidad");}
		else if(option==29 || option==30) {return new Enemy("Mirelurk",50,10,0,0,14,0,0,0,"Cangrejo mutado por la radiacion, posee un caparazon que lo hace resistente contra todo tipo de armas /nNo tiene ninguna debilidad");}
		else if(option==31) {return new Enemy("Soldado del Enclave",50,10,10,0,20,0,0,0,"??????");}
		else if(option==32) {return new Enemy("Lider Artillero",40,10,10,0,18,0,0,0,"Lider de un escuadron de artilleros,han quitato incontables vidas y no le tienen miedo a nada/nNo tiene ninguna debilidad");}
		else if(option==33) {return new Enemy("Asaltron",50,0,20,0,20,0,0,20,"Robot creado para propositos militares, al igual que los protectrones,no tienen razon de ser alguna solo destruir la vida/nNo tiene ninguna debilidad");}
		else if(option==34) {return new Enemy("Yao-Guai",60,10,0,10,18,0,0,25,"Oso sin pelo que casi a duplicado su tamaño debido a la radiacion/nNo tiene ninguna debilidad");}
		else if(option==0) {return new Enemy("Sanguinario",100,30,0,0,30,1,0,0,"Lagartija que muto por efecto de la radiacion del yermo,ahora es practicamente/n un dinosaurio en vida,son extremadamente salvajes y sedientos de sangre/nDebilidad contra las armas Fisicas");}
		else if(option==35) {return new Enemy("Behemoth",150,20,0,0,40,0,0,0,"Los Behemoths son los titanes del yermo, son criaturas que vienen de la especie de los supermutantes, pero estos miden 5 metros de altura, si uno te ve lo mas probable es que mueras/nNo tiene ninguna debilidad");}
		else {return null;}
	}
	public static Add randomAdd() {
		int option= (int)Math.round(Math.random()*26);
		if(option==1 ||option==2||option==3||option==4) {return new Add("Stimpack",30,0,0,0,0,0,0,0,0,0);}
		else if(option==5 ||option==6||option==7||option==8||option==9) {return new Add("Agua purificada",15,0,0,0,0,0,0,0,0,0);}
		else if(option==10 ||option==11||option==12||option==13) {return new Add("RadAway",0,40,0,0,0,0,0,0,0,0);}
		else if(option==14 ||option==15||option==16||option==17||option==18) {return new Add("Nuka-cola",15,0,2,0,0,0,0,0,0,0);}
		else if(option==19 ||option==20||option==21) {return new Add("Nuka-cola Quantum",50,0,5,0,0,0,0,0,0,0);}
		else if(option==0 ||option==22) {return new Add("Psicho",-10,0,0,1,0,0,0,0,0,0);}
		else if(option==26 ||option==23) {return new Add("Jet",-10,0,0,0,0,0,0,0,1,0);}
		else if(option==24 ||option==25) {return new Add("Buffout",-10,0,0,0,0,1,0,0,0,0);}
		else {return null;}
	}
}
