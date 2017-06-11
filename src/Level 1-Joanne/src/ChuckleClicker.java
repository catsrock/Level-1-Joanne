import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	private JFrame frame=new JFrame();
	private JPanel panel=new JPanel();
	private JButton but1=new JButton();
	private JButton but2=new JButton();
	public static void main(String[] args) {
		ChuckleClicker clicker=new ChuckleClicker();
		clicker.makeButtons();
	
	
}
	public void makeButtons(){
		ChuckleClicker chuckle=new ChuckleClicker();
		frame.setVisible(true);
		frame.pack();
		frame.setSize(1000, 1000);
		frame.add(panel);
		panel.add(but1);
		panel.add(but2);
		but1.setText("joke");
		but2.setText("punchline");
		but1.addActionListener(this);
		but2.addActionListener(this);
		if(but1.equals(true)){
			JOptionPane.showMessageDialog(null, "Hi");
		}
		else{
			JOptionPane.showMessageDialog(null, "Hi");
		}
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == but1){
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		}
		else{
			JOptionPane.showMessageDialog(null, "To get to the other side. Lol");
		}
	}
}