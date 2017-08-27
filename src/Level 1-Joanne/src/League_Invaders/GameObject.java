package League_Invaders;
import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	public void update() {
	x=x+5;
	y=y+5;
	}
	public void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}

}
