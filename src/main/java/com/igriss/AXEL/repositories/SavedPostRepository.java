package com.igriss.AXEL.repositories;

import com.igriss.AXEL.entities.SavedPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SavedPostRepository extends JpaRepository<SavedPost, UUID> {
}