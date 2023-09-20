package AnimalsInterface;

public class Animal implements Climb, Dead, Fly, Swim, Walk {
	
	protected String Name;
	protected String Type;
	private boolean isDead;
	protected String Sound;
	
	public Animal(String name, String type, boolean dead, String sound) {
		this.Name = name;
		this.Type = type;
		this.isDead = dead;
		this.Sound = sound;
	}
	private String getName() {
		return this.Name;
	}
	
	public void Flying() {
		if (!isDead) {
			System.out.println(getName()+" is flying");
		} else {
			System.out.println("this "+getName()+ " is dead dude, you're juste throwing a dead "+getName()+" in the air");
		}
	}
	
	public void Walking() {
		if (!isDead) {
			System.out.println(getName()+" is walking");
		} else {
			System.out.println("this "+getName()+ " is dead dude, you're juste throwing a dead "+getName()+" on the road");
		}
	}
	
	public void Climbing() {
		if (!isDead) {
			System.out.println(getName()+" is climbing");
		} else {
			System.out.println("this "+getName()+ " is dead dude, you're juste throwing a dead "+getName()+" on on a tree");
		}
	}
	
	public void Deading() {
		if (!isDead) {
			System.out.println(getName()+" is still alive, nice...");
		} else {
			System.out.println("this "+getName()+ " is dead dude, you're juste watching a dead "+getName()+"...");
		}
	}
	
	public void Swimming() {
		if (!isDead) {
			System.out.println(getName()+" is swimming");
		} else {
			System.out.println("this "+getName()+ " is dead dude, you're juste throwing a dead "+getName()+" in the water");
		}
	}
	
	public void DoSound() {
		if (isDead) {
			try {
				for (int i=0; i<3; i++) {
					System.out.println("...\n");
					Thread.sleep(2000l);
				}
				System.out.println("I think it's dead...");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(this.Sound);
		}
	}
}
