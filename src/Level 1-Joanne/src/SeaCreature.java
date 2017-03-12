/*
 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SeaCreature { public static void main(String[] args) {
	 {
	String creatureName="";
	while(!creatureName.equalsIgnoreCase("STOP")){
		creatureName=JOptionPane.showInputDialog("What is the seacreature's name?");
	if(!creatureName.equalsIgnoreCase("STOP")){
		SeaCreature seaCreature=new SeaCreature(creatureName);
	seaCreature.manageSeaCreature();
	}
	}
	
	}
	
	
}

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"/Users/League/Google Drive/league-sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			System.out.println(name+" does not have a laugh.");
		}
	}
void manageSeaCreature(){
	System.out.println(name);
	eat();
	laugh();
}
}
