package com.codecool.BooksTutorial.repository

import com.codecool.BooksTutorial.model.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository: CrudRepository<Book, Long>