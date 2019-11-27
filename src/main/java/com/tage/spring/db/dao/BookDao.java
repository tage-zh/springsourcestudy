package com.tage.spring.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Brief info of the class BookDao.
 **/
@Repository
public class BookDao {
  @Autowired
  private JdbcTemplate jdbcTemplate;


  public void addBook(){
    String sql = "insert into book values (?,?,?)";
    jdbcTemplate.update(sql,System.currentTimeMillis()/10000,"test",25.00);
  }
}
