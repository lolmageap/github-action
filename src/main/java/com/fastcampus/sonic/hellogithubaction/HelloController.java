package com.fastcampus.sonic.hellogithubaction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.of(Optional.of("Hello, Github Actions"));
    }

    @GetMapping(value = "/bye")
    public ResponseEntity<String> bye() {
        return ResponseEntity.of(Optional.of("Bye, Github Actions"));
    }

    @GetMapping(value = "/push")
    public ResponseEntity<String> push() {
        return ResponseEntity.of(Optional.of("Push, Github Actions"));
    }

}
