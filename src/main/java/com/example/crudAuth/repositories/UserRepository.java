package com.example.crudAuth.repositories;

import com.example.crudAuth.collections.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    public User getUserByUserName(@Param("userName") String userName);
}
