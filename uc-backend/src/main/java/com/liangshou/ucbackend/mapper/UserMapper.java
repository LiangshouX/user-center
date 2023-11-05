
package com.liangshou.ucbackend.mapper;

import com.liangshou.ucbackend.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
* @author X-L-S
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2023-11-05 21:19:05
* @Entity generator.domain.User
*/

@Repository
public interface UserMapper extends BaseMapper<User> {

}




