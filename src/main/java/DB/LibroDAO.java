package DB;
import Model.Libro;

import java.sql.SQLException;
import java.util.List;

public interface LibroDAO {
	public boolean insertLibro(Libro libro) throws SQLException; 					// CREATE
	public Libro getLibro(int id) throws SQLException; 								// READ
	public Libro getLibroByIsbn(String isbn) throws SQLException;						// READ
	public List<Libro> getLibro(String title) throws SQLException;					// READ
	public List<Libro> getLibro(String title, String author) throws SQLException; 	// READ
	public List<Libro> getAllLibro() throws SQLException;							//READ
	public List<Libro> getAllGenre(String genre) throws SQLException;							// READ
	public boolean updateLibro(Libro libro) throws SQLException;					// UPDATE
	public boolean deleteLibro(Libro libro) throws SQLException;					// DELETE
}
