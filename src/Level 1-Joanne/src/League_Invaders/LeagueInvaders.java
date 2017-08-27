package League_Invaders;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders {	
	JFrame frame;
	static final int width=500;
	static final int height=800;
	GamePanel g1;
	
	public LeagueInvaders() {
	frame=new JFrame();
	
	g1=new GamePanel();
	setup();
	}
	
	public void setup() {
	frame.setVisible(true);
	frame.setSize(width, height);
	frame.add(g1);
	frame.addKeyListener(g1);
	g1.startGame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

public static void main(String[] args) {
	LeagueInvaders thing=new LeagueInvaders();
	
}
}
