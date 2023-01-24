package com.learn.springbootwebfluxlearning.repository;

import com.learn.springbootwebfluxlearning.domain.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User,Integer> {

    @Query("{ 'firstname': ?0 }")
    Flux<User> findByFirstname(final String firstname);

}
