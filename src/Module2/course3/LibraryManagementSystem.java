package Module2.course3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;

class Library implements Serializable {
    private List<Book> books;
    private String LibraryName;
    private String address;

    public Library(String LibraryName, String address) {
        this.LibraryName = LibraryName;
        this.address = address;
        this.books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(String ISBN) throws Member.BookNotFoundException {
        Book bookToRemove = books.stream()
                .filter(b -> b.getISBN().equals(ISBN))
                .findFirst()
                .orElseThrow(() -> new Member.BookNotFoundException("Book with ISBN " + ISBN + " Not Found"));
        books.remove(bookToRemove);
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public void displayAvailableBooks() {
        books.stream()
                .filter(Book::isAvailable)
                .forEach(System.out::println);
    }

    public List<Book> getBooks() {
        return books;
    }
}

class Book implements Serializable {
    private String ISBN, title, author, genre;
    private boolean available;
    private double price;

    public Book(String ISBN, String title, String author, String genre, boolean available, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + title + ", Author: " + author +
                ", Genre: " + genre + ", Available: " + (available ? "Yes" : "No") + ", Price: Rs " + price;
    }
}

class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    private String memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Library library, String ISBN) throws BookNotFoundException, NotEnoughBooksException {
        Optional<Book> bookToBorrow = library.getBooks().stream()
                .filter(book -> book.getISBN().equals(ISBN) && book.isAvailable())
                .findFirst();

        if (bookToBorrow.isPresent()) {
            borrowedBooks.add(bookToBorrow.get());
            bookToBorrow.get().setAvailable(false);
        } else {
            throw new BookNotFoundException("Book with ISBN " + ISBN + " not available.");
        }
    }

    public void returnBook(Library library, String ISBN) throws BookNotFoundException {
        Book bookToReturn = library.getBooks().stream()
                .filter(book -> book.getISBN().equals(ISBN))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with ISBN " + ISBN + " was not borrowed by this member."));
        if (!borrowedBooks.contains(bookToReturn)) {
            throw new BookNotFoundException("Book with ISBN " + ISBN + " was not borrowed by this member.");
        }
        borrowedBooks.remove(bookToReturn);
        bookToReturn.setAvailable(true);
    }

    public void displayBorrowedBooks() {
        borrowedBooks.forEach(System.out::println);
    }

    public static class BookNotFoundException extends Exception {
        public BookNotFoundException(String message) {
            super(message);
        }
    }

    public static class NotEnoughBooksException extends Exception {
        public NotEnoughBooksException(String message) {
            super(message);
        }
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("City Library", "123 Main St");

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Author");
            System.out.println("4. Search Book by Genre");
            System.out.println("5. Display Available Books");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Serialize Library");
            System.out.println("9. Deserialize Library");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    Book book = new Book(ISBN, title, author, genre, true, price);
                    library.addBook(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Remove Book
                    System.out.print("Enter ISBN of the book to remove: ");
                    ISBN = scanner.nextLine();
                    try {
                        library.removeBook(ISBN);
                        System.out.println("Book removed successfully!");
                    } catch (Member.BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    // Search by Author
                    System.out.print("Enter Author Name: ");
                    author = scanner.nextLine();
                    List<Book> booksByAuthor = library.searchByAuthor(author);
                    if (booksByAuthor.isEmpty()) {
                        System.out.println("No books found by this author.");
                    } else {
                        booksByAuthor.forEach(System.out::println);
                    }
                    break;

                case 4:
                    // Search by Genre
                    System.out.print("Enter Genre: ");
                    genre = scanner.nextLine();
                    List<Book> booksByGenre = library.searchByGenre(genre);
                    if (booksByGenre.isEmpty()) {
                        System.out.println("No books found in this genre.");
                    } else {
                        booksByGenre.forEach(System.out::println);
                    }
                    break;

                case 5:
                    // Display Available Books
                    library.displayAvailableBooks();
                    break;

                case 6:
                    // Borrow Book
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter Member Name: ");
                    String memberName = scanner.nextLine();
                    Member member = new Member(memberId, memberName);
                    System.out.print("Enter ISBN of the book to borrow: ");
                    ISBN = scanner.nextLine();
                    try {
                        member.borrowBook(library, ISBN);
                        System.out.println("Book borrowed successfully!");
                    } catch (Member.BookNotFoundException | Member.NotEnoughBooksException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    // Return Book
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextLine();
                    System.out.print("Enter ISBN of the book to return: ");
                    ISBN = scanner.nextLine();
                    try {
                        member = new Member(memberId, "");
                        member.returnBook(library, ISBN);
                        System.out.println("Book returned successfully!");
                    } catch (Member.BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 8:
                    // Serialize Library
                    SerializationHandler.serializeLibrary(library, "libraryData.ser");
                    System.out.println("Library serialized successfully!");
                    break;

                case 9:
                    // Deserialize Library
                    library = SerializationHandler.deserializeLibrary("libraryData.ser");
                    System.out.println("Library deserialized successfully!");
                    break;

                case 10:
                    // Exit
                    System.out.println("Exiting the system...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class SerializationHandler {
    public static void serializeLibrary(Library library, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(library);
        }
    }

    public static Library deserializeLibrary(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Library) ois.readObject();
        }
    }
}
