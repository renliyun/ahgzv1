package com.ahgz.service.impl;

import com.ahgz.entity.Address;
import com.ahgz.mapper.AddressMapper;
import com.ahgz.service.IAddressService;
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
public class AddressService extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
