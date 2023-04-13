package com.tietotest.books.Repository;

import com.tietotest.books.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM book ORDER BY created_at LIMIT 50 OFFSET ?1")
    List<Book> findAllBooksSortByNewest(int offset);
}
