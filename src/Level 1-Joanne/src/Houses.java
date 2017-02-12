import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class Houses{  
	 static int small=60;
		static int medium=120;
		static int large=250;
	static Robot tortoise=new Robot();
	public static void main(String[] args) {
	
	Houses program=new Houses();
	
	tortoise.moveTo(25, 900);
	tortoise.penDown();
	tortoise.setSpeed(10);
	
	for (int i = 0; i < 10; i++) {
	
		
	int size=new Random().nextInt(3);
	int height=0;
	if(size==0){
		height=small;
	}
	else if(size==1){
		height=medium;
	}
	else{
		height=large;
	}
	program.drawHouse(height, Color.blue);	
	}
	
}
void drawPointyRoof(){
	tortoise.turn(45);
	tortoise.move(25);
	tortoise.turn(90);
	tortoise.move(25);
	tortoise.turn(45);
}
void drawFlatRoof(){
	tortoise.turn(90);
	tortoise.move(50);
	tortoise.turn(90);
}
private void drawHouse(int height, Color color) {
	// TODO Auto-generated method stub
	tortoise.setPenColor(color);
	if(height==large){
		tortoise.move(height);
		drawFlatRoof();
		tortoise.move(height);
		tortoise.turn(-90);
		tortoise.move(50);
		tortoise.turn(-90);
	}
	else{
	tortoise.move(height);
	drawPointyRoof();
	tortoise.move(height);
	tortoise.turn(-90);
	tortoise.move(50);
	tortoise.turn(-90);
	}
	

}


}
