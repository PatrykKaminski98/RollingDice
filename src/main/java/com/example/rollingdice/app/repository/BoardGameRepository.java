package com.example.rollingdice.app.repository;

import com.example.rollingdice.app.entity.BoardGameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardGameRepository extends JpaRepository<BoardGameEntity, Long> {
}
