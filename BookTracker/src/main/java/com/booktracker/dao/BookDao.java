package com.booktracker.dao;
import com.booktracker.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {
    Book getBookByTitle(String title);
    List<Book> getAllBooks();
    Book addBook(Book book);
    void updateBook(Book book);
    void deleteBookByTitle(String title);

    @Modifying
    @Query("UPDATE Book b SET b.property = :value WHERE b.id = :id")
    void updateBook(@Param("id") Long id, @Param("value") String value);
}