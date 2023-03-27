package game;


public class Hero extends Unit{
	public Hero(int position, String name, int max) {
		super(position, name, max);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	}
	interface Recoverable{}
	int power;
	int count;
	
//	public Hero() {
//		super(position, hp, max);
//		this.count = count;
//	}
//	
//	
//	public void attack(Unit enemy) {
//		if(enemy instanceof Monsters) {
//			Monsters monsters = (Monsters)enemy;
//			power = ran.nextInt(max)+1;
//			if(monsters.)
//		}
//	}
	
	public void recovery(Recoverable recover) {
		if(recover instanceof Hero) {
			Hero target = (Hero) recover;
			
			while(target.getHp() < target.getMAX_HP()) {
				target.setHp(target.getHp() + 1);
				System.out.printf("%s 회복 중 . . . [hp : %d / %d]", target.getName(), target.getHp(), target.MAX_HP);
				try {
					Thread.sleep(200);
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
			System.out.println("회복 끝 !");
		}
	}
}
