package com.tage.spring.db.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import javax.sql.DataSource;
import javax.xml.bind.SchemaOutputResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Brief info of the class JDBCConfig.
 **/
@Configuration
@ComponentScan("com.tage.spring.db")
@EnableTransactionManagement
public class JDBCConfig {
  @Bean
  public DataSource dataSource() throws PropertyVetoException {
    ComboPooledDataSource source = new ComboPooledDataSource();
    source.setUser("C5290932");
    source.setPassword("Tage1985");
    source.setJdbcUrl("jdbc:postgresql://localhost:5432/test");
    source.setDriverClass("org.postgresql.Driver");
    return source;
  }

  @Bean
  public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
    return new JdbcTemplate(dataSource());
  }

  @Bean
  public PlatformTransactionManager platformTransactionManager() throws PropertyVetoException {
    return new DataSourceTransactionManager(dataSource());
  }
}
