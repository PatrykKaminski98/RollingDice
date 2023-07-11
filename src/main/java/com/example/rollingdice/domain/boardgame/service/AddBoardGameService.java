package com.example.rollingdice.domain.boardgame.service;

import com.example.rollingdice.domain.boardgame.port.out.PersistBoardGamePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddBoardGameService {
    private final PersistBoardGamePort persistBoardGamePort;

}
