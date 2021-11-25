package softserve.lopushanska.miniproject.model;

public class Book {
  private int Id;
  private String name;
  private String author;
  private int pageNumber;
  private int booked;

  public Book() {

  }

  public Book(int id, String name, String author, int pageNumber, int booked) {
    this.Id = id;
    this.name = name;
    this.author = author;
    this.pageNumber = pageNumber;
    this.booked = booked;
  }

  public void setId(int id) {
    Id = id;
  }

  public int getId() {
    return Id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  public void setBooked(int booked) {
    this.booked = booked;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public int getBooked() {
    return booked;
  }
}
