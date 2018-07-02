package com.zxq.service.impl;

import com.zxq.mapper.UserMapper;
import com.zxq.model.User;
import com.zxq.model.UserExample;
import com.zxq.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhou on 2018/7/2.
 */
@Service
public class UserService implements IUserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User getByUserName(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<User> userList = userMapper.selectByExample(example);
        if (!userList.isEmpty()){
            return userList.get(0);
        }
        return null;
    }

    @Override
    public Integer add(User user) {
        return userMapper.insertSelective(user);
    }
}
