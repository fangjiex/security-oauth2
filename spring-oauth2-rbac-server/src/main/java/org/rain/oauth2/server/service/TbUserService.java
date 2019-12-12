package org.rain.oauth2.server.service;

import org.rain.oauth2.server.entity.TbUser;

public interface TbUserService {
    TbUser getByUsername(String username);
}
