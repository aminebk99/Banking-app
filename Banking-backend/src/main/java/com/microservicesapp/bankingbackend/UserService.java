package com.microservicesapp.bankingbackend;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User saveUsers(User user){
        return userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public String LoginUsers(User user){
        Optional<User> existUser = userRepository.findByEmail(user.getEmail());
        if (existUser.isPresent()){
            return "user logged";
        }
        return "user not logged";
    }
}
