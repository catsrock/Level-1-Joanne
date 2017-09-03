package League_Invaders;
import java.awt.Color;
import java.awt.Font;
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
Font titleFont;
Font startFont;
Font instructionFont;
Font gameOverFont;
Font numkilledFont;
Font backspaceFont;
Rocketship r1;
ObjectManager manager=new ObjectManager();
public GamePanel() {
	t1=new Timer(1000/60, this);
	titleFont=new Font("Arial", Font.PLAIN, 48);
	startFont=new Font("Arial", Font.PLAIN, 24);
	instructionFont=new Font("Arial", Font.PLAIN, 24);
	gameOverFont=new Font("Arial", Font.PLAIN, 48);
	numkilledFont=new Font("Arial", Font.PLAIN, 24);
	backspaceFont=new Font("Arial", Font.PLAIN, 24);
	r1=new Rocketship(250, 700, 50, 50);
	manager.addObject(r1); 

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
	manager.update();
}

public void updateEndState() {
	
}

public void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	g.setFont(titleFont);
	g.setColor(Color.yellow);
	g.drawString("LEAGUE INVADERS", 25, 200);
	
	g.setFont(startFont);
	g.drawString("Press ENTER to start", 125, 300);
	
	g.setFont(instructionFont);
	g.drawString("Press SPACE for instructions", 100, 400);
	
}

public void drawGameState(Graphics g) {
	g.setColor(Color.black);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);  
	manager.draw(g);
}

public void drawEndState(Graphics g) {
	g.setColor(Color.red);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	g.setFont(gameOverFont);
	g.setColor(Color.BLACK);
	g.drawString("GAME OVER", 100, 100);
	
	g.setFont(numkilledFont);
	g.drawString("You killed aliens.", 150, 300);
	
	g.setFont(backspaceFont);
	g.drawString("Press BACKSPACE to Restart", 80, 500);
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
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getKeyCode()==KeyEvent.VK_ENTER) {
		currentState++;
	}
	if(currentState > END_STATE){
		currentState = MENU_STATE;
	}
	if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		r1.left=true;
	}
	else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		r1.right=true;
	}
	else if(e.getKeyCode()==KeyEvent.VK_UP) {
		r1.up=true;
	}
	else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
		r1.down=true;
	}

}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		r1.left=false;
	}
	else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		r1.right=false;
	}
	else if(e.getKeyCode()==KeyEvent.VK_UP) {
		r1.up=false;
	}
	else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
		r1.down=false;
	}
}
}
