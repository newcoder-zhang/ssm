package com.huawei.dao;

import com.huawei.model.User;
import org.springframework.stereotype.Repository;


public interface IUserDao {
    public User selectUserById(int userId);
}
