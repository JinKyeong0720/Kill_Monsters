package game;

import java.util.Random;

public class Dragon extends Monsters {
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
	
	public Dragon(){
		super(500, 0, 16);
//		this.shield = shield;
	}
}
