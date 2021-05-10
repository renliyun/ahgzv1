package com.ahgz.service.impl;

import com.ahgz.entity.User;
import com.ahgz.mapper.UserMapper;
import com.ahgz.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author renlirong
 * @since 2021-05-10
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

}
