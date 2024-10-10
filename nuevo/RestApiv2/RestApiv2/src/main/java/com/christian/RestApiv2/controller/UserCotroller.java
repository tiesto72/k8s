package com.christian.RestApiv2.controller;

import com.christian.RestApiv2.Interface.UserRepository;
import com.christian.RestApiv2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/user")
public class UserCotroller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public User add(@RequestBody User val){
        return userRepository.save(val);
    }

    @GetMapping("/views")
    public List<User> views(){
        return userRepository.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<User> views(@PathVariable Integer val){
        return userRepository.findById(val);
    }

    @PutMapping("/update")
    public User wiews(@RequestBody User val){
        return userRepository.save(val);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer val){
        userRepository.deleteById(val);
        return "Id : "+val+ "delete";
    }

}
