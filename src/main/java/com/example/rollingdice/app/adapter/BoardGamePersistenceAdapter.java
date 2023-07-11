package com.example.rollingdice.app.adapter;

import com.example.rollingdice.app.entity.BoardGameEntity;
import com.example.rollingdice.app.repository.BoardGameRepository;
import com.example.rollingdice.domain.boardgame.model.BoardGame;
import com.example.rollingdice.domain.boardgame.port.out.FindAllBoardGamesPort;
import com.example.rollingdice.domain.boardgame.port.out.PersistBoardGamePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
@RequiredArgsConstructor
public class BoardGamePersistenceAdapter implements FindAllBoardGamesPort, PersistBoardGamePort {
    private final BoardGameRepository boardGameRepository;
    private final BoardGameEntityMapper boardGameEntityMapper;

    @Override
    public List<BoardGameEntity> findAllGames() {
        return null;
    }

    @Override
    public void persist(BoardGame boardGame) {
        boardGameRepository.save(mapToEntity(boardGame));
    }

    private BoardGameEntity mapToEntity(BoardGame boardGame){
        Optional<BoardGameEntity> boardGameEntity = boardGameRepository.findById(boardGame.getId());
        if(boardGameEntity.isPresent()){
            return boardGameEntityMapper.updateEntity(boardGame, boardGameEntity.get());
        } else {
            return boardGameEntityMapper.mapToEntity(boardGame);
        }
    }

    private BoardGame mapToDomain(BoardGameEntity boardGame){
        return boardGameEntityMapper.mapToDomain(boardGame);

    }
}
