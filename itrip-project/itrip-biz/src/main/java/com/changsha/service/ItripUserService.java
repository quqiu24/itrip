package com.changsha.service;

import com.changsha.pojo.ItripUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ItripUserService extends IService<ItripUser>{

    public List<ItripUser> QueryUser();

}
