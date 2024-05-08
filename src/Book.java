import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int publishingYear;

    public Book(String nameBook, Author author, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author);
    }

    @Override
    public String toString() {
        return "Название книги - " + nameBook + ". Автор - " + author + ". Год выпуска - " + publishingYear;
    }
}
