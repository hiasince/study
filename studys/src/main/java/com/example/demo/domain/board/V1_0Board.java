package com.example.demo.domain.board;

import lombok.*;

import java.time.ZonedDateTime;
import java.util.Collection;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class V1_0Board {
    int boardId;
    String content;
    String createUser;
    ZonedDateTime createDateTime;
    Collection<Comment> comments;
}
