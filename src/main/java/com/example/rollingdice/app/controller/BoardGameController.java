package com.example.rollingdice.app.controller;

import com.example.rollingdice.app.entity.BoardGameEntity;
import com.example.rollingdice.app.repository.BoardGameRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BoardGameController {

    private final BoardGameRepository boardGameRepository;

    public BoardGameController(BoardGameRepository boardGameRepository) {
        this.boardGameRepository = boardGameRepository;
    }

    @GetMapping("/list")
    public ResponseEntity<List<BoardGameEntity>> listAllGames (){
        List<BoardGameEntity> gameList = boardGameRepository.findAll();
        return ResponseEntity.ok(gameList);
    }

    @GetMapping("/search")
    public ResponseEntity<List<BoardGameEntity>> search (@RequestParam String param){
        List<BoardGameEntity> gameList = boardGameRepository.findAll();
        return ResponseEntity.ok(gameList);
    }

}
