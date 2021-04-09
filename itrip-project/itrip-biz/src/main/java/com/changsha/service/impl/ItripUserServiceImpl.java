package com.changsha.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.changsha.pojo.ItripUser;
import com.changsha.mapper.ItripUserMapper;
import com.changsha.service.ItripUserService;
@Service
public class ItripUserServiceImpl extends ServiceImpl<ItripUserMapper, ItripUser> implements ItripUserService{

    @Autowired
    ItripUserMapper userMapper;

    @Override
    public List<ItripUser> QueryUser() {
        return userMapper.QueryUser();
    }

}
