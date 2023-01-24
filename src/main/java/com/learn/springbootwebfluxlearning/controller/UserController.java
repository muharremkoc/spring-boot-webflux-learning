package com.learn.springbootwebfluxlearning.controller;

import com.learn.springbootwebfluxlearning.domain.User;
import com.learn.springbootwebfluxlearning.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webflux/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public void create(@RequestBody User user){
        userService.create(user);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mono<User>> findById(@PathVariable("id") Integer id) {
        Mono<User> user = userService.findById(id);
        return new ResponseEntity<Mono<User>>(user, HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> findAll() {
        Flux<User> emps = userService.findAll();
        return emps;
    }

    @GetMapping(value = "/name/{firstname}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> findAllByFirstName(@PathVariable String firstname) {
        Flux<User> emps = userService.findAllByName(firstname);
        return emps;
    }

    @PutMapping(value = "/update")
    @ResponseStatus(HttpStatus.OK)
    public Mono<User> update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping(value = "/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        userService.delete(id).subscribe();
    }

}
