package com.zxq.service;

import com.zxq.model.User;

/**
 * Created by zhou on 2018/7/2.
 */
public interface IUserService {

    User getByUserName(String userName);

    Integer add(User user);
}
