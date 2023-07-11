package com.example.rollingdice.domain.boardgame.service;

import com.example.rollingdice.domain.boardgame.model.BoardGame;
import com.example.rollingdice.domain.boardgame.port.in.AddBoardGameCommand;
import com.example.rollingdice.domain.boardgame.port.in.usecase.AddBoardGameUseCase;
import com.example.rollingdice.domain.boardgame.port.out.PersistBoardGamePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddBoardGameService implements AddBoardGameUseCase {
    private final PersistBoardGamePort persistBoardGamePort;

    @Override
    public void apply(AddBoardGameCommand command) {
        BoardGame boardGame = BoardGame.builder().title(command.getTitle())
                .build();
        persistBoardGamePort.persist(boardGame);
    }
}
