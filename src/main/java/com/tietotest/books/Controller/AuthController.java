package com.tietotest.books.Controller;

import com.tietotest.books.Model.Book;
import com.tietotest.books.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Pageable;
import java.util.List;

@Controller
public class AuthController {

    private int BOOKS_PER_PAGE = 50;
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("books", bookRepository.findAllBooksSortByNewest(0));
        return "index";
    }

    @GetMapping("/{pageNr}")
    public String getBooksPage(Model model, @PathVariable(value = "pageNr", required = false) int pageNr ){
        System.out.println(pageNr);
        model.addAttribute("books", bookRepository.findAllBooksSortByNewest(pageNr * BOOKS_PER_PAGE));
        return "index";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
