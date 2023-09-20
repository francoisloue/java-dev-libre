package AnimalsInterface;

public class Parrot extends Animal implements Fly, Walk, Dead, Climb {
	private String Name;
	private String Type;
	private boolean isDead;
	private String Sound;
	
	public Parrot(String name, String type, boolean dead, String sound) {
		super(name, type, dead, sound);
		// TODO Auto-generated constructor stub
		this.Name = name;
		this.Type = type;
		this.isDead = false;
		this.Sound = sound;	
	}
}
