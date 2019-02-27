package com.duo.service.Impl;

import com.duo.dao.UserDao;
import com.duo.domain.TbUser;
import com.duo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<TbUser> selectAllUser(){
        List<TbUser> userList=userDao.selectAllUser();
        return userList;
    }
}
