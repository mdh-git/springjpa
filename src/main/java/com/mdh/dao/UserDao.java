package com.mdh.dao;

import com.mdh.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mdh on 2018/7/11.
 */
public interface UserDao extends CrudRepository<User,Long> {

    //使用注解的方式
    @Select("select * from t_user where name like concat('%',#{name},'%')")
    public User findByUserName(String name);

    @Select("select * from t_user where id = #{id}")
    public User findById(int id);

    //使用xml的方式
    public List<User> getAll();
}
