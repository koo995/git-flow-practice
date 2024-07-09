package example.test.service;

import example.test.domain.User;
import example.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void login(User user) {
        userRepository.save(user);
    }
}
