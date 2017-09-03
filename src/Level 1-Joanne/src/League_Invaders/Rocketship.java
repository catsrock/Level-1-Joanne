package League_Invaders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Rocketship extends GameObject {
	int speed;
	boolean left;
	boolean right;
	boolean up;
	boolean down;
public Rocketship(int x, int y, int width, int height) {
	super(x, y, width, height);
	speed=5;
}
public void update() {
	if(left==true) {
		x-=speed;
	}
	else if(right==true) {
		x+=speed;
	}
	else if(down==true) {
		y+=speed;
	}
	else if(up==true) {
		y-=speed;
	}
}
public void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);

}
}
