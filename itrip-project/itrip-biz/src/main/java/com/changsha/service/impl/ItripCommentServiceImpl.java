package com.changsha.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.changsha.pojo.ItripComment;
import com.changsha.mapper.ItripCommentMapper;
import com.changsha.service.ItripCommentService;
@Service
public class ItripCommentServiceImpl extends ServiceImpl<ItripCommentMapper, ItripComment> implements ItripCommentService{

}
