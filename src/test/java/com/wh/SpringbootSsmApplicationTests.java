package com.wh;

import com.wh.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootSsmApplicationTests {
     @Autowired
     Book book;
     @Value("#{book.id}")
     String str;
    @Test
    void contextLoads() {
        System.out.println(book);
        System.out.println(str);
    }

}
