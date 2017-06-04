import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CowTimer {
	private int minutes;
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction. Work in seconds when testing, then change to minutes
	 */

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
		CowTimer cow = new CowTimer();
		String numberOfMinutes = JOptionPane.showInputDialog("How many minutes should I set the timer to?");
		int minutes = Integer.parseInt(numberOfMinutes);
		cow.setTime(minutes);
		cow.start();
	}

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * seconds using Thread.sleep(int milliseconds).
		 */
		for (int i = minutes; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(15000);
		}
		playSound("no-siree-bob.wav");
		Thread.sleep(5000);
		speak("It's time to walk!");
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to
		 * walk.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
