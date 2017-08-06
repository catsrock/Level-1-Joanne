import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LotteryNumber  implements ActionListener{
	static JFrame frame=new JFrame();
	static JPanel panel=new JPanel();
	static JButton button=new JButton();
	static JLabel numbers=new JLabel();
public static void main(String[] args) {
	 LotteryNumber l=new LotteryNumber();
}
LotteryNumber(){
	
	button.addActionListener(this);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(numbers);
	button.setText("Generate");
	frame.pack();
	
}
@Override
public void actionPerformed(ActionEvent e){
	// TODO Auto-generated method stub
	if(e.getSource()==button){
		Random r1=new Random();
		String nums="";
	for (int i = 0; i < 6; i++) {
	nums+="" +r1.nextInt(100)+" ";
	numbers.setText(nums);
	}
	frame.pack();
		
		
		
		
	}
}
}