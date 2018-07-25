package com.mdh.service.impl;

import com.mdh.dao.UserDao;
import com.mdh.pojo.User;
import com.mdh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mdh on 2018/7/11.
 */
@Service(value = "IUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
