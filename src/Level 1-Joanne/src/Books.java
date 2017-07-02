import javax.swing.JOptionPane;

public class Books {
private int pages;
private String title;
public Books(int pages, String title){
	this.pages=pages;
	this.title=title;
}
public int getPages(){
	return this.pages;
}
public String getTitle(){
	return this.title;
}
public void setPages(int Pages){
	if(pages>0){
	this.pages=pages;
	}
	else{
		JOptionPane.showMessageDialog(null, "Your book is not a book.");
	}
}
public void setTitle(String Title){
	this.title=title;
}

public String toString(){
	String book1= "Your book is " + this.pages+ " pages long and is called "+ this.title+ ".";
	return book1;
}
}