package com.igriss.AXEL.repositories;

import com.igriss.AXEL.entities.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RateRepository extends JpaRepository<Rate, UUID> {
}