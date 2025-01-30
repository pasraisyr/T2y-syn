package com.example.tuition.registered;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisteredRepository extends JpaRepository<Registered, Long> {
}
