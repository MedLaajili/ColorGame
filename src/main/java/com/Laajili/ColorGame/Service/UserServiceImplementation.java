package com.Laajili.ColorGame.Service;

import com.Laajili.ColorGame.Model.User;
import com.Laajili.ColorGame.Model.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplementation implements UserService{
    private final UserRepo userRepo;
    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to the database",user.getEmail());
        return userRepo.save(user);
    }
}
