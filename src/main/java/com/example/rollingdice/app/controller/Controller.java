package com.example.rollingdice.app.controller;

import com.example.rollingdice.app.entity.BoardGame;
import com.example.rollingdice.app.repository.BoardGameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class Controller {

    private final BoardGameRepository boardGameRepository;

    @RequestMapping("/list")
    public String sayHello (){
        List<String> titles = boardGameRepository.findAll()
                .stream()
                .map(BoardGame::getTitle)
                .toList();
        return titles.toString();
    }
}
