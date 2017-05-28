import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	static JFrame frame = new JFrame();
	static JButton butt;

	public static void main(String[] args) {
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			System.out.println(
					"You will come home finding your computer at the bottom of your trash can. Compliments of your cat.");
		} else if (rand == 1) {
			System.out.println("You will go to Stanford");
		} else if (rand == 2) {
			System.out.println("You will become famous");
		} else if (rand == 3) {
			System.out.println("You will find a supposed lucky chicken running around inside your house.");
		} else {
			System.out.println("Your cat will chew up your bed the instant you come home.");
		}

	}

	private void showButton() {
		System.out.println();
		frame.setVisible(true);
		JButton butt = new JButton();
		frame.add(butt);
		butt.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Your action is being performed");
		// TODO Auto-generated method stub

	}
}
