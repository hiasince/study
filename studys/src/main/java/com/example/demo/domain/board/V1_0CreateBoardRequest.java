package com.example.demo.domain.board;

import lombok.*;

import javax.validation.constraints.Max;

@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
public class V1_0CreateBoardRequest {
    @Max(value = 1000, message = "글이 너무 길어요. ( 최대 1000 자)")
    String content;
    String createUser;
}
