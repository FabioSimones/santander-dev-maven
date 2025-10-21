package dev.fabiosimones.santander_dev.domain.service;

import dev.fabiosimones.santander_dev.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
