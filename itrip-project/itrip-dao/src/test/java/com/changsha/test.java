package com.changsha;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest(classes = {itrip_dao.class})
public class test {

    @Autowired
    DataSource dataSource;

    @Test
    public void show() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
