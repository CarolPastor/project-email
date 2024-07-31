package next.school.cesar.project_email.controllers;


import next.school.cesar.project_email.entities.UserEntity;
import next.school.cesar.project_email.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;



@Validated 
@RestController
public class UserController {
	
	@Autowired
    private UserRepository userRepository;
   

    @PostMapping("/createUser")
    public UserEntity createUser(@Valid @RequestBody UserEntity user) {
       
        UserEntity UserInclude = userRepository.save(user);
        return UserInclude;
    }
}