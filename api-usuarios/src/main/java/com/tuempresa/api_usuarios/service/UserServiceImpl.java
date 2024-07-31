package com.tuempresa.api_usuarios.service;

import com.tuempresa.api_usuarios.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    private final Map<Long, User> userDatabase = new HashMap<>();
    private Long idCounter = 1L;

    @Override
    public User createUser(User user) {
        user.setId(idCounter++);
        userDatabase.put(user.getId(), user);
        return user;
    }

    @Override
    public User getUserById(Long id) {
        return userDatabase.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userDatabase.values());
    }

    @Override
    public User updateUser(Long id, User user) {
        if (userDatabase.containsKey(id)) {
            user.setId(id);
            userDatabase.put(id, user);
            return user;
        }
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userDatabase.remove(id) != null;
    }
}
