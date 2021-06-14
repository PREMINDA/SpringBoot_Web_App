package com.example.SpringBoot_Web_App.repositories;

import com.example.SpringBoot_Web_App.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
