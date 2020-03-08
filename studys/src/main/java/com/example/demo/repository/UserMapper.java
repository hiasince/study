package com.example.demo.repository;

import com.example.demo.domain.user.User;

public interface UserMapper {
    int createUser(User user);

    User getUser();
}
