package com.zzw.service;

import com.zzw.domain.User;

import java.util.List;

public interface UserLoginService {
    List<User> user_login() throws Exception;
}
