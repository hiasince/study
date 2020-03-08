package com.example.demo.domain.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class V1_0GetBoardResponse {
    Boolean isSuccess;
    Collection<V1_0Board> boards;
}
