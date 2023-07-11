package com.example.rollingdice.domain.boardgame.model;

import com.example.rollingdice.domain.AggregateRoot;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardGame implements AggregateRoot<Long> {
    private Long id;
    private String title;
    private Integer maxAmountOfPlayers;
    private Integer minAmountOfPlayers;
}
