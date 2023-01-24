package com.learn.springbootwebfluxlearning.service;

import com.learn.springbootwebfluxlearning.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    void create(User user);

    Mono<User> findById(Integer id);

    Flux<User> findAll();

    Flux<User> findAllByName(final String firstname);

    Mono<User> update(User user);

    Mono<Void> delete(Integer id);
}
