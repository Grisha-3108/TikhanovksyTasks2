class Author{
    public Author(String name, String male, String email) {
        this.name = name;
        this.male = male;
        this.email = email;
    }

    private String name;
    private String male;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class Book {
    private Author AuthorBook;

    public Book(String name, String male, String email) {
        AuthorBook = new Author(name, male, email);
    }

    public Author getAuthorBook() {
        return AuthorBook;
    }

    public void setAuthorBook(Author authorBook) {
        AuthorBook = authorBook;
    }

    public String toString(){
        return AuthorBook.getName() + " " + AuthorBook.getMale() + " " + AuthorBook.getEmail();
    }
}
