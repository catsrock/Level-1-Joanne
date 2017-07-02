
public class Library {
public static void main(String[] args) {
	Books sciFi=new Books(751, "Scifi");
	System.out.println(sciFi.getPages()+ " " + " " +sciFi.getTitle());
	Books fBaWtFT=new Books(1024, "Fantastic Beasts and Where to Find Them");
	System.out.println(fBaWtFT.getPages()+" "+" "+fBaWtFT.getTitle());
	System.out.println(sciFi.toString());
}
}
