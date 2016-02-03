import java.awt.List;
import java.util.ArrayList;

public class Library {
	private String name,adress;
	private ArrayList books;
	
	public Library(String name,String adress,ArrayList books) {
		// TODO Auto-generated constructor stub
		setName(name);
		setAdress(adress);
		setBooks(books);
		
	}
	
	public void addBook(Book book){
		books.add(book);
	}
	public void removeBook(Book book){
		books.remove(book);
	}
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public ArrayList getBooks() {
		return books;
	}
	public void setBooks(ArrayList books) {
		this.books = books;
	}
	
	
	
}
