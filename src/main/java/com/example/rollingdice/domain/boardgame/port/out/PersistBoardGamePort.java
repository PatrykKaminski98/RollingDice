package com.example.rollingdice.domain.boardgame.port.out;

import com.example.rollingdice.domain.boardgame.model.BoardGame;

public interface PersistBoardGamePort {
    void persist(BoardGame boardGame);
}
