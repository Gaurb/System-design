package Builder;

import java.time.LocalDateTime;

/**
 * Represents a Book entity with title, author, subtext, and publication time.
 * This class implements the Builder design pattern to provide a flexible
 * way to construct Book objects with optional parameters.
 * 
 * The Builder pattern is particularly useful here because:
 * - It allows for optional parameters without telescoping constructors
 * - It provides a fluent interface for object creation
 * - It ensures immutability of the Book object once created
 * 
 * @author System Design Practice
 * @version 1.0
 */
public class Book {
    // Private fields to ensure immutability after construction
    private String title;
    private String author;
    private String subText;
    private LocalDateTime publishedTime;

    /**
     * Private constructor that takes a BookBuilder instance.
     * This ensures that Book objects can only be created through the Builder.
     * 
     * @param builder The BookBuilder instance containing the book data
     */
    public Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.subText = builder.subText;
        this.publishedTime = builder.publishedTime;
    }

    /**
     * Gets the title of the book.
     * 
     * @return The book title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return The book author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the subtitle or additional text of the book.
     * 
     * @return The book subtext
     */
    public String getSubText() {
        return subText;
    }

    /**
     * Gets the publication date and time of the book.
     * 
     * @return The book's publication date and time
     */
    public LocalDateTime getPublishedTime() {
        return publishedTime;
    }

    /**
     * Returns a string representation of the Book object.
     * 
     * @return A formatted string containing all book details
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", subText='" + subText + '\'' +
                ", publishedTime=" + publishedTime +
                '}';
    }

    /**
     * Static nested Builder class that implements the Builder pattern.
     * This class provides a fluent interface for constructing Book objects
     * with optional parameters in a readable and maintainable way.
     * 
     * Usage example:
     * Book book = new Book.BookBuilder()
     *     .setTitle("Design Patterns")
     *     .setAuthor("Gang of Four")
     *     .setSubText("Elements of Reusable Object-Oriented Software")
     *     .setPublishedTime(LocalDateTime.now())
     *     .build();
     */
    public static class BookBuilder{
        // Builder fields - same as Book fields but mutable during construction
        private String title;
        private String author;
        private String subText;
        private LocalDateTime publishedTime;

        /**
         * Sets the title of the book being built.
         * 
         * @param title The book title
         * @return This BookBuilder instance for method chaining
         */
        public BookBuilder setTitle(String title) {
            this.title = title;
            return this; // Return this for fluent interface
        }

        /**
         * Sets the author of the book being built.
         * 
         * @param author The book author
         * @return This BookBuilder instance for method chaining
         */
        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this; // Return this for fluent interface
        }

        /**
         * Sets the subtitle or additional text of the book being built.
         * 
         * @param subText The book subtext
         * @return This BookBuilder instance for method chaining
         */
        public BookBuilder setSubText(String subText) {
            this.subText = subText;
            return this; // Return this for fluent interface
        }

        /**
         * Sets the publication date and time of the book being built.
         * 
         * @param publishedTime The publication date and time
         * @return This BookBuilder instance for method chaining
         */
        public BookBuilder setPublishedTime(LocalDateTime publishedTime) {
            this.publishedTime = publishedTime;
            return this; // Return this for fluent interface
        }

        /**
         * Constructs and returns a new Book instance with the current builder state.
         * This is the final step in the builder pattern that creates the immutable Book object.
         * 
         * @return A new Book instance with the configured properties
         */
        public Book build(){
            return new Book(this);
        }
    }
}
