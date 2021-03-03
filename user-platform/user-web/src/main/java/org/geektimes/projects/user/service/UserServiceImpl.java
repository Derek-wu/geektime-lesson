package org.geektimes.projects.user.service;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.UserRepository;

public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    @Override
    public boolean register(User user) {
        if (queryUserById(user.getId()) != null) {
            return false;
        }
        return userRepository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }
}
