import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot {
static JFrame frame=new JFrame();
static JPanel panel=new JPanel();
static JButton but1=new JButton();
static JButton but2=new JButton();
static JTextField answer=new JTextField();
public static void main(String[] args) {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(answer);
	panel.add(but1);
	but1.setText("Bad");
	but2.setText("Good");
	panel.add(but2);
	frame.pack();
}
}
