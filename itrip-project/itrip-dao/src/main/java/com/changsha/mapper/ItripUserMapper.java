package com.changsha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.changsha.pojo.ItripUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ItripUserMapper extends BaseMapper<ItripUser> {

   public List<ItripUser> QueryUser();

}