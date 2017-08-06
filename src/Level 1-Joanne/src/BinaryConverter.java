import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	static JFrame frame=new JFrame();
	static JPanel panel=new JPanel();
	static JTextField answer = new JTextField(20);
	static JTextField answer2 = new JTextField(20);
	static JButton but1=new JButton();
public static void main(String[] args) {
	BinaryConverter b=new BinaryConverter();
	}
	BinaryConverter(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(answer);
	panel.add(answer2);
	panel.add(but1);
	but1.addActionListener(this);
	but1.setText("Convert");
	frame.pack();
	}


int convert(String binary) {
	System.out.println(binary.length());
		if(binary.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		 if(!Pattern.matches("\2", binary)) {
			 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
				return 0;
		 }
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			//question.setText("");
			return 0;
		}
	}
String convert2(String binary) {
  	int asciiValue = Integer.parseInt(binary, 2);
  	char theLetter = (char) asciiValue;
  	return "" + theLetter;
   }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==but1){
		System.out.println(answer.getText());
		convert(convert2(answer.getText()));

	}
}

}
