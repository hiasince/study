package com.example.demo.domain.board;

import lombok.*;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
public class V1_0SearchBoard {
    int boardId;
    String createUser;
    ZonedDateTime startSearchDateTime;
    ZonedDateTime endSearchDateTime;
}
