package org.kurganov.serverapi.service;

import org.kurganov.serverapi.entity.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    Users findByUserName(String userName);

}
