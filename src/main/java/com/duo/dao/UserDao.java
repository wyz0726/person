package com.duo.dao;

import com.duo.domain.TbUser;

import java.util.List;

public interface UserDao {
    List<TbUser> selectAllUser();
}
