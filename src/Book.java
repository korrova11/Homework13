import java.util.Objects;

public class Book {

        private String titleBook;
        private Author author;
        private int yearPublication;


        Book(String titleBook, Author author, int yearPublication) {
            this.titleBook = titleBook;
            this.author = author;
            this.yearPublication = yearPublication;
        }

        public String getTitleBook() {

            return titleBook;
        }

        public Author getAuthor() {
            return author;

        }

        public int getYearPublication() {

            return yearPublication;
        }

        public void setYearPublication(int yearPublication) {

            this.yearPublication = yearPublication;
        }
       // Author a = new Author();
        //a.author =  getAuthor();



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getYearPublication() == book.getYearPublication() && Objects.equals(getTitleBook(), book.getTitleBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitleBook(),getYearPublication());
    }



    @Override
    public String toString() {
        return "Book" +
                "titleBook='" + titleBook + '\'' +
                ", author="   + author + ", yearPublication=" + yearPublication;

    }

}



