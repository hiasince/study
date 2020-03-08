package com.example.demo.domain.board;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class V1_0CreateBoardResponse {
    private Boolean isSuccess;
    private int boardId;
}
