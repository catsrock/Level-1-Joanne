
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Photo_Quiz implements MouseMotionListener {
	static Component image2;

	public static void main(String[] args) throws Exception {
		Photo_Quiz quiz = new Photo_Quiz();
		Frame quizWindow = new Frame();
		quizWindow.setSize(1000, 1000);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		String panda = "http://www.freepandapictures.com/images/animalwild007-GiantPanda-OnRocks.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(panda);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		quizWindow.setVisible(true);
		String question = JOptionPane.showInputDialog("What animal is my image?");
		// 7. print "CORRECT" if the user gave the right answer
		if (question.equals("panda")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			JOptionPane.showMessageDialog(null, "You have earned 10 points.");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
			JOptionPane.showMessageDialog(null, "You have lost 10 points.");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
		String gorilla = "https://lh3.googleusercontent.com/zu01he0bl88aox7k20Kin7ao3bZZbK3CDbMTHjQagGIvsUoG1id2zjh6_m8=w456-h460";

		image2 = createImage(gorilla);
		// 11. add the second image to the quiz window
		image2.addMouseMotionListener(quiz);
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer = JOptionPane.showInputDialog("What animal is this picture showing?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer.equals("gorilla")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			JOptionPane.showMessageDialog(null, "You have gained an extra 20 points!");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
			JOptionPane.showMessageDialog(null, "You have lost 30 points.");
		}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Component image2;
		// TODO Auto-generated method stub
		if (e.getComponent() == image2) {
			JOptionPane.showMessageDialog(null, "Hi!");
		}
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}
