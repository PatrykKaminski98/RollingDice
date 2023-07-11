package com.example.rollingdice.app.adapter;

import com.example.rollingdice.app.entity.BoardGameEntity;
import com.example.rollingdice.domain.boardgame.model.BoardGame;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface BoardGameEntityMapper {
    BoardGameEntity mapToEntity(BoardGame boardGame);
    BoardGameEntity updateEntity(BoardGame boardGame, @MappingTarget BoardGameEntity boardGameEntity);

    BoardGame mapToDomain(BoardGameEntity boardGameEntity);
}
