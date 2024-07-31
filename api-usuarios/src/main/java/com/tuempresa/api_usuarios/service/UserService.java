package com.tuempresa.api_usuarios.service;

import com.tuempresa.api_usuarios.model.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    boolean deleteUser(Long id);
}
