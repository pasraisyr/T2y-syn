package com.example.tuition.registered;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registered")
public class RegisteredController {

    @Autowired
    private RegisteredService registeredService;

    @GetMapping
    public List<Registered> getAllRegistered() {
        return registeredService.getAllRegistered();
    }

    @GetMapping("/{id}")
    public Registered getRegisteredById(@PathVariable Long id) {
        return registeredService.getRegisteredById(id).orElse(null);
    }

    @PostMapping
    public Registered createRegistered(@RequestBody Registered registered) {
        return registeredService.saveRegistered(registered);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistered(@PathVariable Long id) {
        registeredService.deleteRegistered(id);
    }
}
