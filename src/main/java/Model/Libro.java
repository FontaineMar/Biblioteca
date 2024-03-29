package Model;

public class Libro {
	
	private int id;
	private String isbn;
	private String title;
	private String author;
	private String genre;

	public Libro () {}
	
	public Libro (int id ,String title, String author, String genre, String isbn) {
		
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
		this.id = id;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
