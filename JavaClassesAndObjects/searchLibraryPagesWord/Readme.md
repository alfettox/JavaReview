# Library Search for Word

This Java program represents a simple library system where you can search for a specific word in the content of books and retrieve the pages where the word is found.

## Classes

### Page

- Represents a page in a book.
- Contains a page number and the content of the page.

### Book

- Represents a book in the library.
- Contains a title and a list of pages.

### SearchResult

- Represents the result of a search.
- Contains the book title, page number, searched word, and a map of page numbers to pages where the word is found.

### Library

- Manages a collection of books.
- Provides a method (`findPagesContainingWord`) to search for a word in the content of the pages.

## Usage

1. Create instances of `Page`, `Book`, and `Library`.
2. Use the `findPagesContainingWord` method to search for a specific word in the library.
3. Retrieve the search results, including the book title, page number, and content where the word is found.

## Example

```java
public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Lord of the Ring", List.of(
            new Page(1, "Page0. This are words"),
            new Page(2, "Page4"),
            new Page(3, "Page6 Mond no no"),
            new Page(4, "Mond ay some other stuff")
    )));

    books.add(new Book("Another Book", List.of(
            new Page(1, "Intro"),
            new Page(2, "Conclusion"),
            new Page(3, "Index")
    )));

    Library library = new Library(books);

    List<SearchResult> result = library.findPagesContainingWord("Monday");

    for (SearchResult searchResult : result) {
        System.out.println(searchResult);
    }
}