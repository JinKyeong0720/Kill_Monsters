package game;

import java.util.Random;

public class Monsters extends Unit{

	public int power;
	
//	public Monsters(int position, int hp,int max) {
//		super(position, hp, max);
//	}
	public Monsters(int position, String name, int hp,int max) {
		super(position, name, hp, max);
	}


	public Monsters(int position, String name, int max) {
		super(position, name, max);
	}


	interface Attactable{}
	
	public void attack(Attactable attack) {
		if(attack instanceof Monsters) {
			Random ran = new Random();
			
		}
	}
	
	public void attack(Unit unit){
		
	}
}
