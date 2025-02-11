package com.example.crudapi.repository;

import com.example.crudapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    //CRUD -Create (save()) Read (findBy()) Update (save(), patch()) and Delete (delete())

}
