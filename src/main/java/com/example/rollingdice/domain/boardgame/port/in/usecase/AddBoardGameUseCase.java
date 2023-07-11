package com.example.rollingdice.domain.boardgame.port.in.usecase;

import com.example.rollingdice.domain.boardgame.port.in.AddBoardGameCommand;

public interface AddBoardGameUseCase {
    void apply(AddBoardGameCommand command);
}
