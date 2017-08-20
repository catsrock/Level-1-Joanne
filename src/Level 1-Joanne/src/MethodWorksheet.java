
public class MethodWorksheet {
private int MyLuckyNumber;
public static void main(String[] args) {
	System.out.println(whichPresent("Joe"));
	System.out.println(doPigsEat("bananas"));
	MethodWorksheet m1=new MethodWorksheet();
	m1.setMyLuckyNumber(12);
	System.out.println("Mom wants "+eggsMomWants()+" eggs");
	System.out.println("Dad wants "+eggsDadWants()+ " eggs");
	System.out.println("The baby wants "+eggsBabyWants()+ " eggs");
	System.out.println("If you are the same age as me, your average height is " +getAverageHeight(13));
	
}

	static String whichPresent(String friendName) {
		//lots of code
		if(friendName.equals("Joe")) {
			return "train";
		}
		return "bear";
		}
	static boolean doPigsEat(String food) {
		if(food.equals("roots"))
			return true;
		//more code here
		else if(food.equals("bananas")) {
			return true;
		}
		else return false;
	}
	int getMyLuckyNumber() {
		
		return this.MyLuckyNumber;

	}
	void setMyLuckyNumber(int MyLuckyNumber) {
		this.MyLuckyNumber=MyLuckyNumber;
	}
	static int eggsMomWants() {
		//some code
		return 12;
	}
	static int eggsDadWants() {
		//some code
		return 24;
	}
	static int eggsBabyWants() {
		//some code
		return 72;
	}
	static int getAverageHeight(int age) {
		if (age > 100) {
			return 34;
		}
		else if (age > 50) {
			return 30;
	}
		else if (age < 10) { 
			return 20;
	}
		else {
			return 63;
		}
	}

	}
