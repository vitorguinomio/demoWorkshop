package com.vitorguinomio.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.vitorguinomio.demo.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
