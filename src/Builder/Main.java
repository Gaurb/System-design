package Builder;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Book.BookBuilder builder= new Book.BookBuilder();

        Book book1= builder
                .setAuthor("Gaurav")
                .setPublishedTime(LocalDateTime.now())
                .build();
        System.out.println(book1);

    }
}
