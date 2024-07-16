package example.test.controller;

import example.test.domain.User;
import example.test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;



    @PostMapping("/login")
    public void login(User user) {
        userService.login(user);
    }

    @PostMapping("/login2")
    public void login2(User user) {
        userService.login(user);
    }
}
