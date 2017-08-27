package League_Invaders;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer t1;
//GameObject object1;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState=MENU_STATE;
public GamePanel() {
	t1=new Timer(1000/60, this);
	//object1=new GameObject();
}
public void startGame() {
	t1.start(); 
}

public void paintComponent(Graphics g){
	//object1.draw(g);
	if(currentState == MENU_STATE){
		drawMenuState(g);
	}else if(currentState == GAME_STATE){
		drawGameState(g);
	}else if(currentState == END_STATE){
		drawEndState(g);
	}

}

public void updateMenuState() {
	
}

public void updateGameState() {
	
}

public void updateEndState() {
	
}

public void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    

}

public void drawGameState(Graphics g) {
	g.setColor(Color.black);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);   
}

public void drawEndState(Graphics g) {
	g.setColor(Color.red);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);   
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	//object1.update();
	if(currentState == MENU_STATE){
		updateMenuState();
	}
	else if(currentState == GAME_STATE){
		updateGameState();
	}
	else if(currentState == END_STATE){
		updateEndState();
	}

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Hey!");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("You there!");
	if(currentState > END_STATE){
		currentState = MENU_STATE;
	}

}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Yeah you!");
}
}
