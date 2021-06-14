package com.example.SpringBoot_Web_App.repositories;

import com.example.SpringBoot_Web_App.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
