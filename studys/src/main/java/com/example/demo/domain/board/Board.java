package com.example.demo.domain.board;

import lombok.*;

import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class Board {
    int boardId;
    String content;
    String createUser;
    ZonedDateTime createDateTime;
}
