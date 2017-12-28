package com.huawei.service.impl;

import com.huawei.dao.IUserDao;
import com.huawei.model.User;
import com.huawei.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    public IUserDao userDao;
    @Override
    public User getUser(int userId) {

        return userDao.selectUserById(userId);
    }
}
