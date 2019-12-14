package org.rain.oauth2.resource.service.impl;

import org.rain.oauth2.resource.dao.TbContentCategoryMapper;
import org.rain.oauth2.resource.service.TbContentCategoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
