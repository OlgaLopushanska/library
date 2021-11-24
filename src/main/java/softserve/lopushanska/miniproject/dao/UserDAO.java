package softserve.lopushanska.miniproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

import java.util.List;

@Component
public class UserDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        return jdbcTemplate.query("SELECT * FROM User", new BeanPropertyRowMapper<>(User.class));
    }

    public Person show(int id) {
        return jdbcTemplate.query("SELECT * FROM User WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(User.class))
                .stream().findAny().orElse(null);
    }

    public void save(User user) {
        jdbcTemplate.update("INSERT INTO User VALUES(1, ?, ?, ?)", user.getName(), user.getAge(),
                user.getEmail(), user.getPlaceOfWork());
    }

   // public void update(int id, Person updatedPerson) {
    //    jdbcTemplate.update("UPDATE Person SET name=?, age=?, email=? WHERE id=?", updatedPerson.getName(),
    //            updatedPerson.getAge(), updatedPerson.getEmail(), id);
  //  }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM User WHERE id=?", id);
    }
}
