package com.igriss.AXEL.repositories;

import com.igriss.AXEL.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}