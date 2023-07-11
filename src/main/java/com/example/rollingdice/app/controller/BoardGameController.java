package com.example.rollingdice.app.controller;

import com.example.rollingdice.app.entity.BoardGameEntity;
import com.example.rollingdice.app.repository.BoardGameRepository;
import com.example.rollingdice.domain.boardgame.port.in.AddBoardGameCommand;
import com.example.rollingdice.domain.boardgame.port.in.usecase.AddBoardGameUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class BoardGameController {
    private final BoardGameRepository boardGameRepository;
    private final AddBoardGameUseCase addBoardGameUseCase;

    @GetMapping("/list")
    public ResponseEntity<List<BoardGameEntity>> listAllGames (){
        List<BoardGameEntity> allBoardGames = boardGameRepository.findAll();
        return ResponseEntity.ok(allBoardGames);
    }

    @GetMapping("/add")
    public ResponseEntity<?> search (@RequestParam String title){
        AddBoardGameCommand addBoardGameCommand = AddBoardGameCommand.builder().title(title).build();
        addBoardGameUseCase.apply(addBoardGameCommand);
        return ResponseEntity.ok().build();
    }

}
