package com.ahgz.service.impl;

import com.ahgz.entity.Category;
import com.ahgz.mapper.CategoryMapper;
import com.ahgz.service.ICategoryService;
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
public class CategoryService extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
