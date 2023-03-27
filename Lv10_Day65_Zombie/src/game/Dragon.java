package game;

import java.util.Random;

public class Dragon extends Monsters {
	public Dragon(int position, String name, int max) {
		super(position, name, max);
		// TODO Auto-generated constructor stub
	}

	Random ran = new Random();
	public int shield;
	
	public void attack(Unit unit){
		
	}
	
	public void setShield(int value) {
		shield = value;
	}
	
	public int getShield() {
		return this.shield;
	}
	
	
}
