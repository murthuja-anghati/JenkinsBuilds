package com.boraji.tutorial.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boraji.tutorial.spring.dao.BookDao;
import com.boraji.tutorial.spring.model.Book;

@Service
@Transactional(readOnly = true)
public class BookServiceImp implements BookService {

   @Autowired
   private BookDao bookDaoImp;

   @Transactional
   @Override
   public long save(Book book) {
      return bookDaoImp.save(book);
   }

   @Override
   public Book get(long id) {
      return bookDaoImp.get(id);
   }

   @Override
   public List<Book> list() {
      return bookDaoImp.list();
   }

   @Transactional
   @Override
   public void update(long id, Book book) {
      bookDaoImp.update(id, book);
   }

   @Transactional
   @Override
   public void delete(long id) {
      bookDaoImp.delete(id);
   }

}
