package com.example.rollingdice.domain.boardgame.port.in;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class AddBoardGameCommand {
    String title;
}
