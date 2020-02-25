package lab2;

public class Book extends WrittenItem {
	 private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}
	public Book(String bookName,String author,int id,String title, int copies) {
		super(author,id,title,copies);
		this.bookName = bookName;
	}

	public Book() {
		super();
	}
	 
}
