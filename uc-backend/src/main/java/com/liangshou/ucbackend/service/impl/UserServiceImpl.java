package com.liangshou.ucbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liangshou.ucbackend.service.UserService;
import com.liangshou.ucbackend.model.domain.User;
import com.liangshou.ucbackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author X-L-S
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-11-05 21:19:05
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




