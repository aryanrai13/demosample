package com.jpa.demosample.repository;

import com.jpa.demosample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepository extends JpaRepository<Users, Long> {


    Users findByName(String name);

    Users findBySalary(Integer salary);
}
