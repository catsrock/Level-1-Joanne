import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SimonSaysRecipe extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable
	JFrame simon;
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	Date timeAtStart;

	private void makeAlbum() {
		// 2. add 4 images which match keyboard keys like this: images.put(new
		// Integer(KeyEvent.VK_UP), "image.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "Down_Arrow.png");
		images.put(new Integer(KeyEvent.VK_LEFT), "Left_Arrow.png");
		images.put(new Integer(KeyEvent.VK_RIGHT), "Right_Arrow.png");
		images.put(new Integer(KeyEvent.VK_UP), "Up_Arrow.png");
		// 3. Tell the user to "Press the matching key when 'Simon says'
		// otherwise press a different key"
		JOptionPane.showMessageDialog(null,
				"Press the matching key when 'Simon says' otherwise press a different key.");
		// 4. call the method to show an image
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their
		// score at the end.
		// 17. if the keyCode matches the imageIndex and "Simon says..."
		// increase their score
		// 18. if the keyCode doesn't match the imageIndex and "Simon didn't
		// say..." increase their score
		// 19. Use the speak method to tell the user if they were correct or not
		// 13. increment tries by 1

		// 14. if tries is greater than 9 (or however many you want)

		// 15. exit the program

		// 11. dispose of the frame

		// 12. call the method to show an image

	}

	private void showImage() {
		// 5. initialize your frame to a new JFrame()
		simon = new JFrame();
		// 6. set the frame to visible

		simon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.add(getNextRandomImage()); //7. rename to the name of your
		// frame
		simon.add(getNextRandomImage());

		// 8. set the size of the frame
		simon.setSize(1000, 1000);
		// 9. add a key listener to the frame
		simon.addKeyListener(this);
		// 10. Use the speak method to either say "Simon says press this key" or
		// "Press this key"
		simon.setVisible(true);
		Random tom = new Random();
		simonSays = tom.nextInt(2);
		if (simonSays == 0) {
			speak("Press this key");
		} else {
			speak("Simon says press this key");
		}
		// Hint: use the simonSays int and a random number
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		System.out.println("Image index" + imageIndex);
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		Icon icon;
		try {
			URL imageURL = getClass().getResource(fileName);
			icon = new ImageIcon(imageURL);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, fileName + " could not be found");
			return new JLabel("Image " + fileName + " not found");
		}
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSaysRecipe().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
 * Date();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */
