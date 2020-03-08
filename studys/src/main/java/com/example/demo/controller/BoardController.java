package com.example.demo.controller;

import com.example.demo.converter.BoardConverter;
import com.example.demo.domain.board.*;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collection;

@RestController
public class BoardController {
    private BoardService boardService;

    private BoardConverter boardConverter;

    @Autowired
    public BoardController(BoardService boardService, BoardConverter boardConverter) {
        this.boardService = boardService;
        this.boardConverter = boardConverter;
    }

    @PostMapping("/v1.0/boards")
    public V1_0CreateBoardResponse createBoard(@Valid V1_0CreateBoardRequest createBoardRequest) {
        int boardId = boardService.createBoard(boardConverter.toV1_0Board(createBoardRequest));

        return V1_0CreateBoardResponse.builder()
                .isSuccess(true)
                .boardId(boardId)
                .build();
    }

    @GetMapping("/v1.0/boards")
    public V1_0GetBoardResponse getBoard(V1_0GetBoardRequest getBoardRequest) {
        Collection<V1_0Board> boards = boardService.getBoard(boardConverter.toSearchBoard(getBoardRequest));

        return V1_0GetBoardResponse.builder()
                .isSuccess(true)
                .boards(boards).build();
    }


}
