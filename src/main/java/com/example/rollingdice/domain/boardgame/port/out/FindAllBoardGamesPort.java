package com.example.rollingdice.domain.boardgame.port.out;

import com.example.rollingdice.app.entity.BoardGameEntity;

import java.util.List;

public interface FindAllBoardGamesPort {
    List<BoardGameEntity> findAllGames();
}
