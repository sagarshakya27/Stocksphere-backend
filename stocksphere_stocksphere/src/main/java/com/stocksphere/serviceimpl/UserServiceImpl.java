package com.stocksphere.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocksphere.entity.User;
import com.stocksphere.repository.UserRepository;
import com.stocksphere.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }
}