package com.jpa.demosample.controller;

import com.jpa.demosample.model.Users;
import com.jpa.demosample.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
     @Autowired
     private UserJpaRepository userJpaRepository;

    /* @GetMapping(value = "/{name}")
          public Users findByName(@PathVariable final String name) {
          return userJpaRepository.findByName(name);
     } */

     @GetMapping(value = "/{salary}")
     public Users findbysalary(@PathVariable final Integer salary) {
          return userJpaRepository.findBySalary(salary);
     }

     @GetMapping(value = "/all")
      public List<Users> findAll() {
          return userJpaRepository.findAll();
     }

     @PostMapping(value = "/load")
     public Users load(@RequestBody final Users users) {
           userJpaRepository.save(users);
          return userJpaRepository.findByName(users.getName());
     }


}
