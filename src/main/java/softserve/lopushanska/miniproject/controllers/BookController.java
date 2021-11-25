package softserve.lopushanska.miniproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import softserve.lopushanska.miniproject.dao.BookDAO;
import softserve.lopushanska.miniproject.model.Book;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/books")
public class BookController {

  private final BookDAO bookDAO;

  @Autowired
  public BookController(BookDAO bookDAO) {
    this.bookDAO = bookDAO;
  }

  @GetMapping()
  public String index(Model model) {
    model.addAttribute("allbooks", bookDAO.index());
    model.addAttribute("checked", bookDAO.indexChecked());
    return "books/index";
  }

  @GetMapping("/{id}")
  public String show(@PathVariable("id") int id, Model model) {
    model.addAttribute("book", bookDAO.show(id));
    return "books/show";
  }
  @PostMapping()
  public String create(@ModelAttribute("person") Book book) {
      bookDAO.save(book);
      return "redirect:/books";
    }
}