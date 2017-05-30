package com.lisk.framework.demo.mapper;

import com.lisk.framework.demo.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zuoch on 2017/5/30.
 */
public interface UserMapper {

    public List<User> findAll();

    public int insertUser(User user);

    @Select("select * from t_user where id = #{id}")
    public User findById(Long id);

}
