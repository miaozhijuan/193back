package com.classback.learning.class193.dao;


import com.classback.learning.class193.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}