package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HelloController {

    private final ResourceRepository repository;

    public HelloController(ResourceRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/resources")
    public Resource addResource(@RequestBody Resource resource) {
        return repository.save(resource);
    }

    @GetMapping("/resources")
    public List<Resource> getResources() {
        return repository.findAll();
    }
}