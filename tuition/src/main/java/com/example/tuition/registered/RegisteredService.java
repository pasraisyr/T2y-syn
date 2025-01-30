package com.example.tuition.registered;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisteredService {

    @Autowired
    private RegisteredRepository registeredRepository;

    public List<Registered> getAllRegistered() {
        return registeredRepository.findAll();
    }

    public Optional<Registered> getRegisteredById(Long id) {
        return registeredRepository.findById(id);
    }

    public Registered saveRegistered(Registered registered) {
        return registeredRepository.save(registered);
    }

    public void deleteRegistered(Long id) {
        registeredRepository.deleteById(id);
    }
}
