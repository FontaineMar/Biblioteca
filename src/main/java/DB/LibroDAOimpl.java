package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Libro;

public class LibroDAOimpl implements LibroDAO{


	@Override
	public boolean insertLibro(Libro libro) throws SQLException {
		String sql = "INSERT INTO book (isbn ,title, author, genre) VALUES (?, ?, ?, ?)";
		Connection jdbcConnection = DatabaseConnection.connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, libro.getIsbn());
		statement.setString(2, libro.getTitle());
		statement.setString(3, libro.getAuthor());
		statement.setString(4, libro.getGenre());


		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		DatabaseConnection.disconnect();
		return rowInserted;


	}

	@Override
	public Libro getLibro(int id) throws SQLException {
		Libro libro  = null;
		String sql = "SELECT * FROM book WHERE id = ?";

		Connection jdbcConnection = DatabaseConnection.connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, id);

		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {
			String isbn = resultSet.getString("isbn");
			String title = resultSet.getString("title");
			String author = resultSet.getString("author");
			String genre = resultSet.getString("genre");

			libro = new Libro(id,isbn, title, author, genre);
		}

		resultSet.close();
		statement.close();
		DatabaseConnection.disconnect();
		return libro;
	}

	@Override
	public List<Libro> getLibroByIsbn(String isbn) throws SQLException {
		String sql = "SELECT * FROM book WHERE isbn = ?";
		List<Libro> list = new ArrayList<Libro>();


		Connection jdbcConnection = DatabaseConnection.connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, isbn);


		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()) {
			Libro libro = new Libro();
			libro.setId(resultSet.getInt("id"));
			libro.setTitle(resultSet.getString("title"));
			libro.setIsbn(resultSet.getString("isbn"));
			libro.setAuthor(resultSet.getString("author"));
			libro.setGenre(resultSet.getString("genre"));


			list.add(libro);
		}
		resultSet.close();
		statement.close();
		DatabaseConnection.disconnect();

		return list;
	}

	@Override
	public List<Libro> getLibroTitle(String title) throws SQLException {
		String sql = "SELECT * FROM book WHERE title = ?";
		List<Libro> list = new ArrayList<Libro>();

		Connection jdbcConnection = DatabaseConnection.connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, title);



		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()) {
			Libro libro = new Libro();
			
			libro.setId(resultSet.getInt("id"));
			libro.setTitle(resultSet.getString("title"));
			libro.setIsbn(resultSet.getString("isbn"));
			libro.setAuthor(resultSet.getString("author"));
			libro.setGenre(resultSet.getString("genre"));

			list.add(libro);
		}


		resultSet.close();
		statement.close();
		DatabaseConnection.disconnect();

		return list;
	}


	@Override
	public List<Libro> getLibroAuthor(String author) throws SQLException {
		String sql = "SELECT * FROM book WHERE author= ?";
		List<Libro> list = new ArrayList<Libro>();

		Connection jdbcConnection = DatabaseConnection.connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(2, author);

		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()) {
			Libro libro = new Libro();
			libro.setId(resultSet.getInt("id"));
			libro.setTitle(resultSet.getString("title"));
			libro.setIsbn(resultSet.getString("isbn"));
			libro.setAuthor(resultSet.getString("author"));
			libro.setGenre(resultSet.getString("genre"));


			list.add(libro);
		}


		resultSet.close();
		statement.close();
		DatabaseConnection.disconnect();

		return list;
	}

	@Override
	public List<Libro> getAllLibro() throws SQLException {
		List<Libro> listBook = new ArrayList<>();

		String sql = "SELECT * FROM book";

		Connection jdbcConnection = DatabaseConnection.connect();

		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String isbn = resultSet.getString("isbn");
			String title = resultSet.getString("title");
			String author = resultSet.getString("author");
			String genre = resultSet.getString("genre");

			Libro book = new Libro();
			book.setId(id);
			book.setIsbn(isbn);
			book.setTitle(title);
			book.setAuthor(author);
			book.setGenre(genre);
			//			Book book = new Book(id, title, author, price);
			listBook.add(book);
		}

		resultSet.close();
		statement.close();

		DatabaseConnection.disconnect();

		return listBook;
	}

	@Override
	public List<Libro> getAllGenre(String genre) throws SQLException {
		String sql = "SELECT * FROM book WHERE genre = ?";
		List<Libro> list = new ArrayList<Libro>();

		Connection jdbcConnection = DatabaseConnection.connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, genre);



		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()) {
			Libro libro = new Libro();
			libro.setId(resultSet.getInt("id"));
			libro.setTitle(resultSet.getString("title"));
			libro.setIsbn(resultSet.getString("isbn"));
			libro.setAuthor(resultSet.getString("author"));
			libro.setGenre(resultSet.getString("genre"));
			list.add(libro);
		}


		resultSet.close();
		statement.close();
		DatabaseConnection.disconnect();

		return list;


	}

	@Override
	public boolean updateLibro(Libro libro) throws SQLException {
		String sql = "UPDATE book SET isbn= ?, title = ?, author = ?, genre = ?";
		sql += " WHERE id = ?";
		Connection jdbcConnection = DatabaseConnection.connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);

		statement.setString(1, libro.getIsbn());
		statement.setString(2, libro.getTitle());
		statement.setString(3, libro.getAuthor());
		statement.setString(4, libro.getGenre());
		statement.setInt(5, libro.getId());

		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		DatabaseConnection.disconnect();
		return rowUpdated; 
	}

	@Override
	public boolean deleteLibro(Libro libro) throws SQLException {
		String sql = "DELETE FROM book where id = ?";

		Connection jdbcConnection = DatabaseConnection.connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, libro.getId());

		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		DatabaseConnection.disconnect();
		return rowDeleted;   
	}

}
