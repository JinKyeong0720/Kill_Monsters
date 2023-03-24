package game;

import java.util.Random;

public class Unit {
	public final int MAX_HP;
	private int position;
	private int hp;
	private String name;
	public int max; //  공격할 수 있는 최대 데미지 크기
	
	Random ran;
	
	
	public Unit(int position, String name, int max) {
		this.MAX_HP = hp;
		this.position = position;
		this.name = name;
		this.max = max;
	}
	
	public Unit (int position, String name, int hp, int max){
		this.position = position;
		MAX_HP = hp;
		this.name = name;
		this.hp = MAX_HP;
		this.max = max;
	}
	
	public void setPosition(int position){
		this.position = position;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getMAX_HP() {
		return MAX_HP;
	}
	
	public int getMax() {
		return max;
	}
	
	public Object getName() {
		return name;
	}
	
	public void move() {
		if(position <= 15) 
			position ++;
		System.out.println(position + " 걸음 째 걷는 중 . . .");
	}

}
