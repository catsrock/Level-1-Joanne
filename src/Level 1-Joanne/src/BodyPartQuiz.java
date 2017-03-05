import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/Level-1-Joanne/src/Level 1-Joanne/src/AmyAdams.jpg";
	String secondImage = "/Users/league/Desktop/Level-1-Joanne/src/Level 1-Joanne/src/JakeGyllenhaal.jpg";
	String thirdImage = "/Users/league/Desktop/Level-1-Joanne/src/Level 1-Joanne/src/KirstenDunst.jpg";
	String firstAnswer = "Amy Adams";
	String secondAnswer = "Jake Gyllenhaal";
	String thirdAnswer = "Kirsten Dunst";
	Frame window = new Frame();
	int score = 0;
	String guess;

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(50, 125);
		// Make an int variable to hold the score.

		// Ask the user who this person is and store their answer
		checkGuess();
		window.setSize(171, 100);
		checkGuess();
		window.setSize(171, 50);
		checkGuess();
		window.dispose();
		JOptionPane.showMessageDialog(null, "This is your final score: " + score);
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void checkGuess() {
		guess = JOptionPane.showInputDialog("Who is this person?");
		if (guess.equalsIgnoreCase(getNextAnswer())) {
			JOptionPane.showMessageDialog(null, "You are correct");
			score = score + 1;
		}

		else {
			JOptionPane.showMessageDialog(null, "You are incorrect");

		}
		showNextImage();
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public String getNextAnswer() {
		if (answerIterator.hasNext())
			return answerIterator.next();

		return ("");
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		answerIterator = answerList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;
	ArrayList<String> answerList = new ArrayList<String>();
	Iterator<String> answerIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		answerList.add(firstAnswer);
		answerList.add(secondAnswer);
		answerList.add(thirdAnswer);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
