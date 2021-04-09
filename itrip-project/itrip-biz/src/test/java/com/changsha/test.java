package com.changsha;

import com.changsha.pojo.ItripUser;
import com.changsha.service.ItripUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = {itrip_biz.class})
public class test {

    @Autowired
    ItripUserService userService;

    @Test
    public void show(){
        List<ItripUser> itripUser = userService.QueryUser();
        itripUser.forEach(System.out::println);
    }

}
