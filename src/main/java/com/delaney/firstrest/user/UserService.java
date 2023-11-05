package com.delaney.firstrest.user;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User get(final Long id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    public User create(final User user) {
        return userRepository.save(user);
    }

    public void update(final Long id, final User user) {
        final User existingUser = userRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        userRepository.save(user);
    }

    public void delete(final Long id) {
        userRepository.deleteById(id);
    }
}
