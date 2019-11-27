package com.tage.spring.db.service;

import com.tage.spring.db.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Brief info of the class BookService.
 **/
@Service
public class BookService {
  @Autowired
  private BookDao bookDao;

  @Transactional
  public void addBook(){
    bookDao.addBook();
    int a = 1/0;
  }

}
