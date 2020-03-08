package com.example.demo.converter;

import com.example.demo.domain.board.*;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class BoardConverter {

    public V1_0Board toV1_0Board(V1_0CreateBoardRequest boardRequest) {
        return V1_0Board.builder()
                .content(boardRequest.getContent())
                .createUser(boardRequest.getCreateUser())
                .build();
    }

    public V1_0Board toV1_0Board(Board board) {
        return V1_0Board.builder()
                .content(board.getContent())
                .createDateTime(board.getCreateDateTime())
                .createUser(board.getCreateUser())
                .boardId(board.getBoardId())
                .build();
    }

    public Collection<V1_0Board> toV1_0Boards(Collection<Board> boards) {
        return boards.stream().map(this::toV1_0Board).collect(Collectors.toList());
    }

    public V1_0SearchBoard toSearchBoard(V1_0GetBoardRequest getBoardRequest) {
        return V1_0SearchBoard.builder().build();
    }
}
