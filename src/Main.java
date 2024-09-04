public class Main {
    public static void main(String[] args) {


        Author author = new Author("Брюс", "Эккель");
        Author author2 = new Author("Роберт", "Мартин");
        System.out.println("Автор 1 = " + author.getName() + " " + author.getSurname());
        System.out.println("Автор 2 = " + author2.getName() + " " + author2.getSurname());

        System.out.println();
        Book book = new Book("Философия Java", author, 2019);
        Book book2 = new Book("Чистый код", author2, 2018);
        System.out.println("Книга 1 = " + book.getTitle() + ", " + book.getAuthor() + ", " + book.getPublicationYear());
        System.out.println("Книга 2 = " + book2.getTitle() + ", " + book2.getAuthor() + ", " + book2.getPublicationYear());

        System.out.println();
        book.setPublicationYear(2024);
        System.out.println("Книга 1 = " + book);
        book2.setPublicationYear(2023);
        System.out.println("Книга 2 = " + book2);


    }
}