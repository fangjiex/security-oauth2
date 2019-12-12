package org.rain.oauth2.server.dao;

import org.apache.ibatis.annotations.Param;
import org.rain.oauth2.server.entity.TbPermission;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbPermissionMapper extends Mapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}