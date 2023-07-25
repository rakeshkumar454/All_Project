package com.globallogic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globallogic.entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
