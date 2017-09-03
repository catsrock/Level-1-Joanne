package League_Invaders;
import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive=true;
	public GameObject(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	public void update() {
	//x=x+5;
	//y=y+5;
	}
	public void draw(Graphics g) {
		//g.fillRect(x, y, 100, 100);
	}

}
