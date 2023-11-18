import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Page {
    private int pageNumber;
    private String content;

    public Page(int pageNumber, String content) {
        this.pageNumber = pageNumber;
        this.content = content;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getContent() {
        return content;
    }
}

class Book {
    private String title;
    private List<Page> pages;

    public Book(String title, List<Page> pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public List<Page> getPages() {
        return pages;
    }
}

class SearchResult {
    private String bookTitle;
    private int pageNumber;
    private String word;
    private Map<Integer, Page> bookPages;

    public SearchResult(String bookTitle, int pageNumber, String word, Map<Integer, Page> bookPages) {
        this.bookTitle = bookTitle;
        this.pageNumber = pageNumber;
        this.word = word;
        this.bookPages = bookPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "(" + bookTitle + ":page" + pageNumber + " - contains '" + word + "' in content '" + getFoundContent() + "')";
    }

    private String getFoundContent() {
        Page page = bookPages.get(pageNumber);
        return (page != null) ? page.getContent() : "";
    }
}

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<SearchResult> findPagesContainingWord(String word) {
        List<SearchResult> result = new ArrayList<>();

        for (Book book : books) {
            for (Page page : book.getPages()) {
                if (page.getContent().contains(word)) {
                    Map<Integer, Page> bookPages = new HashMap<>();
                    for (Page bookPage : book.getPages()) {
                        bookPages.put(bookPage.getPageNumber(), bookPage);
                    }
                    result.add(new SearchResult(book.getTitle(), page.getPageNumber(), word, bookPages));
                }
            }
        }

        return result;
    }

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
}
