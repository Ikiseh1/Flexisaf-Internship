package com.ikiseh.flexisaf_internship.task_3.service_layer;

import com.ikiseh.flexisaf_internship.task_3.persistence_layer.User;
import com.ikiseh.flexisaf_internship.task_3.persistence_layer.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // CREATE
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // READ all
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // READ one
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // DELETE
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

