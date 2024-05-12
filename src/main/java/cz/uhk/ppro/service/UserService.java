package cz.uhk.ppro.service;

import cz.uhk.ppro.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUsername(String username);

    void save(User user);
}
