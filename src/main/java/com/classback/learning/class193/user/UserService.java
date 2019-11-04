package com.classback.learning.class193.user;

import com.classback.learning.class193.model.UserDomain;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
