import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user
 * clicks on an illusion, a new one will be loaded.
 **/

public class BookOfIllusions extends MouseAdapter {
	private JFrame tom = new JFrame();
	private JLabel billy;
	private String cat = "Dwarf_Cat.jpg";
	private String pika = "American_Pika.jpg";
	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s
	 * createBook() method. This is because we want to get out of the static
	 * main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();

	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"

	private void createBook() {
		tom.setDefaultCloseOperation(0);
		// 2. make the frame visible
		tom.setVisible(true);
		// 3. set the size of the frame
		tom.setSize(1000, 1000);
		// 4. find 2 images and save them to your project’s default package

		// 5. make a variable to hold the location of your image. e.g.
		// "illusion.jpg"
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		// 7. use the "loadImage..." methods below to initialize your JLabel
		billy = loadImageFromComputer(pika);
		// 8. add your JLabel to the frame
		tom.add(billy);
		// 9. call the pack() method on the frame
		tom.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		tom.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("Clicked!");
		// 12. remove everything from the frame that was added earlier
		tom.remove(billy);
		// 13. load a new image like before (this is more than one line of code)
		billy = loadImageFromComputer(cat);
		tom.add(billy);
		// 14. pack the frame
		tom.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project
	 * under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
