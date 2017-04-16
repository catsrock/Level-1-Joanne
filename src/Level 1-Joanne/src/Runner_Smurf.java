
public class Runner_Smurf {
public static void main(String[] args) {
	Smurf handy=new Smurf("Handy");
	System.out.println(handy.getName());
	handy.eat();
	
	Smurf papa=new Smurf("Papa");
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	
	Smurf smurfette=new Smurf("Smurfette");
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
