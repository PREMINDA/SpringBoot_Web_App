package com.example.SpringBoot_Web_App.BootStrap;

import com.example.SpringBoot_Web_App.domain.Author;
import com.example.SpringBoot_Web_App.domain.Book;
import com.example.SpringBoot_Web_App.repositories.AuthorRepository;
import com.example.SpringBoot_Web_App.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;



    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author matt = new Author("andrew","matt");
        Book book1 = new Book("Game","123456");
        matt.getBooks().add(book1);
        book1.getAuthors().add(matt);

        authorRepository.save(matt);
        bookRepository.save(book1);

        Author nilson = new Author("nilson","jakobe");
        Book book2 = new Book("Game","123456");
        nilson.getBooks().add(book2);
        book1.getAuthors().add(nilson);

        authorRepository.save(nilson);
        bookRepository.save(book2);

        System.out.println("Number of book " + bookRepository.count());
    }




}
