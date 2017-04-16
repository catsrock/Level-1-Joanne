
public class Go_To_School {
public static void main(String[] args) {
	Backpack backpack=new Backpack();
	backpack.setPencil(new Pencil());
	backpack.setRuler(new Ruler());
	backpack.setTextbook(new Textbook());
	backpack.goToSchool();
}
}
