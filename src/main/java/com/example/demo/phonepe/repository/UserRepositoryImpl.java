package com.example.demo.phonepe.repository;

import com.example.demo.phonepe.model.User;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

    private Map<Long, User> users;

    @Override
    public User createUser(final User user) {
        Long newId =(long) users.size();
        User newUser = new User(newId, user.getName());
        users.put(newId,user);
        return newUser;
    }

    @Override
    public User getUser(Long userId) {
        if(users.containsKey(userId)) {
            return users.get(userId);
        }
        throw new RuntimeException("User not found with id:"+ userId);
    }
    
}