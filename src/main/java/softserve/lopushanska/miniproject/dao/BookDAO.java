package softserve.lopushanska.miniproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import softserve.lopushanska.miniproject.model.Book;
import softserve.lopushanska.miniproject.model.Person;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookDAO {

  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public BookDAO(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Book> index() {
    return jdbcTemplate.query("SELECT * FROM Book", new BeanPropertyRowMapper<>(Book.class));
  }

  public Book show(int id) {
    return jdbcTemplate.query("SELECT * FROM Book WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Book.class))
            .stream().findAny().orElse(null);
  }

  public List<Book> indexChecked() {
    List<Book> books = index();
    return books.stream().filter(book -> book.getBooked() == 1).collect(Collectors.toList());
  }

  public void save(Book book) {
    jdbcTemplate.update("INSERT INTO Book VALUES(10, ?, ?, ?)", book.getName(), book.getAuthor(),
            book.getPageNumber(), book.getBooked());
  }
}
