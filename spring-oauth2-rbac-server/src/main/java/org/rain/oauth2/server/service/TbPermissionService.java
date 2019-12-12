package org.rain.oauth2.server.service;

import org.rain.oauth2.server.entity.TbPermission;

import java.util.List;

public interface TbPermissionService {
    List<TbPermission> selectByUserId(Long userId);
}
