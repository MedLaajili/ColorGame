package com.Laajili.ColorGame.api;

import com.Laajili.ColorGame.Model.User;
import com.Laajili.ColorGame.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("user/save")
    public ResponseEntity<User>saveUser(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.saveUser(user));
    }
}
