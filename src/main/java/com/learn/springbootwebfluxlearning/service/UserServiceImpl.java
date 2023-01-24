package com.learn.springbootwebfluxlearning.service;

import com.learn.springbootwebfluxlearning.domain.User;
import com.learn.springbootwebfluxlearning.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService{

    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(User user) {
          userRepository.save(user).subscribe();
    }

    @Override
    public Mono<User> findById(Integer id) {
        return userRepository.findById(id);
    }
    @Override
    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Flux<User> findAllByName(String firstname) {
        return userRepository.findByFirstname(firstname);
    }

    @Override
    public Mono<User> update(User user) {
        return userRepository.save(user);
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return userRepository.deleteById(id);
    }
}
