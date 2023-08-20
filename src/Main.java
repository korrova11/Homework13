
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Герман Гессе");
        // System.out.println(author1.getFullName());
        Author author2 = new Author("Федор Достоевский");
        // System.out.println(author2.getFullName());


        Book book1 = new Book("Игра в бисер", author1, 1986);
        book1.setYearPublication(2000);
        Book book2 = new Book("Идиот", author2, 1954);


        System.out.println("Название книги - "+book1.getTitleBook() +", автор -  "+book1.getAuthor().getFullName() +", год издания - "+ book1.getYearPublication());
        System.out.println("Название книги - "+book2.getTitleBook() +", автор -  "+author2.getFullName() +", год издания - "+ book2.getYearPublication());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));


    }

}