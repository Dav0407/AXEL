package com.igriss.AXEL.repositories;

import com.igriss.AXEL.entities.GameType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GameTypeRepository extends JpaRepository<GameType, UUID> {
}