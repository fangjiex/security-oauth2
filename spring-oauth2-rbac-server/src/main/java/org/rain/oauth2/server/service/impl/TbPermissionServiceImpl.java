package org.rain.oauth2.server.service.impl;

import org.rain.oauth2.server.dao.TbPermissionMapper;
import org.rain.oauth2.server.entity.TbPermission;
import org.rain.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
