
public class Book {
	private String name,author;
	private int num;
	
	public Book(String name,String author,int num) {
		// TODO Auto-generated constructor stub
		setAuthor(author);
		setName(name);
		setNum(num);
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}	
