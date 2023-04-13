package com.tietotest.books.Controller;

import com.tietotest.books.Model.Book;
import com.tietotest.books.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.Instant;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book/create")
    public String createBook(){
        return "createBook";
    }

    @PostMapping("/book")
    public String post(@ModelAttribute Book book, Model model){
        book.setCreatedAt(Instant.now());
        bookRepository.save(book);
        return "redirect:/";
    }
}
